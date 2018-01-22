package com.claudio.backendninja.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("exampleComponent")
public class ExampleComponent {

    private static final Log LOOGER = LogFactory.getLog(ExampleComponent.class);


    public void sayHello(){
        LOOGER.info("Hello from exampleComponent");
    }

}
