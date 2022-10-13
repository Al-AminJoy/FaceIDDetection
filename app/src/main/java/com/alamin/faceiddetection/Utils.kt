package com.alamin.faceiddetection

import kotlin.math.absoluteValue

class Utils {

     companion object{
         fun differenceCalculator(firstValue: Number, secondValue: Number):Double{

             val top: Double = (firstValue.toDouble()-secondValue.toDouble()).absoluteValue
             val bottom = ((firstValue.toDouble()+secondValue.toDouble())/2).absoluteValue
             return (top/bottom)*100

         }
     }
}