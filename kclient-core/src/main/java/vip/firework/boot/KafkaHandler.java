package vip.firework.boot;

import vip.firework.core.KafkaConsumer;
import vip.firework.core.KafkaProducer;
import vip.firework.exceptionhandler.ExceptionHandler;

import java.util.List;


/**
 * The context class which stores the runtime Kafka processor reference.
 * 
 * @author Robert Lee
 * @since Aug 21, 2015
 *
 */
public class KafkaHandler {
	private KafkaConsumer kafkaConsumer;

	private KafkaProducer kafkaProducer;

	private List<ExceptionHandler> excepHandlers;

	private KafkaHandlerMeta kafkaHandlerMeta;

	public KafkaHandler(KafkaConsumer kafkaConsumer,
			KafkaProducer kafkaProducer, List<ExceptionHandler> excepHandlers,
			KafkaHandlerMeta kafkaHandlerMeta) {
		super();
		this.kafkaConsumer = kafkaConsumer;
		this.kafkaProducer = kafkaProducer;
		this.excepHandlers = excepHandlers;
		this.kafkaHandlerMeta = kafkaHandlerMeta;
	}

	public KafkaConsumer getKafkaConsumer() {
		return kafkaConsumer;
	}

	public void setKafkaConsumer(KafkaConsumer kafkaConsumer) {
		this.kafkaConsumer = kafkaConsumer;
	}

	public KafkaProducer getKafkaProducer() {
		return kafkaProducer;
	}

	public void setKafkaProducer(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	public List<ExceptionHandler> getExcepHandlers() {
		return excepHandlers;
	}

	public void setExcepHandlers(List<ExceptionHandler> excepHandlers) {
		this.excepHandlers = excepHandlers;
	}

	public KafkaHandlerMeta getKafkaHandlerMeta() {
		return kafkaHandlerMeta;
	}

	public void setKafkaHandlerMeta(KafkaHandlerMeta kafkaHandlerMeta) {
		this.kafkaHandlerMeta = kafkaHandlerMeta;
	}

}
