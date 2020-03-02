package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class TeamLeaderRequestHandle implements RequestHandleImpl {

    private RequestHandleImpl requestHandle;

    public TeamLeaderRequestHandle(RequestHandleImpl requestHandle) {
        this.requestHandle = requestHandle;
    }

    @Override
    public void handleRequest(RequestImpl request) {
        if (request instanceof TakeLeaveRequest) {
            ((TakeLeaveRequest) request).takeLeave();
        } else {
            requestHandle.handleRequest(request);
        }
    }
}
