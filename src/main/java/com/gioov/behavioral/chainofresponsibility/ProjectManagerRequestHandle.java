package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class ProjectManagerRequestHandle implements RequestHandleImpl {

    private RequestHandleImpl requestHandle;

    public ProjectManagerRequestHandle(RequestHandleImpl requestHandle) {
        this.requestHandle = requestHandle;
    }

    @Override
    public void handleRequest(RequestImpl request) {
        if (request instanceof AddMoneyRequest) {
            ((AddMoneyRequest) request).addMoney();
        } else {
            requestHandle.handleRequest(request);
        }
    }
}
