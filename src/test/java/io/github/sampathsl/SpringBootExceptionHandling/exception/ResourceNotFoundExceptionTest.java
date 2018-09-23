package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.ResourceNotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceNotFoundExceptionTest {

  private Logger logger = LoggerFactory.getLogger(NotImplementedExceptionTest.class);
  private static String RESOURCE_NOT_FOUND_MSG = "Resource Not Found";

  @Test
  public void invalidTokenExceptionTest() {
    logger.info("Resource Not Found Exception");
    ResourceNotFoundException resourceNotFoundException =
        new ResourceNotFoundException(RESOURCE_NOT_FOUND_MSG);
    Assert.assertNotNull(resourceNotFoundException);
    Assert.assertEquals(RESOURCE_NOT_FOUND_MSG, resourceNotFoundException.getMessage());
  }

  @Test
  public void invalidTokenExceptionTestExtended() {
    logger.info("Resource Not Found Exception Extended");
    ResourceNotFoundException resourceNotFoundException =
            new ResourceNotFoundException();
    Assert.assertNotNull(resourceNotFoundException);
    Assert.assertNull(null, resourceNotFoundException.getMessage());
  }

}
