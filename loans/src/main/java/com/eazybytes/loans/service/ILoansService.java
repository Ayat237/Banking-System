package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {

    /**
     * @param mobileNumber - String
     */
    void createLoan(String mobileNumber);


    /**
     * @param mobileNumber - String
     * @return  loan detail based on mobile number
     */
    LoansDto fetchLoan(String mobileNumber);


    /**
     * @param loansDto - LoansDto object
     * @return  if update of loan details updated successfully or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     * @param mobileNumber - String
     * @return  if update of loan details updated successfully or not
     */
    boolean deleteLoan(String mobileNumber);
}
