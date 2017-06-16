package com.helloscala

object Stairecase {
  def main(args: Array[String]): Unit = {
    var sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    for(a <- 1 to n) {
      for(x <-1 to n-a) {
        print(" ");
      }
      for(x <- 1 to a) {
        print("#");
      }
      println();
    }
  }
}