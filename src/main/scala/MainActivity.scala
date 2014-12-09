package scala.webex

import android.app.Activity
import android.os.Bundle
import android.widget.{TextView, Button, LinearLayout}

import macroid._
import macroid.FullDsl._

class MainActivity extends Activity with Contexts[Activity] {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)

    setContentView {
      getUi {
        var greeting = slot[TextView]

        l[LinearLayout](
          w[Button] <~
            text(getString(R.string.show_me)) <~
            On.click {
              greeting <~ show
            },
          w[Button] <~
            text(getString(R.string.hide_it)) <~
            On.click {
              greeting <~ hide
            },
          w[TextView] <~
            wire(greeting) <~
            text(getString(R.string.hello_text)) <~
            hide
        ) <~ vertical
      }
    }
  }
}
