package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {

    public static void main(String[] args) {
        System.out.println("Current number of washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        WashMachine samsung = new WashMachine("Samsung", "1x2");
        System.out.println("Current number of washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("Samsung serial number is: " + samsung.getSerialNumber());
        samsung.setSerialNumber(5);
        System.out.println("Current serial number is: " + samsung.getSerialNumber());

        // DO NOT USE INSTANT REFERENCES TO ACCESS STATIC MEMBERS (FIELDS/METHODS)
        // so samsung2 will have 101 and 102 as after that we indicated print out line, for all the products
        samsung.setNumberOfCreatedMachines(100);


        WashMachine samsung2 = new WashMachine("Samsung", "1x2");
        System.out.println("Current number of washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung2 serial number is: " + samsung2.getSerialNumber());

        for(int i = 0; i < 10; i++); {
            makeSomeWashMachines();
        }

        //nsome generic way to obtain number of produced washing machines
        System.out.println("Hey we've made lots of washing machines: " + WashMachine.getNumberOfCreatedMachines());


    }

    public static void makeSomeWashMachines() {
        new WashMachine("LG", "1111");
        new WashMachine("LG", "1112");
        new WashMachine("LG", "1113");
        new WashMachine("LG", "1114");
        new WashMachine("LG", "1115");
        new WashMachine("LG", "1115");
    }
}
