/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.sampathsl.springboot.exceptionhandling.exception;

public class InvalidTokenException extends SecurityException {

  /** @author SAMPATH */
  private static final long serialVersionUID = 5890299497591013820L;

  public InvalidTokenException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public InvalidTokenException(String msg) {
    super(msg);
  }
}
