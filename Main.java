package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList allparameters = new ArrayList();
        Scanner input = new Scanner(System.in);

        System.out.println("Input language (en/ge/ru) : ");
        String lang = input.next();

        System.out.println("Input parameters  (p-2-s-5-7-w-7-9) : ");
        String param = input.next();


        String[] paramArray = param.split("-");






        for (String parameter: paramArray) {
                 try {
                        allparameters.add(Integer.parseInt(param));
                 }
                         catch (NumberFormatException e) {

                 }
             }
        if (param.length() < 7) {
            System.out.println("incorrect, choose correctly: p-2-s-5-7-w-7-9");
               } else if ( allparameters.size() > 5) {
                    System.out.println("incorrect, choose correctly: p-2-s-5-7-w-7-9");
                        }
                        generate Generate = new generate(lang, allparameters);
                        generate.inputAlphabet();
                        System.out.println(generate.createsentence((int) allparameters.get(0), (int) allparameters.get(1), (int) allparameters.get(2)));

    }
}