package com.oubin.account.accountemail.service;

import org.springframework.stereotype.Service;

/**
 * @author oubin
 * @version 1.0
 * @className AccountEmailServiceImpl
 * @date 2021/11/27 9:19 上午
 */
@Service
public class AccountEmailServiceImpl implements AccountEmailService{

    @Override
    public void sendMail(String to, String subject, String htmlText) {
        System.out.println("Send Email Service Work, sendTo: " + to + ", subject: " + subject + ", htmlText: " + htmlText);
    }
}
