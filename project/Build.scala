package scala.meetup.build

import sbt._
import sbt.Keys._
import android.Keys._

object Build extends android.AutoBuild {
  lazy val mySettings = super.settings ++ android.Plugin.androidBuild ++ Seq(
    name := "TutorialApp",
    version := "0.1",
    scalaVersion := "2.10.4",

    resolvers += "jcenter" at "http://jcenter.bintray.com",
    libraryDependencies ++= Seq(
      aar("org.macroid" %% "macroid" % "2.0.0-M3"),
      "com.android.support" % "support-v4" % "20.0.0"
    ),

    platformTarget in Android := "android-19"
  )

  lazy val root = Project(
    id = "TutorialId",
    base = file(".")
  ).settings(
    mySettings:_*
  )
}
