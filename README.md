# Java Api Spring Security JWT

java-api-spring-security-jwt is a starter project I created that has Spring Security and JWT built in. Also has some Roles and Authorities implemented.

## Installation

1. Create a local database called **pa**
2. clone project, install dependencies and run the jar

```bash
git clone https://github.com/cbaston82/java-api-spring-security-jwt.git
```

```bash
cd java-api-spring-security-jwt
```

```bash
mvn clean install
```

```bash
java -jar target/javaApiSpringSecurityJwt.jar
```

## Usage

There is some test data seeded into the database at startup. This seeded data included are 3 users

1. userOne
2. userTwo
3. userThree

password for all is **password**

## Get a JWT token

Use Postman or the equivilant

POST

```bash
http://localhost:8080/api/v1/authentication
```

BODY

```bash
{
    "username": "userOne",
    "password": "password"
}
```

RESPONSE

```bash
{
    "jwt": "eyJhbGciOiJIUzI1NiJ9........."
}
```
