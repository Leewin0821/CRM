package com.tw.leewin.crm.service;

import com.tw.leewin.crm.dao.CustomerDAO;
import com.tw.leewin.crm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwzhang on 4/6/15.
 */

@Service
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getCustomerList() {
        return customerDAO.getCustomerList();
    }

    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerDAO.deleteCustomer(customer);
    }
}
