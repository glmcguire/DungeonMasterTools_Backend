package com.dmtools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Gary Lee McGuire
 * 7/28/17.
 */
@SpringBootApplication
public class DMBackendApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DMBackendApplication.class);

    public static void main(String[] args){
        SpringApplication.run(DMBackendApplication.class, args);
    }
}
