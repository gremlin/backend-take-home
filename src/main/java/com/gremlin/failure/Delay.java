package com.gremlin.failure;

/**
 * An implementation of {@link Failure} which causes a delay by sleeping for the
 * specified amount of time.
 * @author forni
 */
public class Delay implements Failure {
    private final int length; // In millis

    public Delay(final int length) {
        this.length = length;
    }

    @Override
    public final void apply() {
        try {
            Thread.sleep(length);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
