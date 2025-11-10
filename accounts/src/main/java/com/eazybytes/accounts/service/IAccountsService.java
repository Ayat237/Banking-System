package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Accounts;

public interface IAccountsService {

    /**
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - String
     * @return Accounts details based on mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * @param customerDto - CustomerDto object
     * @return if the Account updated successfully or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - String
     * @return if the Account deleted successfully or not
     */
    boolean deleteAccount(String mobileNumber);
}
