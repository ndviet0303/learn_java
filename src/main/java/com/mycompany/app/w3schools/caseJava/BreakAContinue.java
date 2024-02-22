package com.mycompany.app.w3schools.caseJava;

public class BreakAContinue {
    public static void main(String[] args) {
        // break

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        // continue

        i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
