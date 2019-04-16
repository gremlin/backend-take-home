package com.gremlin.context;

import java.util.Optional;

import com.gremlin.failure.Failure;

import javax.ws.rs.container.ContainerRequestContext;

/**
 * {@link GremlinContext} uses a request context to determine if this request should be impacted. If it returns a
 * failure, you can apply() it via the {@link Failure} interface.
 * @author forni
 */
public final class GremlinContext {
    /**
     * TODO Fill me in.  Your code should take the {@link ContainerRequestContext}, which represents
     * an incoming HTTP request, and use that object to determine if failure should be applied.
     * If so, what kind of failure should be applied?
     * @param requestContext model of HTTP request.  Up to you how you want to read incoming data
     * HTTP headers, URI, query params are all accessible via this class
     * @return either a failure that should get applied, or nothing.  Currently hardcoded to always return nothing.
     */
    public static Optional<Failure> shouldFail(ContainerRequestContext requestContext) {
        return Optional.empty();
    }
}
