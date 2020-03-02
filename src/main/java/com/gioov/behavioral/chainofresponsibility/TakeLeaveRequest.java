package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class TakeLeaveRequest implements RequestImpl {

    public void takeLeave() {
        System.out.println("申请请假，项目组长审批同意！");
    }
}
