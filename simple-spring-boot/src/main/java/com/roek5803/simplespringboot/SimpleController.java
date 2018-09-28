package com.roek5803.simplespringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/api")
public class SimpleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/pi", produces = MediaType.TEXT_PLAIN_VALUE)
    public String calculatePi() {
        LOGGER.debug(String.format("Received request on Thread: %s", Thread.currentThread().getName()));
        LOGGER.debug("Executing some business logic...");
        Utils.computePi(1000000);
        LOGGER.debug("Done with business logic.");

        return new Date().toString();
    }

}
