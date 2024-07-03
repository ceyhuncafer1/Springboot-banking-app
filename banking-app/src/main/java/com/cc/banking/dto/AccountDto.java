package com.cc.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //automatically generate constructor, getter and setter methods
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
