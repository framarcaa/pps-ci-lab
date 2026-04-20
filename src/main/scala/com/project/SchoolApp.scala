package com.project

import com.project.Teacher

object SchoolApp:

  case class School(name: String, location: String, teachers: List[Teacher])

  def main(args: Array[String]): Unit =
    val teacher1 = new Teacher("Alice Smith", "Mathematics")
    val teacher2 = new Teacher("Bob Johnson", "History")
    val school = School("Liceo Galileo", "Bologna", List(teacher1, teacher2))

    println(s"School: ${school.name} - ${school.location}")
    school.teachers.zipWithIndex.foreach { case (teacher, index) =>
      println(s"Teacher ${index + 1}: ${teacher.getName}, Subject: ${teacher.getSubject}")
    }
