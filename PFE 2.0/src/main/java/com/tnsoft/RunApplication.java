package com.tnsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class RunApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(RunApplication.class);
    @Autowired
    private Environment environment;
    public static void main(String[] args) throws UnknownHostException {

        SpringApplication application = new SpringApplication(RunApplication.class);
        Environment environment = application.run(args).getEnvironment();
        LOGGER.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://localhost:{}/api/swagger-ui/#/\n\t" +
                        "External: \thttp://{}:{}/api/swagger-ui/#/\n----------------------------------------------------------",

                environment.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                environment.getProperty("server.port")
        );

        //logger demo
        //LOGGER.debug("Starting application ==> debug lvl");
        //LOGGER.info("Starting application ==> info lvl");
        //LOGGER.warn("Starting application ==> warn lvl");
        //LOGGER.error("Starting application ==> error lvl");
    }
}
