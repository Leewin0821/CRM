package com.tw.leewin.crm.dao;

import com.tw.leewin.crm.model.Customer;

import java.util.List;

/**
 * Created by lwzhang on 4/5/15.
 */
public interface CustomerDAO {
    List<Customer> getCustomerList();
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
