package com.gremlininc.context;

import java.util.Optional;

import com.gremlininc.failure.Failure;
import com.sun.xml.internal.ws.client.RequestContext;

/**
 * {@link GremlinContext} uses {@link RequestContext} to determine if this request should be impacted. If it returns a
 * failure, you can apply()` it via the {@link Failure} interface.
 * @author forni
 */
public final class GremlinContext {
    // TODO fill me in
    public static Optional<Failure> shouldFail(RequestContext context) {
        return Optional.empty();
    }
}
