package com.imbytecat.functionalboot.config

import com.imbytecat.functionalboot.handler.HelloHandler
import org.springframework.context.support.beans

val beans = beans {
    bean<HelloHandler>()

    bean {
        appRouter(ref())
    }
}

//val context = GenericApplicationContext().apply {
//    beans.initialize(this)
//    refresh()
//}
