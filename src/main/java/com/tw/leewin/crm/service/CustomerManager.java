package com.tw.leewin.crm.service;

import com.tw.leewin.crm.model.Customer;

import java.util.List;

/**
 * Created by lwzhang on 4/6/15.
 */
public interface CustomerManager {
    List<Customer> getCustomerList();
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
