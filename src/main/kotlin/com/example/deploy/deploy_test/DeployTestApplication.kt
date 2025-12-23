package com.example.deploy.deploy_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeployTestApplication

fun main(args: Array<String>) {
    println("hello222222")
	runApplication<DeployTestApplication>(*args)
}
