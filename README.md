# Scala Meetup on Android

The repo to drive the Scala Meetup on Android.

To make this work you need to ...

* install git and sbt
* you can then clone this repo and checkout the various tags/steps to walk through the tutorial

## Step 0: Get something to compile

* create an empty directory and in this directory create a directory called project
* put the android.sbt file into this directory and run `sbt "gen-android android-19 scala.meetup TutorialApp"`
* create an avd and start an emulator
* run `sbt android:run` and you should see the MainActivity get started
