package com.rbhatt.practice.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype Shallow Copy Demo
 * Clone method is implemented in Statement
 *
 * Note: Shallow copy is risky because it "copies" the object as it is.
 * You can see in the example that for second statement record object is same as first statement.
 * Change done on secondStatement's record will affect firstStatement's record.
 */
public class PrototypeShallowCopyDemo {

    public static void main(String[] args) {

        String sql = "Select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();

        parameters.add("Jumanji");

        Record record = new Record("aa");

        Statement firstStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());
        System.out.println(firstStatement.getRecord().getTest());

        System.out.println();

        Statement secondStatement = firstStatement.clone();

        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
        System.out.println(secondStatement.getRecord().getTest());

        secondStatement.getRecord().setTest("bb");

        System.out.println();
        System.out.println(secondStatement.getRecord().getTest());
        System.out.println(firstStatement.getRecord().getTest());

    }

}
