package de.mvitz.examples.dwr.spring.annotation;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;

@Service
@RemoteProxy(name = "Greeter")
public final class Greeter {

    @RemoteMethod
    public String greet(String name) {
        return "Hello " + name + "!";
    }

}
