package de.jbellmann.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String handleException(Exception e){
        e.printStackTrace();
        return "error/404";
    }
}
