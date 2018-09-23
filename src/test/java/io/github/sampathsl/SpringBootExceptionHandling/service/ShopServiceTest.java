package io.github.sampathsl.SpringBootExceptionHandling.service;

import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
import io.github.sampathsl.springboot.exceptionhandling.model.Shop;
import io.github.sampathsl.springboot.exceptionhandling.service.ShopService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopServiceTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(ShopServiceTest.class);
  private List<Shop> mockShops = new ArrayList<>();

  @Mock private ShopService shopService;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    Shop shopOne = new Shop();
    shopOne.setName("Shop One Monitor Manager");
    shopOne.setAddress("1, Flower Rd, Colombo");
    shopOne.setId(UUID.randomUUID().toString().replace("-", ""));
    shopOne.setNetWorth(70000000.00);

    Shop shopTwo = new Shop();
    shopTwo.setName("Shop Two Monitor Manager");
    shopTwo.setAddress("2, Flower Rd, Colombo");
    shopTwo.setId(UUID.randomUUID().toString().replace("-", ""));
    shopTwo.setNetWorth(50000000.00);

    mockShops.add(shopOne);
    mockShops.add(shopTwo);
  }

  @Test
  public void getShopsTest() {
    logger.info("Get All Shops Test");
    when(shopService.getShops()).thenReturn(mockShops);
    ShopService shopServiceTest = new ShopService();
    List<Shop> testShops = shopServiceTest.getShops();
    Assert.assertNotNull(testShops);
    Assert.assertEquals(mockShops.size(), testShops.size());
  }

  @Test
  public void getShopNullTest() {
    logger.info("Get Null Shop Test");
    when(shopService.getShopNull()).thenReturn(null);
    ShopService shopServiceTest = new ShopService();
    Shop shop = shopServiceTest.getShopNull();
    Assert.assertNull(null, shop);
  }

  @Test(expected = ShopServiceException.class)
  public void getShopExceptionTest() throws ShopServiceException {
    logger.info("Get Shop Exception Test");
    when(shopService.getShopException()).thenReturn(null);
    ShopService shopServiceTest = new ShopService();
    Shop shop = shopServiceTest.getShopException();
    Assert.assertNull(null, shop);
  }
}
