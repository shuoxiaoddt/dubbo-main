package com.ftd.dubbo.ex.action;

import com.ftd.dubbo.ex.AnnotationConstants;
import com.ftd.dubbo.ex.api.GreetingService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author xiaos
 * @date 2019/11/29 14:55
 */
@Component("annotationAction")
public class AnnotationAction {



    @Reference(interfaceClass = GreetingService.class,
            version = AnnotationConstants.VERSION,
            timeout = 1000,
            methods = {@Method(name = "greeting", timeout = 3000, retries = 1)})
    private GreetingService greetingService;

    public String doSayHello(String name) {
        try {
            return greetingService.greeting(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
    }


    public String doGreeting(String name) {
        try {
            return greetingService.greeting(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }

    }

    public String replyGreeting(String name) {
        try {
            return greetingService.replyGreeting(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
    }
}
