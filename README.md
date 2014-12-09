# Scala Meetup on Android

The repo to drive the Scala Meetup on Android.

To make this work you need to ...

* install git, sbt (using macports or brew) and the [Android SDK](http://developer.android.com/sdk/index.html)
* you can then clone this repo and checkout the various tags/steps to walk through the tutorial

## Step 0: Get something to compile

* create an empty directory and in this directory create a directory called project
* put the [android.sbt file](https://gist.github.com/rolandtritsch/a501102b0a22eb49488a) into this directory and run `sbt "gen-android android-21 scala.meetup TutorialApp"`
* take a look at the files to understand what was generated
* create an avd and start an emulator
* run `sbt android:run` and you should see the MainActivity get started

## Step 1: Turn it into a Scala app

* delete project/build.scala and add a [build.sbt](https://gist.github.com/rolandtritsch/ec955c9f740a6c4f1d0d) file
* you can then also delete project.properties (one file less to worry about)
* delete `src/androidTest` and create `src/main/scala` and move `src/main/java/.../MainActivity.java` to `src/main/scala/MainActivity.scala` (and rename it to a scala file in the process) and delete `src/main/java`
* edit `MainActivity.scala` and port it to Scala
* add hello_text in `src/main/res/values/strings.xml` and reference it in `src/main/res/layout/main.xml`
* (optional - if you want to use EMACS/ensime) put the [ensime.sbt file](https://gist.github.com/rolandtritsch/3688b7a0efe7085160dc) into the project directory and run `sbt gen-ensime`
* run `sbt android:run` again and you should see the MainActivity to display the changed hello world text

## Step 2: Turn it into a Macroid app

* add the [macroid dependencies](https://gist.github.com/rolandtritsch/7323f64778423492ca7b) to the build.sbt file (and/or check the [macroid-starter repo](https://github.com/macroid/macroid-starter) for the most current version of a/the build.sbt file)
* edit AndroidManifest.xml to include min/targetSdkVersion
* edit MainActivity.scala to show two buttons and the text (and edit strings.xml accordingly)
* delete `src/main/res/layout` (this is not needed anymore)
* run `sbt android:run` again and you should see the MainActivity to display two buttons. Try them ...
