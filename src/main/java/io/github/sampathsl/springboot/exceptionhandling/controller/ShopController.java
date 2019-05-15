/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.controller;

import io.github.sampathsl.springboot.exceptionhandling.exception.ContentNotFoundException;
import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
import io.github.sampathsl.springboot.exceptionhandling.model.Shop;
import io.github.sampathsl.springboot.exceptionhandling.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** @author SAMPATH */
@RestController
public class ShopController {

  private static final String SHOPS_NOT_FOUND = "Shops not found";
  private static final String INTERNAL_SERVER_ERROR = "Internal Server Exception while getting shops";

  @Autowired private ShopService shopService;

  public void setShopService(ShopService shopService) {
    this.shopService = shopService;
  }

  @GetMapping(value = "/shops")
  public List<Shop> getAllShops() {
    List<Shop> shops = shopService.getShops();
    if (shops == null) {
      throw new ContentNotFoundException(SHOPS_NOT_FOUND);
    }
    return shops;
  }

  @GetMapping(value = "/shop-one")
  public Shop getUnknownShop() {
    Shop shop = shopService.getShopNull();
    if (shop == null) {
      throw new ContentNotFoundException(SHOPS_NOT_FOUND);
    }

    return shop;
  }

  @GetMapping(value = "/shop-two")
  public Shop getUnknownShopTwo() throws ShopServiceException {
    try {
      Shop shop = shopService.getShopException();
      if (shop == null) {
        throw new ContentNotFoundException(SHOPS_NOT_FOUND);
      }
      throw new ShopServiceException(INTERNAL_SERVER_ERROR);
    } catch (ShopServiceException e) {
      throw new ShopServiceException(INTERNAL_SERVER_ERROR);
    }
  }
}
