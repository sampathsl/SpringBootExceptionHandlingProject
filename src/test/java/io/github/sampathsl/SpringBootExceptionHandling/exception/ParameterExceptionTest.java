package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.ParameterException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterExceptionTest {

  private Logger logger = LoggerFactory.getLogger(NotImplementedExceptionTest.class);
  private static String NOT_INVALID_PARAMETER_MSG = "Invalid Parameter";

  @Test
  public void invalidTokenExceptionTest() {
    logger.info("Invalid Parameter Exception");
    ParameterException parameterException = new ParameterException(NOT_INVALID_PARAMETER_MSG);
    Assert.assertNotNull(parameterException);
    Assert.assertEquals(NOT_INVALID_PARAMETER_MSG, parameterException.getMessage());
  }
}
