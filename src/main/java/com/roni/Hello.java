package com.roni;

public class Hello {
    public static void main(String[] args) {
        //step 1 sout + tab =  System.out.println();
        // System.out.println("hello wordls");

        //step2 new class and  use method hello
        //new Person().hello();

        //step3 new Person class and new object person and hello method
        // 這邊Person() 是建構值  ctrl + P 可以看參數內容
        // 建構值 會以參數以及他的型別來分變

        Person p = new Person("Roni",66.5f,1.7f);
//        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
//        System.out.println(p.bmi());

    }
}
