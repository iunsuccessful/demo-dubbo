package iunsuccessful.demo.dubbo.producer.api;

import iunsuccessful.demo.dubbo.producer.DemoApi;
import iunsuccessful.demo.dubbo.producer.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p/>
 *
 * @author Created by 依韵 on 2019/2/28 .
 */
@Service(interfaceClass = DemoApi.class, timeout = 10000, retries = 0)
public class DemoApiRpc implements DemoApi {

    @Autowired
    private DemoService demoService;

    @Override
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
