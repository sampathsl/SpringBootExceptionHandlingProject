/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.exception;

/**
 *
 * @author SAMPATH
 */
public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = 5590299497591013820L;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }

}
