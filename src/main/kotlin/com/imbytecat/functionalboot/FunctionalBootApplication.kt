package com.imbytecat.functionalboot

import com.imbytecat.functionalboot.config.beans
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunctionalBootApplication

fun main(args: Array<String>) {
    runApplication<FunctionalBootApplication>(*args) {
        addInitializers(beans)
    }
}
