package com.helloscala

object Solution {
  /*
   *
   * Enter Input like
   *  22
   *  3
   *  4
   *  The total meal cost is 24 dollars.
   */
  def main(args: Array[String]): Unit = {
    val price: Double = Console.readDouble // First line read the price
    val tipPercentage: Int = Console.readInt // read percentage tip

    val taxPercentage: Int = Console.readInt // read percentage tax
    var totalCost = price + (price * tipPercentage / 100) + (price * taxPercentage / 100)
    println("The total meal cost is " + math.round(totalCost).toInt + " dollars.")
  }
}

