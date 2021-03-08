package com.roni;

public class Person {
    String name;
    float weight;
    float height;
    //產生建構值 必須與類別名稱相同
    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }
    // 函數可使用多個建構值，有不同的參數這個方式叫做overloading
    public Person(String name, float weight, float height){
        // this () 可以把重複
        this(weight, height);
        this.name= name;

    }
    public float bmi(){
        float bmi = weight / (height * height) ;
        return bmi;
    }
    public void hello(){
        System.out.println("Hello by Person class");
    }
}
