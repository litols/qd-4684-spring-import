package com.example.qd4684springimport

import com.example.qd4684springimport.prop.Configuration
import com.example.qd4684springimport.prop.TestProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@Import(
    Configuration::class,
)
class Qd4684SpringImportApplication

fun main(args: Array<String>) {
    runApplication<Qd4684SpringImportApplication>(*args)
}

@RestController
class HelloController(
    val testProperties: TestProperties
) {
    @GetMapping("/hello")
    fun hello(): String {
        return testProperties.value
    }
}
