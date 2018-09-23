package io.github.sampathsl.SpringBootExceptionHandling.exception;

import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopServiceExceptionTest {

  private Logger logger = LoggerFactory.getLogger(ShopServiceException.class);
  private static String SHOP_SERVICE_EXCEPTION_MSG = "Shop Service Exception";

  @Test
  public void invalidTokenExceptionTest() {
    logger.info("Shop Service Exception");
    ShopServiceException shopServiceException =
        new ShopServiceException(SHOP_SERVICE_EXCEPTION_MSG);
    Assert.assertNotNull(shopServiceException);
    Assert.assertEquals(SHOP_SERVICE_EXCEPTION_MSG, shopServiceException.getMessage());
  }

  @Test
  public void invalidTokenExceptionTestExtended() {
    logger.info("Shop Service Exception Extended");
    ShopServiceException shopServiceException = new ShopServiceException();
    Assert.assertNotNull(shopServiceException);
    Assert.assertNull(null);
  }
}
