package com.oubin.account.accountpersist.service;

import com.oubin.account.accountpersist.dao.Account;

/**
 * @author oubin
 * @version 1.0
 * @className AccountPersistService
 * @date 2021/11/27 3:02 下午
 */
public interface AccountPersistService {

    Account createAccount(String id, String name);

}
