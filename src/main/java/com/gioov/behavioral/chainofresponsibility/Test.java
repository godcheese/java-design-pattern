package com.gioov.behavioral.chainofresponsibility;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        RequestHandleImpl humanResourceRequestHandle = new HumanResourceRequestHandle();
        RequestHandleImpl projectManagerRequestHandle = new ProjectManagerRequestHandle(humanResourceRequestHandle);
        RequestHandleImpl teamLeaderRequestHandle = new TeamLeaderRequestHandle(projectManagerRequestHandle);

        // 人事审批辞职
        RequestImpl request = new DimissionRequest();
        humanResourceRequestHandle.handleRequest(request);

        // 项目组长审批请假
        request = new TakeLeaveRequest();
        teamLeaderRequestHandle.handleRequest(request);

        // 项目经理审批加薪
        request = new AddMoneyRequest();
        projectManagerRequestHandle.handleRequest(request);
    }
}
