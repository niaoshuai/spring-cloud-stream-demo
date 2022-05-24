package ren.shuaipeng.cloud.stream;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.function.Consumer;

@Component
public class MessageStreamHandler {

    @Bean
    public Consumer<Date> registerEvent() {
        return message -> System.out.println(message);
    }

    @Bean
    public Consumer<String> loginEvent() {
        return message -> System.out.println(message);
    }
}
