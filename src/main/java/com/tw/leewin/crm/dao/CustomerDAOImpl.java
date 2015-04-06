package com.tw.leewin.crm.dao;

import com.google.common.collect.Lists;
import com.tw.leewin.crm.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lwzhang on 4/5/15.
 */

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private List<Customer> customerList;

    public CustomerDAOImpl() {
        init();
    }

    private void init() {
        customerList = Lists.newArrayList(
                new Customer("aaa","aaa"),
                new Customer("bbb","bbb"),
                new Customer("ccc","ccc")
        );
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
    }
}
