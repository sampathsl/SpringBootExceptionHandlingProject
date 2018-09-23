package io.github.sampathsl.SpringBootExceptionHandling.model;

import io.github.sampathsl.springboot.exceptionhandling.model.Shop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class ShopTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(ShopTest.class);
  private Shop shop;
  private static String SHOP_ID = UUID.randomUUID().toString().replace("-", "");
  private static String SHOP_NAME = "Deep Learning";
  private static String SHOP_ADDRESS = "1, Flower Rd, Colombo";
  private static double SHOP_NET_WORTH = 500000.00;

  @Before
  public void setup() {
    shop = new Shop(SHOP_ID, SHOP_NAME, SHOP_ADDRESS, SHOP_NET_WORTH);
  }

  @Test
  public void shopsTest() {
    logger.info("Shop Test");
    Assert.assertNotNull(shop);
    Assert.assertEquals(shop.getId(), SHOP_ID);
    Assert.assertEquals(shop.getName(), SHOP_NAME);
    Assert.assertEquals(shop.getAddress(), SHOP_ADDRESS);
    Assert.assertEquals(new Double(shop.getNetWorth()), new Double(SHOP_NET_WORTH));
  }
}
