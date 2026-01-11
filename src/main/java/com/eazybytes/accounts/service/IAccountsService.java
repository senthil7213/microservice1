package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    void creatAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

}
