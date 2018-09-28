package com.roek5803.simplevertex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.UUID;

public class SimpleVerticle extends AbstractVerticle {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleVerticle.class);

    @Override
    public void start(Future<Void> fut) {
        Router router = Router.router(vertx);
        router.get("/api/pi").blockingHandler(this::computePi, false);

        vertx
                .createHttpServer()
                .requestHandler(router::accept)
                .listen(8090);

        LOGGER.info("Service running on localhost:8090");
    }

    private void computePi(RoutingContext ctx) {
        LOGGER.debug(String.format("Received request on Thread: %s", Thread.currentThread().getName()));
        LOGGER.debug("Executing some business logic...");
        Double pi = Utils.computePi(10000000);
        LOGGER.debug("Done with business logic.");

        ctx.response().end(UUID.randomUUID().toString().concat("-" + pi));
    }

}
