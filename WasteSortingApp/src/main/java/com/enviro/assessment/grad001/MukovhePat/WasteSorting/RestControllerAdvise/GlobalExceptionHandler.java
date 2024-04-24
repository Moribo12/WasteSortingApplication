package com.enviro.assessment.grad001.MukovhePat.WasteSorting.RestControllerAdvise;

import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Dto.Response.ResponseObject;
import com.enviro.assessment.grad001.MukovhePat.WasteSorting.Exception.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({CategoryNotFoundException.class,
            CategoryToDeleteNotFound.class,
            CategoryExistsException.class,
            GuidelineToDeleteException.class,
            GuidelineByNameException.class,
            CreateGuidelineException.class,
            GuidelineNotFoundException.class,
            RecycleTipNotFoundException.class,
            RecycleTipToDeleteNotFound.class,
            RecycleTipUpdateException.class})
    public ResponseObject errorHandler(Exception exception){
        return new ResponseObject(exception.getMessage());
    }


}
