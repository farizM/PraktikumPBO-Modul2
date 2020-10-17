package com.Fariz.Modul2.Inheritence;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        //data dari kelas A
        System.out.println("Masukin Data ke superclass");
        superclass.x = 10;
        superclass.y = 50;
        superclass.printXY();

        //data dari class B
        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.printXY();
        subclass.sumValue();
    }
}
