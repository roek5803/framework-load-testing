package com.roek5803.simplevertex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

import java.util.Date;

public class MyFirstVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> fut) {
        Router router = Router.router(vertx);
        router.get("/api/pi").blockingHandler(this::computePi, false);

        vertx
                .createHttpServer()
                .requestHandler(router::accept)
                .listen(8090);

        System.out.println("Service running on localhost:8090");
    }

    private void computePi(RoutingContext ctx) {
        System.out.println(String.format("Received request on Thread: %s", Thread.currentThread().getName()));
        System.out.println("Executing some business logic...");
        Utils.computePi(1000000);
        System.out.println("Done with business logic.");
        ctx.response().end(new Date().toString());
    }

}
