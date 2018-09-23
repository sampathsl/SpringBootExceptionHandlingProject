/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.service;

/** @author SAMPATH */
import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
import io.github.sampathsl.springboot.exceptionhandling.model.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ShopService {

  // return shops list
  public List<Shop> getShops() {
    List<Shop> shops = new ArrayList<>();

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

    shops.add(shopOne);
    shops.add(shopTwo);
    return shops;
  }

  // return shop as null
  public Shop getShopNull() {
    return null;
  }

  // throw exception
  public Shop getShopException() throws ShopServiceException {
    throw new ShopServiceException();
  }
}
