package com.cc.banking.service;

import com.cc.banking.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountByID(Long id);
}
