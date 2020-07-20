package com.toto.spring.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class CustomerErrorController implements ErrorController {
	private static final String PATH = "templates/"; // configure 에서 Redirect 될 path

    @RequestMapping(value = PATH)
    public String error(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (String.valueOf(status).equalsIgnoreCase(HttpStatus.NOT_FOUND.toString())) {
            return "404.jsp";
        }
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
