package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class HumanResourceRequestHandle implements RequestHandleImpl {

    @Override
    public void handleRequest(RequestImpl request) {
        if (request instanceof DimissionRequest) {
            ((DimissionRequest) request).dimission();
        }
    }
}
