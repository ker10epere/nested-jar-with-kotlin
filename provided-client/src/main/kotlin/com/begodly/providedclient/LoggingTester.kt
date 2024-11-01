package com.begodly.providedclient

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Component

@Component
class LoggingTester {
    private val logger = KotlinLogging.logger {}

    constructor() {
        logger.info { ">> HELLO" }
    }
}