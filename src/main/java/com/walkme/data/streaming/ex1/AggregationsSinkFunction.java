package com.walkme.data.streaming.ex1;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This sink simply prints out tuples of <userId, counter>
 */
public class AggregationsSinkFunction implements SinkFunction<Tuple2<String, Long>> {

    private static Logger LOG = LoggerFactory.getLogger(AggregationsSinkFunction.class);

    public AggregationsSinkFunction() {
    }

    @Override
    public void invoke(Tuple2<String, Long> value, Context context) {
        LOG.info("User: [{}] Sent: [{}] events", value.f0, value.f1);
    }
}
