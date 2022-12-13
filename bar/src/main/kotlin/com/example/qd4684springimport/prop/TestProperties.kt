package com.example.qd4684springimport.prop

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("qd4684.test")
data class TestProperties(
    val value: String
)
