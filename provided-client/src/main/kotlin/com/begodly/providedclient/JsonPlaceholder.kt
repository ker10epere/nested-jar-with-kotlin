package com.begodly.providedclient

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.client.RestClient

@Configuration
//@SpringBootApplication
//@Suppress("SpringJavaInjectionPointsAutowiringInspection")
class JsonPlaceholder(clientBuilder: RestClient.Builder) : CommandLineRunner {
    private final val client: RestClient

    init {
        this.client = clientBuilder.build()
    }

    override fun run(vararg args: String?) {
        val response = client
                .get()
                .uri("https://icanhazdadjoke.com/")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(String::class.java)
                .body ?: "No Response"
        System.out.println("<<<<<<<<<<<<< $response")
    }
}

//fun main() {
//    SpringApplication(JsonPlaceholder::class.java)
//            .run()
////    val responseText = RestClient.builder()
////            .build()
////            .get()
////            .uri("https://icanhazdadjoke.com/")
////            .accept(MediaType.APPLICATION_JSON)
////            .retrieve()
////            .toEntity(String::class.java)
////            .body ?: ""
////    println(responseText)
//}