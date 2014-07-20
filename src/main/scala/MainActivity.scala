package scala.meetup

import android.app.Activity
import android.os.Bundle

import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

import macroid._
import macroid.FullDsl._

class MainActivity extends Activity with Contexts[Activity] with AutoLogTag {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    logD"entry"()

    setContentView {
      getUi {
        var greeting = slot[TextView]
        l[LinearLayout](
          w[Button] <~
            text(R.string.show_me) <~
            On.click {
              logV"click - show me"()
              greeting <~ show
            },
          w[Button] <~
            text(R.string.hide_me) <~
            On.click {
              logV"click - hide me"()
              greeting <~ hide
            },
          w[TextView] <~
            wire(greeting) <~
            text(R.string.hello_text) <~
            hide
        ) <~ vertical
      }
    }
    logD"exit"()
  }
}
