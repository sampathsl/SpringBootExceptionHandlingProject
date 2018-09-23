/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package io.github.sampathsl.springboot.exceptionhandling;

//import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
//import io.github.sampathsl.springboot.exceptionhandling.exception.ResourceNotFoundException;
//import io.github.sampathsl.springboot.exceptionhandling.model.ExceptionResponse;
//import javax.servlet.http.HttpServletRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author SAMPATH
 */
//@ControllerAdvice
//public class ExceptionHandlerControllerAdvice {

//    @ExceptionHandler(ResourceNotFoundException.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public @ResponseBody
//    ExceptionResponse handleResourceNotFound(final ResourceNotFoundException exception,
//            final HttpServletRequest request) {
//
//        ExceptionResponse error = new ExceptionResponse();
//        error.setErrorMessage(exception.getMessage());
//        error.callerURL(request.getRequestURI());
//
//        return error;
//    }
//
//    @ExceptionHandler(ShopServiceException.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public @ResponseBody
//    ExceptionResponse handleException(final ShopServiceException exception,
//            final HttpServletRequest request) {
//
//        ExceptionResponse error = new ExceptionResponse();
//        error.setErrorMessage(exception.getMessage());
//        error.callerURL(request.getRequestURI());
//
//        return error;
//    }

//     @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", request.getRequestURI());
//        mav.setViewName("error");
//        return mav;
//    }

//}
