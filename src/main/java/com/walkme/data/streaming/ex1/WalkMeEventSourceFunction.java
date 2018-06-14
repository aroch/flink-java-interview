package com.walkme.data.streaming.ex1;

import com.walkme.data.streaming.ex1.model.WalkMeEvent;
import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;

/**
 * Implement a source function which endlessly sends one <code>WalkMeEvent</code> per <code>intervalMillis</code>
 * <p>
 * The event should be sent with the current timestamp and a random userId (assume we have 10 users e.g. user-1...user-10)
 *
 * @see WalkMeEvent
 */
public class WalkMeEventSourceFunction extends RichParallelSourceFunction<WalkMeEvent> {

    public WalkMeEventSourceFunction(int intervalMillis) {
    }

    @Override
    public void run(SourceContext<WalkMeEvent> ctx) throws Exception {

    }

    @Override
    public void cancel() {

    }
}
