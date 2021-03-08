package com.roni

fun main() {
    //println("Hwllo Kotlin");
    // kotlin 直接呼叫class() 可以直接建立物件 後面可以直接使用他的方法
    // Human().hello()
    //val 代表定義完就不可以在改變值
    val h = Human(weight = 66.5f,height = 1.7f)
    h.hello()
    println(h.bmi())
    var c : Char = 'A'
    //kotlin 在比較字串時 他不是真的數字 所以要使用 toint的方式來轉換
    print(c.toInt() > 90)
}
// kotlin 可以直接在 建立class類別的時候 宣告建構值
// 可以給初始值讓程式不會出錯
class Human(var name:String = "", var weight:Float, var height:Float){
    init {
        // 變數前面可以加 $字號
        println("test $weight")
    }
    fun bmi() :Float{
        var bmi = weight / (height * height)
        return bmi;
    }
    fun hello(){
        println("Hello Kotlin");
    }
}