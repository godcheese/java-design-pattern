package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class DimissionRequest implements RequestImpl {

    public void dimission() {
        System.out.println("申请辞职，人事审批同意！");
    }
}
