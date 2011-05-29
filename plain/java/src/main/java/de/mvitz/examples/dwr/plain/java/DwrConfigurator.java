package de.mvitz.examples.dwr.plain.java;

import org.directwebremoting.fluent.FluentConfigurator;

public final class DwrConfigurator extends FluentConfigurator {

    @Override
    public void configure() {
        withCreator("new", "Greeter")
            .addParam("class", Greeter.class.getName());
    }

}
