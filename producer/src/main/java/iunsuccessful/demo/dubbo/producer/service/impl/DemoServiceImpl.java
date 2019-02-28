package iunsuccessful.demo.dubbo.producer.service.impl;

import iunsuccessful.demo.dubbo.producer.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * <p/>
 *
 * @author Created by 依韵 on 2019/2/28 .
 */

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
