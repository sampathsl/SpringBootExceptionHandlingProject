package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.InvalidRequestException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidRequestExceptionTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(InvalidRequestExceptionTest.class);
  private static String INVALID_REQUEST_MSG = "Invalid Request";

  @Test
  public void invalidRequestExceptionTest() {
    logger.info("Invalid Request Exception Test");
    InvalidRequestException invalidRequestException = new InvalidRequestException(INVALID_REQUEST_MSG);
    Assert.assertNotNull(invalidRequestException);
    Assert.assertEquals(INVALID_REQUEST_MSG, invalidRequestException.getMessage());
  }
}
