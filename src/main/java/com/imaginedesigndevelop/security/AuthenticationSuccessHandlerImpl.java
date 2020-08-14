package com.imaginedesigndevelop.security;

import com.imaginedesigndevelop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;
import java.util.Set;

@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Autowired
    HttpSession session;

    @Autowired
    UserService userService;

    private static final Logger logger =
        LoggerFactory.getLogger(AuthenticationSuccessHandlerImpl.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
        throws IOException, ServletException {
        String userName = "";
        Integer userId = null;

        if (authentication.getPrincipal() instanceof Principal) {
            userName = ((Principal) authentication.getPrincipal()).getName();
        } else {
            userName = ((User) authentication.getPrincipal()).getUsername();
            com.imaginedesigndevelop.model.User u = userService.findByUsername(userName);
            userId = u.getId();
        }

        session.setAttribute("userName", userName);
        session.setAttribute("userId", userId);

        Set<String> roles =
            AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect("admin");
        } else if (roles.contains("ROLE_WEB_USER") && !roles.contains(
            "ROLE_ADMIN") && !roles.contains("ROLE_DASHBOARD")) {
            response.sendRedirect("/businesses");
        } else if (roles.contains("ROLE_DASHBOARD") && !roles.contains(
            "ROLE_ADMIN")) {
            response.sendRedirect("dashboard");
        } else {
            response.sendRedirect("/");
        }
    }
}