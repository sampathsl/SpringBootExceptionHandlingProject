/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.sampathsl.springboot.exceptionhandling.exception;

public class ParameterException extends RuntimeException {

  /** @author SAMPATH */
  private static final long serialVersionUID = 5490299497591013820L;

  public ParameterException(String msg) {
    super(msg);
  }
}
