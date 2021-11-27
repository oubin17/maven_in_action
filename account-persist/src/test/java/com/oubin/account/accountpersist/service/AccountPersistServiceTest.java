package com.oubin.account.accountpersist.service;

import com.oubin.account.accountpersist.AccountPersistApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author oubin
 * @version 1.0
 * @className AccountPersistServiceTest
 * @date 2021/11/27 3:05 下午
 */
@SpringBootTest(classes = {AccountPersistApplication.class})
public class AccountPersistServiceTest {

    @Autowired
    private AccountPersistService accountPersistService;

    @Test
    public void test() {
        String id = "accountId";

        String name = "accountName";

        accountPersistService.createAccount(id, name);
    }

}
