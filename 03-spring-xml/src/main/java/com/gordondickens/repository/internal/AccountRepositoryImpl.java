package com.gordondickens.repository.internal;

import com.gordondickens.repository.AccountRepository;

import javax.sql.DataSource;

/**
 *
 * @author gordon
 *         Date: 2012-07-30
 */
public class AccountRepositoryImpl implements AccountRepository {
    private DataSource dataSource;

    // Private NO ARG constructor, making this class only instantiable with a DataSource
    private AccountRepositoryImpl() {
        //no code here
    }

    public AccountRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //NO SETTER - making this class immutable
    public DataSource getDataSource() {
        return dataSource;
    }
}
