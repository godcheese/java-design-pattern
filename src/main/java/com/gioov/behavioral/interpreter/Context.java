package com.gioov.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-13
 */
public class Context {

    private String content;

    private List<AbstractExpression> list = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<AbstractExpression> getList() {
        return list;
    }

    public void add(AbstractExpression expression) {
        list.add(expression);
    }
}
