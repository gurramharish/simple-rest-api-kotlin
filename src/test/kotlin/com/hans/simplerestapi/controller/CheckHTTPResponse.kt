package com.hans.simplerestapi.controller

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CheckHTTPResponse {

    @LocalServerPort
    var port: Int = 0

    @Autowired
    var testRestTemplate: TestRestTemplate? = null

    @Test
    fun `should pass if string matches`() {
        println("Port :::: to test ::: $port")
        Assertions.assertEquals("Hello World from Spring Boot",
            testRestTemplate?.getForObject("http://localhost:$port/", String::class.java))
    }



}