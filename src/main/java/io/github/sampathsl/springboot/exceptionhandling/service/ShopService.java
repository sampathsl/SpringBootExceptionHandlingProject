/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.service;

/**
 *
 * @author SAMPATH
 */
import io.github.sampathsl.springboot.exceptionhandling.exception.ShopServiceException;
import io.github.sampathsl.springboot.exceptionhandling.model.Shop;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

    //return shop object
    public Shop getShop() throws ShopServiceException {
        Shop emp = new Shop();
        emp.setName("Shop Monitor Manager");
        emp.setAddress("1, Flower Rd, Colombo");
        emp.setId("1");
        emp.setNetWorth(90000000.00);
        return emp;
    }

    //return shop as null
    public Shop getShopNull() throws ShopServiceException {
        return null;
    }

    //throw exception
    public Shop getShopException() throws ShopServiceException {
        throw new ShopServiceException();
    }

}
