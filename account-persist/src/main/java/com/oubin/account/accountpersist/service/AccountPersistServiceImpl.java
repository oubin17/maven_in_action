package com.oubin.account.accountpersist.service;

import com.oubin.account.accountpersist.dao.Account;
import org.springframework.stereotype.Service;

/**
 * @author oubin
 * @version 1.0
 * @className AccountPersistServiceImpl
 * @date 2021/11/27 3:04 下午
 */
@Service
public class AccountPersistServiceImpl implements AccountPersistService{
    @Override
    public Account createAccount(String id, String name) {
        System.out.println("Save Account Successfully, id = " + id + " Name = " + name);
        return new Account();
    }
}
