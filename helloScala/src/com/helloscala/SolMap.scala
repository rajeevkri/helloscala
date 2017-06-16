package com.helloscala

import scala.collection.Map

object SolMap {
  def main(args: Array[String]): Unit = {
     val sc = new java.util.Scanner(System.in);
     var phoneBook:Map[String, Int] = Map();
    var n = sc.nextInt();
    for (a <- 1 to n) {
      var name = sc.next();
      var value = sc.nextInt();
      phoneBook += (name -> value)
    }
   for (a <- 1 to n) {
      var name = sc.next();
      if(phoneBook.contains(name)) {
        println(name + "=" +phoneBook.getOrElse(name, "Not found"));
      } else {
        println("Not found")
      }
   }
  }
}