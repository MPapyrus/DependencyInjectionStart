package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()

//    init {
//        DaggerNewComponent.create().inject(this)
//    }
}