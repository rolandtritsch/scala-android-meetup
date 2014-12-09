import android.Keys._

android.Plugin.androidBuild

name := "TutorialApp"

version := "0.1"

scalaVersion := "2.11.4"

platformTarget in Android := "android-21"

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-keepattributes Signature", "-printseeds target/seeds.txt", "-printusage target/usage.txt", "-dontwarn scala.collection.**")

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android
