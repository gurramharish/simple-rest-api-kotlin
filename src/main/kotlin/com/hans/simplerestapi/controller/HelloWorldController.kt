package com.hans.simplerestapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping(produces = ["text/html"])
    fun helloWorld() = "Hello World from Spring Boot"
}