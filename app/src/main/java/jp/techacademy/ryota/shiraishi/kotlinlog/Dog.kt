package jp.techacademy.ryota.shiraishi.kotlinlog
import android.util.Log

// パッケージレベルに定義した関数
fun formatMyTag(): String {
    return "[" + MY_TAG + "]"
}
// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"

open class Dog : Animal,Movable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {

        // プロパティ
        //var name: String
        //var age: Int

        // コンストラクタ
        //constructor(name: String, age: Int)  {
        //this.name = name
        //this.age = age
        //}
    }

    // コンパニオンオブジェクトを使用した方法
    companion object {
        val to_jp = "犬"

        fun introduce() {
            Log.d("kotlintest", "これは犬クラスです。")
        }
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}