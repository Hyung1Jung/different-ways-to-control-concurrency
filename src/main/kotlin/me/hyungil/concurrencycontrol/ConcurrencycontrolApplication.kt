package me.hyungil.concurrencycontrol

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConcurrencycontrolApplication

fun main(args: Array<String>) {
	runApplication<ConcurrencycontrolApplication>(*args)
}
