package com.enviro.assessment.grad001.MukovhePat.WasteSorting.RestControllerAdvise;

import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Response.ResponseObject;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Exception.CategoryExistsException;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Exception.CategoryNotFoundException;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Exception.CategoryToDeleteNotFound;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({CategoryNotFoundException.class,CategoryToDeleteNotFound.class, CategoryExistsException.class})
    public ResponseObject errorHandler(Exception exception){
        return new ResponseObject(exception.getMessage());
    }


}
