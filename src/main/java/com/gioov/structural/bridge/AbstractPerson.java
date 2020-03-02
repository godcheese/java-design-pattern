package com.gioov.structural.bridge;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-25
 */
public abstract class AbstractPerson {

    private AbstractClothing clothing;

    private String type;

    public AbstractClothing getClothing() {
        return clothing;
    }

    public void setClothing(AbstractClothing clothing) {
        this.clothing = clothing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void dress();
}
