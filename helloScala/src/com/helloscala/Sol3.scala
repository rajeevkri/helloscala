package com.helloscala

object Sol3 {

  //Given an array, A, of N integers, print A's elements in reverse order as 
  //a single line of space-separated numbers.s
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for (arr_i <- 0 to n - 1) {
      arr(n- arr_i -1) = sc.nextInt();
    }
    
    //iterating array using index
    for(arr_i <- 0 to n-1) {
      print(arr(arr_i) + " ")
    }
    
    //iterating array using for each loop
    for(arr_i <- arr) {
      print(arr_i + " ")
    }
  }
}