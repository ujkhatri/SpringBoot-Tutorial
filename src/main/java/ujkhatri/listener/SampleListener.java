package ujkhatri.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class SampleListener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "myQueue", durable = "true"),
            exchange = @Exchange(value = "deadLetterExchange", type = "direct"),
            arguments = {@Argument(name = "x-dead-letter-exchange", value = "deadLetterExchange"),
                            @Argument(name = "x-dead-letter-routing-key", value = "deadLetterRoutingKey")},
            key = "myRoutingKey"
    ))
    public void handleMessage(Message message, Channel channel) throws IOException {
        // Process the received message
        System.out.println("Received message: " + new String(message.getBody()));
        channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
    }
}
