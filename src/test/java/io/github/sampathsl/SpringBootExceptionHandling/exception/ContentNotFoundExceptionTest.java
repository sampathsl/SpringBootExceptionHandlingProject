/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.ContentNotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** @author SAMPATH */
public class ContentNotFoundExceptionTest extends RuntimeException {

  private Logger logger = LoggerFactory.getLogger(ContentNotFoundExceptionTest.class);
  private static String CONTENT_NOT_FOUND_MSG = "Content Not Found";

  @Test
  public void contentNotFoundExceptionTest() {
    logger.info("Content Not Found Exception Test");
    ContentNotFoundException contentNotFoundException = new ContentNotFoundException(CONTENT_NOT_FOUND_MSG);
    Assert.assertNotNull(contentNotFoundException);
    Assert.assertEquals(CONTENT_NOT_FOUND_MSG, contentNotFoundException.getMessage());
  }
}
