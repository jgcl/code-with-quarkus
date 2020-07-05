package org.joaogabriel.resources;

import io.vertx.ext.web.Router;

import javax.enterprise.event.Observes;

public class VertxResource {
    public void start(@Observes final Router router) {
        router
                .get("/vertx")
                .handler(rc -> rc.response().end("ola vertx"));
    }
}