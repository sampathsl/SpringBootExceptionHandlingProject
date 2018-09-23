/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.controller;

import io.github.sampathsl.springboot.exceptionhandling.model.ExceptionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/** @author SAMPATH */
@Controller
public class CommonErrorController implements ErrorController {

  @Autowired private ErrorAttributes errorAttributes;

  public void setErrorAttributes(ErrorAttributes errorAttributes) {
    this.errorAttributes = errorAttributes;
  }

  @RequestMapping(value = "error")
  @ResponseBody
  public ExceptionResponse error(WebRequest webRequest, HttpServletResponse response) {
    return new ExceptionResponse(response.getStatus(), getErrorAttributes(webRequest));
  }

  @Override
  public String getErrorPath() {
    return "error";
  }

  private Map<String, Object> getErrorAttributes(WebRequest webRequest) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.putAll(errorAttributes.getErrorAttributes(webRequest, false));
    return errorMap;
  }
}
