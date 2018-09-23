package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.InvalidTokenException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidTokenExceptionTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(InvalidTokenExceptionTest.class);
  private static String INVALID_TOKEN_MSG = "Invalid Token";

  @Test
  public void invalidTokenExceptionTest() {
    logger.info("Invalid Token Exception Test");
    InvalidTokenException invalidTokenException = new InvalidTokenException(INVALID_TOKEN_MSG);
    Assert.assertNotNull(invalidTokenException);
    Assert.assertEquals(INVALID_TOKEN_MSG, invalidTokenException.getMessage());
  }

  @Test
  public void invalidTokenExceptionTestExtended() {
    logger.info("Invalid Token Exception Test Extended");
    InvalidTokenException invalidTokenException =
        new InvalidTokenException(INVALID_TOKEN_MSG, new RuntimeException());
    Assert.assertNotNull(invalidTokenException);
    Assert.assertNotNull(invalidTokenException.getMessage());
  }
}
