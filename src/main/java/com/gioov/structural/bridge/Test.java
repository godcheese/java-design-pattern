package com.gioov.structural.bridge;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-12
 */
public class Test {

    public static void main(String[] args) {
        AbstractPerson man = new Man();
        AbstractPerson woman = new Woman();

        AbstractClothing jacket = new Jacket();
        AbstractClothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(woman);
        trouser.personDressCloth(woman);
    }
}
