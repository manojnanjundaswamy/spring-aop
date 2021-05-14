package com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Configuration class to scan and configure aspects in the package
 * 
 * @author Manoj Nanjundaswamy
 * @since 01-05-2021
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aop")
public class Config {

}
