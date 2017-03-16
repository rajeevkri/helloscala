package com.helloscala

object Sol1 {

  /*  Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird*/
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var N = sc.nextInt();
    if (N % 2 == 1)
      println("Weird")
    else if (N == 2 || N == 4)
      println("Not Weird")
    else if (N % 2 == 0 && N >= 6 && N <= 20)
      println("Weird")
    else if (N % 2 == 0 && N >= 20)
      println("Not Weird")
  }
}
