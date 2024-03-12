package org.springframework.security.web.util;

public class RegexRequestMatcher implements RequestMatcher{


    @Override
    public boolean matches(javax.servlet.http.HttpServletRequest request) {
        throw new RuntimeException("the original implementation of this class has security issues");
    }
}
