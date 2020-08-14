INSERT INTO satisfaction (NAME) VALUES ('Excellent');
INSERT INTO satisfaction (NAME) VALUES ('Good');
INSERT INTO satisfaction (NAME) VALUES ('Horrible');
INSERT INTO satisfaction (NAME) VALUES ('Bad');

INSERT INTO race (name) VALUES ('Asian Indian');
INSERT INTO race (name) VALUES ('Chinese');
INSERT INTO race (name) VALUES ('Filipino');
INSERT INTO race (name) VALUES ('Japanese');
INSERT INTO race (name) VALUES ('Korean');
INSERT INTO race (name) VALUES ('Vietnamese');
INSERT INTO race (name) VALUES ('Native Hawaiian');
INSERT INTO race (name) VALUES ('Guamanian or Chamorro');
INSERT INTO race (name) VALUES ('Samoan');
INSERT INTO race (name) VALUES ('Other Pacific Islander');

INSERT INTO gender (name) VALUES ('Male');
INSERT INTO gender (name) VALUES ('Female');
INSERT INTO gender (name) VALUES ('Other');

INSERT INTO role (name) VALUES ('ROLE_ADMIN');
INSERT INTO role (name) VALUES ('ROLE_WEB_USER');
INSERT INTO role (name) VALUES ('ROLE_DASHBOARD');
INSERT INTO role (name) VALUES ('ROLE_MOBILE');

INSERT INTO user (first_NAME, EMAIL, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, LATITUDE, LONGITUDE, RACE_ID, GENDER_ID, DATE_REGISTERED, DOB, PASSWORD, USER_NAME, ACCOUNT_TYPE) VALUES ('User', 'uOne@gmail.com', 'One', 'Imagine Design Develop', '123 Street Name', 'Las Vegas', 'Nevada', '89111', 'USA', '(777) 777-7777', '36332332', '3232323', 1, 1,1587014060, 1587014060, '$2a$10$B0XBAyOVq70x3Z10rACDc.vgLizwUXHC3wQeP/3HXNl4sQ/UBdTIy', 'userOne', 'free');
INSERT INTO user (first_NAME, EMAIL, LAST_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, LATITUDE, LONGITUDE, RACE_ID, GENDER_ID, DATE_REGISTERED, DOB, PASSWORD, USER_NAME) VALUES ('User', 'uTwo@gmail.com', 'Two', '123 Street Name', 'Las Vegas', 'Nevada', '89111', 'USA', '(777) 777-7777', '36332332', '3232323', 1, 1, 1587014060, 1587014060, '$2a$10$B0XBAyOVq70x3Z10rACDc.vgLizwUXHC3wQeP/3HXNl4sQ/UBdTIy', 'userTwo');
INSERT INTO user (first_NAME, EMAIL, LAST_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, LATITUDE, LONGITUDE, RACE_ID, GENDER_ID, DATE_REGISTERED, DOB, PASSWORD, USER_NAME) VALUES ('User', 'uThree@gmail.com', 'Three', '123 Street Name', 'Las Vegas', 'Nevada', '89111', 'USA', '(777) 777-7777', '36332332', '3232323', 1, 1, 1587014060, 1587014060, '$2a$10$B0XBAyOVq70x3Z10rACDc.vgLizwUXHC3wQeP/3HXNl4sQ/UBdTIy', 'userThree');

INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 1', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 2', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 3', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 4', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 5', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 6', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 7', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 8', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 9', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 10', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 11', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 12', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 13', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 1, '23323', '343434', 'https://pineappleapp.net');
INSERT INTO business (FIRST_NAME, LAST_NAME, BUSINESS_NAME, ADDRESS, CITY, STATE, ZIP_CODE, COUNTRY, PHONE_NUMBER, BUSINESS_SLOGAN, BUSINESS_DESCRIPTION, DATE_REGISTERED, FACEBOOK_LINK, INSTAGRAM_LINK, YELP_LINK, GOOGLE_LINK, CLOVER_LINK, SQUARE_LINK, USER_ID, LATITUDE, LONGITUDE, WEBSITE_LINK) VALUES ('Tim', 'Jackson', 'Business Name 13', '123 4th Stree', 'Las Vegas', 'NV', '89011', 'United States', '(777) 777-7777', 'Business Slogan 1', 'Business Description 1', 1587014060, '', '', 'https://www.yelp.com/', 'https://aboutme.google.com/u/0/?referer=gplus', 'https://www.clover.com/', 'https://squareup.com/us/en', 2, '23323', '343434', 'https://pineappleapp.net');

INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 2, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 2, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 2, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 2, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 2, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 1, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 1, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 2, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 2, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 2, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 2, 3, 1587014060);
INSERT INTO orders (user_ID, BUSINESS_ID, SATISFACTION_ID, ORDER_TIMESTAMP) VALUES (2, 2, 3, 1587014060);


INSERT INTO user_roles (USERS_ID, ROLES_ID) VALUES (1, 1);
INSERT INTO user_roles (USERS_ID, ROLES_ID) VALUES (1, 2);
INSERT INTO user_roles (USERS_ID, ROLES_ID) VALUES (1, 3);
INSERT INTO user_roles (USERS_ID, ROLES_ID) VALUES (2, 2);
INSERT INTO user_roles (USERS_ID, ROLES_ID) VALUES (2, 3);
INSERT INTO user_roles (USERS_ID, ROLES_ID) VALUES (3, 2);
