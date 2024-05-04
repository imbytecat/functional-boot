package com.imbytecat.functionalboot.handler

import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse

class HelloHandler {
    fun getHello(req: ServerRequest): ServerResponse {
        return ServerResponse.ok().body("Hello there!")
    }
}
