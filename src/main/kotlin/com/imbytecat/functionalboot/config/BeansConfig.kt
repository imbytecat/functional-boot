package com.imbytecat.functionalboot.config

import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

val beans = beans {
    bean {
        appRouter(ref())
    }
}

//val context = GenericApplicationContext().apply {
//    beans.initialize(this)
//    refresh()
//}
