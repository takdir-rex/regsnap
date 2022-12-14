package org.apache.flink.streaming.examples.join;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeHint;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.tuple.Tuple2;

import java.io.IOException;

public class TopicInputSchema implements DeserializationSchema<Tuple2<String, Integer>> {

    @Override
    public Tuple2<String, Integer> deserialize(byte[] message) throws IOException {
        String[] values = new String(message).split(",");
        return new Tuple2<String, Integer>(values[0], Integer.valueOf(values[1]));
    }

    @Override
    public boolean isEndOfStream(Tuple2<String, Integer> nextElement) {
        return false;
    }

    @Override
    public TypeInformation<Tuple2<String, Integer>> getProducedType() {
        return TypeInformation.of(new TypeHint<Tuple2<String, Integer>>() {});
    }
}
