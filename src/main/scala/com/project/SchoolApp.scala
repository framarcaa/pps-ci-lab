package com.project

object SchoolApp:
  
  def main(args: Array[String]): Unit =
    val teacher1 = new Teacher("Alice Smith", "Mathematics")
    val teacher2 = new Teacher("Bob Johnson", "History")

    println(s"com.project.Teacher 1: ${teacher1.getName}, Subject: ${teacher1.getSubject}")
    println(s"com.project.Teacher 2: ${teacher2.getName}, Subject: ${teacher2.getSubject}")