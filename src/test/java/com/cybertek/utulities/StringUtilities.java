package com.cybertek.utulities;

public class StringUtilities {

    public static boolean verifyEquals(String exp, String act) {
        if(exp.equalsIgnoreCase(act)) {
            System.out.println("without new Jobs");
            return true;
        }else {
            System.out.println("Let's check JobsList");
            System.out.println("exp = " + exp);
            System.out.println("act = " + act);
        }
        return false;
    }

}
