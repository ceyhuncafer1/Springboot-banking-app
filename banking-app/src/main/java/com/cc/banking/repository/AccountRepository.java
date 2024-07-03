package com.cc.banking.repository;

import com.cc.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

//will get CRUD database metohods to perform CRUD database operations on Account JPA entity

public interface AccountRepository extends JpaRepository<Account, Long> {

}
