package iunsuccessful.demo.dubbo.consumer.web;

import iunsuccessful.demo.dubbo.producer.DemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p/>
 *
 * @author Created by 依韵 on 2019/2/28 .
 */
@RestController
public class HelloController {

    @Autowired
    private DemoApi demoApi;

    @RequestMapping("index")
    public String index() {
        return demoApi.sayHello("lqz");
    }

}
