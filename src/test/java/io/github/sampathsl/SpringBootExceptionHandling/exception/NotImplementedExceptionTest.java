package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.NotImplementedException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotImplementedExceptionTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(NotImplementedExceptionTest.class);
  private static String NOT_IMPLEMENTED_MSG = "Not implemented yet";

  @Test
  public void invalidTokenExceptionTest() {
    logger.info("Not Implemented Exception");
    NotImplementedException notImplementedException = new NotImplementedException();
    Assert.assertNotNull(notImplementedException);
    Assert.assertEquals(NOT_IMPLEMENTED_MSG, notImplementedException.getMessage());
  }
}
