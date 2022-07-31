package com.bank.banking.wallet.dto;

public class BankAccountDto {
    private String bankNm;
    private String bankAccountNum;

    public BankAccountDto(){
        super();
    }

    public BankAccountDto(String bankNm,String bankAccountNum ){
        super();
        this.bankNm=bankNm;
        this.bankAccountNum=bankAccountNum;
    }

    public String getBankNm(){
        return bankNm;
    }
    public void setBankNm(){
        this.bankNm=bankNm;
    }
    public String getBankAccountNum(){
        return bankAccountNum;
    }
    public void setBankAccountNum(){
        this.bankAccountNum=bankAccountNum;
    }
}
