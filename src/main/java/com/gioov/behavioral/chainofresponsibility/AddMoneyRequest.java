package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class AddMoneyRequest implements RequestImpl {

    public void addMoney() {
        System.out.println("申请加薪，项目经理审批同意！");
    }
}
