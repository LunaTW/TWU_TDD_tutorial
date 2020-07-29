package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

public class AccountTests {
    @Test
    //我存钱时应该增加我的余额
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        //arrange
        //Account account = new Account(100);

        //action
        //Integer DepositMoney = 50;

        //assert
        //assertThat(account.AccountBalance,is(150));

    }

    @Test
    //提款时应该减少我的余额
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    //当我取款时钱不应该减少我的余额和不具备足够的余款
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
