package com.helloscala

object Sol5 extends App {
  
  def f(n: Int): Unit = {
    for (a <- 1 to n) {
      print("Hello World")
    }
  }
  var n = scala.io.StdIn.readInt
  f(n)
}

