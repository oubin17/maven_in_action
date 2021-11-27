package com.oubin.account.accountemail.service;

import com.oubin.account.accountemail.AccountEmailApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author oubin
 * @version 1.0
 * @className AccountEmailServiceTest
 * @date 2021/11/27 9:23 上午
 */
@SpringBootTest(classes = {AccountEmailApplication.class})
public class AccountEmailServiceTest {

    @Autowired
    private AccountEmailService accountEmailService;

    @Test
    public void testAccountEmailSend() {
        String to = "oubin";
        String subject = "Test Subject";
        String htmlText = "Hello World";
        accountEmailService.sendMail(to, subject, htmlText);

    }
}
