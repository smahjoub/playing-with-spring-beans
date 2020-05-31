package com.smahjoub.beans.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.smahjoub.beans.components"})
public class SimpleConfiguration {
}
