name := "Scala 06 - Capstone Assignment"
version := "1.0"
scalaVersion := "2.12.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test

coverageFailOnMinimum := true
coverageMinimum := 90

coverageExcludedPackages := "org.knoldus.boostrap.userManagement.Main"
