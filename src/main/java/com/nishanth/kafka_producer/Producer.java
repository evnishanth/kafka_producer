package com.nishanth.kafka_producer;
import java.util.*;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer {
	
	public static void main(String [] args) throws Exception{
		
		String topicName = "MyOwnTopic";
		String key = "Nishanth";
		String value = "Hello";
		
		Properties properties = new Properties();
		
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer", "org.apache.kafka.common.serializa-tion.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.commom.seriali-zation.StringSerializer");
		
		//ProducerConfig config = new ProducerConfig(properties);
		
		System.out.println("Message sent");
		KafkaProducer<String, String> producer = new KafkaProducer <String, String> (properties);
		
		ProducerRecord <String, String> record = new ProducerRecord <> (topicName, key, value);
		producer.send(record);
		
		producer.close();
		
		System.out.println("Message sent");
	}

}
