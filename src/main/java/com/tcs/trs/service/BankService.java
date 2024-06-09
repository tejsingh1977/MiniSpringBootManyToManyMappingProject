package com.tcs.trs.service;
import java.util.List;

import com.tcs.trs.dto.CustomerDTO;
import com.tcs.trs.exception.InfyBankException;

public interface BankService {
	public Integer addCustomerAndService(CustomerDTO customerDTO) throws InfyBankException;
	public void addExistingServiceToExistingCustomer(Integer customerId,List<Integer> serviceIds) throws InfyBankException;
	public void deallocateServiceForExistingCustomer(Integer customerId,List<Integer> serviceIds) throws InfyBankException;		
}