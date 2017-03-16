package com.helloscala

object Sol2 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    for (a <- 1 to 10) {
      println(n + " x " + a + " = " + a*n);
    }
  }
}
