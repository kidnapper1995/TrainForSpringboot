package com.example.demo.config;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ning Baoqi
 * @date 2019/11/19 9:28
 */
@Configuration
@EnableKafka
public class KafkaConsumerConfig {
    @Value("${kafka.consumer.servers}")
    private String servers;
    @Value("${kafka.consumer.enable-auto-commit}")
    private boolean enableAutoCommit;
    @Value("${kafka.consumer.session-timeout}")
    private String sessionTimeout;
    @Value("${kafka.consumer.auto-commit-interval}")
    private String autoCommitInterval;
    @Value("${kafka.consumer.group-id}")
    private String groupId;
    @Value("${kafka.consumer.auto-offset-reset}")
    private String autoOffsetReset;
    @Value("${kafka.consumer.max-poll-records}")
    private Long maxPollRecord;
    @Value("${kafka.consumer.concurrency}")
    private int concurrency;
    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setConcurrency(concurrency);
        factory.getContainerProperties().setPollTimeout(maxPollRecord);
        return factory;
    }
    @Bean
    public ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfig());
    }
    @Bean
    public Map<String,Object> consumerConfig(){
        HashMap<String,Object> props=new HashMap<>();
        props.put("bootstrap.servers", servers);
        props.put("group.id", groupId);
        props.put("enable.auto.commit", enableAutoCommit);
        props.put("auto.commit.interval.ms", autoCommitInterval);
        props.put("session.timeout.ms", sessionTimeout);
        props.put("auto.offset.reset", autoOffsetReset);
        props.put("key.deserializer", StringDeserializer.class);
        props.put("value.deserializer", StringDeserializer.class);
        return props;
    }



    /**
     * kafka监听
     * @return
     */
   /* @Bean
    public RawDataListener listener() {
        return new RawDataListener();
    }*/

}
