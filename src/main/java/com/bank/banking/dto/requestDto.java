package com.bank.banking.dto;

public class requestDto {
    private String resultCode ;
    private String msg;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getMsg() {
        return msg;
    }
}
