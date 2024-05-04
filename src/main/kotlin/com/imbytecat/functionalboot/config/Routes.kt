package com.imbytecat.functionalboot.config

import com.imbytecat.functionalboot.handler.HelloHandler
import org.springframework.web.servlet.function.router

fun appRouter(
    helloHandler: HelloHandler
) = router {
    "/api".nest {
        GET("/hello", helloHandler::getHello)
    }
}
