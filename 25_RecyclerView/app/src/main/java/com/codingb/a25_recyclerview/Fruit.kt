package com.codingb.a25_recyclerview

import kotlin.random.Random

data class Fruit(
    val name :String,
    val origin :String,
    val quantity : Int
) {
    companion object{

        @JvmField   //used to make these members public kinf of thing
        val FRUIT_NAMES = arrayOf(
            "Apple" , "Mango" , "Pineapple" , "Guava", "Straberry" , "Banana" , "Kiwi",
            "Grapes" , "Peach"
        )
        @JvmField
        val ORIGINS = arrayOf(
            "Nagpur", "Lucknow" , "Srinagar" , "Mysore" ,"Patna" ,"Mysore"
        )
        @JvmStatic
        //fun to retun an array of Fruit type of size n
        fun getRandomFuits(n : Int) : ArrayList<Fruit>{
            val fruitArray = ArrayList<Fruit>(n)
            for(i in 1..n){
                fruitArray.add(
                    Fruit(
                        FRUIT_NAMES[Random.nextInt(9)],
                        ORIGINS[Random.nextInt(6)],
                        Random.nextInt(10)*100
                    )
                )
            }
            return fruitArray
        }
    }
}