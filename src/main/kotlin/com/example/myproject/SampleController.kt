package com.example.myproject

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @RequestMapping("/")
    @ResponseBody
    fun home(): String {
        return "Hello World!"
    }
}