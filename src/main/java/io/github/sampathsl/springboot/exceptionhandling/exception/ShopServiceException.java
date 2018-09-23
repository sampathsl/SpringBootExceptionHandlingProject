/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.exception;

/** @author SAMPATH */
public class ShopServiceException extends Exception {

  private static final long serialVersionUID = 5970299497591013820L;

  public ShopServiceException() {
    super();
  }

  public ShopServiceException(final String message) {
    super(message);
  }
}
