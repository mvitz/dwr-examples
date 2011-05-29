package de.mvitz.examples.dwr.plain.annotation;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;

@RemoteProxy
public final class Greeter {

    @RemoteMethod
    public String greet(String name) {
        return "Hello " + name + "!";
    }

}
