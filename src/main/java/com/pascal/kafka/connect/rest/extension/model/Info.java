package com.pascal.kafka.connect.rest.extension.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Value;

@Value
@JsonInclude(Include.NON_NULL)
public class Info {
    String name = "Kafka Connect";
}
