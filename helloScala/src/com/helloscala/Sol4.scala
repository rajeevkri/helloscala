package com.helloscala

object Sol4 {
  def isEven(number: Int) = number % 2 == 0
  def isOdd(number: Int) = !isEven(number)
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    for (a <- 1 to n) {
//      println("Value of a: " + a);
      var n = sc.next();
      var length = n.length();
      var oddStr = "";
      var evenStr = "";
      for (x <- 0 to length - 1) {
//        print(n.charAt(x));
        if (isEven(x)) {
//          println(" -> Even")
          evenStr = evenStr + n.charAt(x);
        }
        if (isOdd(x)) {
//          println(" -> Odd")
          oddStr = oddStr + n.charAt(x);
        }
      }
      print(evenStr + " ");
      println(oddStr );
    }
  }
}
