package com.oubin.account.accountemail.service;

/**
 * @author oubin
 * @version 1.0
 * @className AccountEmailService
 * @date 2021/11/27 9:17 上午
 */
public interface AccountEmailService {

    /**
     * sendMail interface
     *
     * @param to
     * @param subject
     * @param htmlText
     */
    void sendMail(String to, String subject, String htmlText);

}
