package iunsuccessful.demo.dubbo.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * <p/>
 *
 * @author Created by 依韵 on 2019/2/28 .
 */
@ImportResource("classpath:provider.xml")
@EnableDubbo(scanBasePackages = "iunsuccessful.demo.dubbo.producer.api")
@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}
