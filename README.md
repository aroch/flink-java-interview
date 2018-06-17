# Flink Interview
## Ex. 1

The goal of this exercise is to:

 * Generate random WalkMeEvents in the WalkMeEventSourceFunction.
 * Write the code which aggregates the events in (Tumbling) window of 10 seconds.
 * Every 10 seconds print out the total number of events per user in the last 10 seconds. 

### Steps

* Implement the WalkMeEventSourceFunction class
* Implement the StreamingJob main function
* Run the StreamingJob class:

    ```
    mvn clean package
    mvn exec:java -Dexec.mainClass=com.walkme.data.streaming.ex1.StreamingJob
    ```

### Expected Output
```
21:26:22,145 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-2] Sent: [8] events
21:26:22,145 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-6] Sent: [8] events
21:26:22,145 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-0] Sent: [8] events
21:26:22,145 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-1] Sent: [8] events
21:26:32,104 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-4] Sent: [8] events
21:26:32,104 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-8] Sent: [8] events
21:26:32,105 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-1] Sent: [8] events
21:26:32,104 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-6] Sent: [16] events
21:26:32,104 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-9] Sent: [8] events
21:26:32,104 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-3] Sent: [8] events
21:26:32,105 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-5] Sent: [16] events
21:26:32,105 INFO  com.walkme.data.streaming.ex1.AggregationsSinkFunction        - User: [user-7] Sent: [8] events
```

For any Flink documentation see: [here](https://ci.apache.org/projects/flink/flink-docs-stable/)