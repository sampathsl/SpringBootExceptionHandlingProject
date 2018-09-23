package io.github.sampathsl.SpringBootExceptionHandling.controller;

import io.github.sampathsl.springboot.exceptionhandling.controller.ShopController;
import io.github.sampathsl.springboot.exceptionhandling.exception.ResourceNotFoundException;
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

public class ShopControllerTest extends Mockito {

  private Logger logger = LoggerFactory.getLogger(ShopControllerTest.class);
  private ShopController shopController = new ShopController();
  private Shop shopOne = new Shop();
  private Shop shopTwo = new Shop();

  @Mock private ShopService shopService;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    List<Shop> mockShops = new ArrayList<>();
    shopOne.setName("Shop One Monitor Manager");
    shopOne.setAddress("1, Flower Rd, Colombo");
    shopOne.setId(UUID.randomUUID().toString().replace("-", ""));
    shopOne.setNetWorth(70000000.00);

    shopTwo.setName("Shop Two Monitor Manager");
    shopTwo.setAddress("2, Flower Rd, Colombo");
    shopTwo.setId(UUID.randomUUID().toString().replace("-", ""));
    shopTwo.setNetWorth(50000000.00);
    mockShops.add(shopOne);
    mockShops.add(shopTwo);
    when(shopService.getShops()).thenReturn(mockShops);
    when(shopService.getShopNull()).thenReturn(null);
    try {
      when(shopService.getShopException()).thenReturn(null);
    } catch (ShopServiceException e) {
      logger.error(e.getMessage());
    }
    shopController.setShopService(shopService);
  }

  @Test
  public void getAllShopsTest() throws ResourceNotFoundException {
    logger.info("Get All Shops Test");
    List<Shop> shops = shopController.getAllShops();
    Assert.assertNotNull(shops);
    Assert.assertEquals(2, shops.size());
  }

  @Test(expected = ResourceNotFoundException.class)
  public void getAllShopsTestExtended() throws ResourceNotFoundException {
    logger.info("Get All Shops Test Two Extended");
    when(shopService.getShops()).thenReturn(null);
    List<Shop> shops = shopController.getAllShops();
    Assert.assertNull(shops);
  }

  @Test(expected = ResourceNotFoundException.class)
  public void getUnknownShopTest() throws ResourceNotFoundException {
    logger.info("Get Unknown Shop Test");
    Shop shop = shopController.getUnknownShop();
    Assert.assertNull(shop);
  }

  @Test
  public void getUnknownShopTestExtended() throws ResourceNotFoundException {
    logger.info("Get Unknown Shop Test Extended");
    when(shopService.getShopNull()).thenReturn(shopOne);
    Shop shop = shopController.getUnknownShop();
    Assert.assertNotNull(shop);
  }

  @Test(expected = Exception.class)
  public void getUnknownShopTwoTest() throws ResourceNotFoundException, ShopServiceException {
    logger.info("Get Unknown Shop Two Test");
    Shop shop = shopController.getUnknownShopTwo();
    Assert.assertNull(shop);
  }

  @Test(expected = Exception.class)
  public void getUnknownShopTwoTestExtended()
      throws ResourceNotFoundException, ShopServiceException {
    logger.info("Get Unknown Shop Two Test Extended");
    when(shopService.getShopException()).thenReturn(new Shop());
    Shop shop = shopController.getUnknownShopTwo();
    Assert.assertNull(shop);
  }
}
