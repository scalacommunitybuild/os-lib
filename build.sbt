scalaVersion := "2.13.4"
organization := "com.lihaoyi"
name := "os-lib"
libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.5" % Test
libraryDependencies += "com.lihaoyi" %% "geny" % "0.6.2"
//libraryDependencies += "com.lihaoyi" %% "acyclic" % "0.0.0" % Test
testFrameworks := Seq(new TestFramework("utest.runner.Framework"))
Compile / unmanagedSourceDirectories += baseDirectory.value / "os" / "src"
Compile / unmanagedSourceDirectories += baseDirectory.value / "os" / "src-jvm"
Test / unmanagedSourceDirectories += baseDirectory.value / "os" / "test" / "src"
Compile / scalacOptions ++= Seq("-feature", "-deprecation")