/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.controller;

import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
import io.github.sampathsl.springboot.exceptionhandling.exception.ResourceNotFoundException;
import io.github.sampathsl.springboot.exceptionhandling.model.Shop;
import io.github.sampathsl.springboot.exceptionhandling.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SAMPATH
 */
@RestController
public class ShopController {

    @Autowired
    ShopService shopService;

    @RequestMapping(value = "/shops", method = RequestMethod.GET)
    public Shop getShops() throws ResourceNotFoundException, ShopServiceException {
        try {
            Shop shop = shopService.getShop();

            if (shop == null) {
                throw new ResourceNotFoundException("Shop not found");
            }
            return shop;
        } catch (ShopServiceException e) {
            throw new ShopServiceException("Internal Server Exception while getting exception");
        }
    }

    @RequestMapping(value = "/shop1", method = RequestMethod.GET)
    public Shop getUnknownShopOne() throws ResourceNotFoundException, ShopServiceException {
        try {
            Shop shop = shopService.getShopNull();
            if (shop == null) {
                throw new ResourceNotFoundException("Shop not found");
            }

            return shop;
        } catch (ShopServiceException e) {
            throw new ShopServiceException("Internal Server Exception while getting exception");
        }
    }
    
    @RequestMapping(value = "/shop2", method = RequestMethod.GET)
    public Shop getUnknownShopTwo() throws ResourceNotFoundException, ShopServiceException {
        try {
            Shop shop = shopService.getShopException();
            if (shop == null) {
                throw new ResourceNotFoundException("Shop not found");
            }
            return shop;
        } catch (ShopServiceException e) {
            throw new ShopServiceException("Internal Server Exception while getting exception");
        }
    }
}
