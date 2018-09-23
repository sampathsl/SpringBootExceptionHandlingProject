/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.sampathsl.springboot.exceptionhandling.model;

/** @author SAMPATH */
public class Shop {

  private String id;
  private String name;
  private String address;
  private double netWorth;

  public Shop() {}

  public Shop(String id, String name, String address, double netWorth) {
    setId(id);
    setName(name);
    setAddress(address);
    setNetWorth(netWorth);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getNetWorth() {
    return netWorth;
  }

  public void setNetWorth(double netWorth) {
    this.netWorth = netWorth;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
