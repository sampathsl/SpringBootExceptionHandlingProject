/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.sampathsl.springboot.exceptionhandling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidRequestException extends RuntimeException {

    /**
     *
     * @author SAMPATH
     */
    private static final long serialVersionUID = 5990299497591013820L;

    public InvalidRequestException(String message) {
        super(message);
    }

}
