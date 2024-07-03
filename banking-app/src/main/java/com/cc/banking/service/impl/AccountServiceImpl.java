package com.cc.banking.service.impl;

import com.cc.banking.dto.AccountDto;
import com.cc.banking.entity.Account;
import com.cc.banking.mapper.AccountMapper;
import com.cc.banking.repository.AccountRepository;
import com.cc.banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);


        return AccountMapper.mapToAccountDto((savedAccount));
    }
}
