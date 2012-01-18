package com.lombardrisk.springmvcsample.util.guava;

import com.google.common.base.Strings;

/**
 * Created by IntelliJ IDEA.
 * User: johnson
 * Date: 1/16/12
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class GuavaTest {
    public static void main(String[] args) {
        final String ts = "Johnson He";
        System.out.println(Strings.isNullOrEmpty(ts));

    }
}
