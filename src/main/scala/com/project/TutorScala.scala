package com.project

object TutorScala:

  def main(args: Array[String]): Unit =
    val tutor1 = new Tutor("Alice Smith")
    val tutor2 = new Tutor("Bob Johnson")

    println(s"Tutor 1: ${tutor1.getName}")
    println(s"Tutor 2: ${tutor2.getName}")