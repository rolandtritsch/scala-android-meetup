# Scala Meetup on Android

The repo to drive the Scala Meetup on Android.

To make this work you need to ...

* install git and sbt
* you can then clone this repo and checkout the various tags/steps to walk through the tutorial

## Step 0: Get something to compile

* create an empty directory and in this directory create a directory called project
* put the android.sbt file into this directory and run `sbt "gen-android android-19 scala.meetup TutorialApp"`
* take a look at the files to understand what was generated
* create an avd and start an emulator
* run `sbt android:run` and you should see the MainActivity get started

## Step 1: Turn it into a Scala app

* rename build.scala to Build.scala (just for consistency) and add the platform configuration
* you can then delete project.properties (one file less to worry about)
* delete `src/androidTest` and create `src/main/scala` and move `src/main/java/.../MainActivity.java` to `src/main/scala/MainActivity.scala` (and rename it to a scala file in the process) and delete `src/main/java`
* edit `MainActivity.scala` and port it to Scala
* add hello_text in `src/main/res/values/strings.xml` and reference it in `src/main/res/layout/main.xml`

## Step 2: Turn it into a Macroid app

* edit Build.scala to include the libraryDependencies
* edit AndroidManifest.xml to include min/targetSdkVersion
* edit MainActivity.scala to show two buttons and the text (and edit strings.xml accordingly)
* delete `src/main/res/layout` (this is not needed anymore)
