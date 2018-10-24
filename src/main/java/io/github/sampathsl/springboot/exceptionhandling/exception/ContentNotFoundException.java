/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** @author SAMPATH */
@ResponseStatus(HttpStatus.NO_CONTENT)
public class ContentNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 5990299497591013821L;

  public ContentNotFoundException(final String message) {
    super(message);
  }
}
