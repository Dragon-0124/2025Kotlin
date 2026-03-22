package com.example.appcompatactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


/*
//      각 기본 타입 별로 10개의 빈 공간을 할당 하여 선언
        var students = IntArray(10)
        var longArray = LongArray(10)
        var CharArray = CharArray(10)
        var FloatArray = FloatArray(10)
        var DoubleArray = DoubleArray(10)

//      arrayOf를 사용하면 선언과 동시에 값을 입력할 수 있음
        var intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//      문자열 타입 배열 선언
        var stringArray = Array(10, {item->""})
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

//      대괄호를 이용해 값 입력
        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93
        students[4] = 94
//      set함수를 이용해 값 입력
        students.set(5, 95)
        students.set(6, 96)
        students.set(7, 97)
        students.set(8, 98)
        students.set(9, 99)
        
//      값 변경해보기
        intArray[6] = 137
        intArray.set(9,200)

//      배열 값 사용하기
        var seventhValue = intArray[6]
        Log.d("Array","8번째 intArray의 값은 ${seventhValue}입니다.")

        var TenthValue = intArray.get(9)
        Log.d("Array","10번째 intArray의 값은 ${TenthValue}입니다.")

        Log.d("Array","1번째 dayArray의 값은 ${dayArray[0]}입니다.")
        Log.d("Array","6번째 dayArray의 값은 ${dayArray.get(5)}입니다.")

*/

//      set 예제 연습
        var set = mutableSetOf<String>()

        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN") //동일한 값은 입력 X

        Log.d("Collection", "Set 전체 출력 = ${set}")

        set.remove("FEB")

        Log.d("Collection", "Set 전체 출력 = ${set}")

        var set2 = mutableSetOf("Cat", "Dog", "Cat")
        Log.d("Collection", "Set 전체 출력 = ${set2}")


//      get 예제 연습
        var map = mutableMapOf<String, String>()

        map.put("키1","값2")
        map.put("키2","값2")
        map.put("키3","값3")

        var variable = map.get("키2")
        Log.d("Collection", "키2의 값은 ${variable} 입니다")

        map.put("키2","두 번째 값 수정")
        Log.d("Collection", "키2의 값은 ${map.get("키2")} 입니다")

        map.remove("키2")
        Log.d("Collection", "키2의 값은 ${map.get("키2")} 입니다")

        var map_new = mutableMapOf("고양이" to "동물1", "개" to "동물2")
        Log.d("Collection", "map_new 전체 출력 ${map_new}")
        Log.d("Collection", "map 전체 출력 ${map}")


    }
}