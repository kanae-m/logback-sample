package com.example.sample02;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import com.example.sample01.Foo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

@Slf4j
public class Main {

    public static void main(String[] args) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        log.info("Entering application.");

        Foo foo = new Foo();
        foo.doIt();
        log.info("Exiting application.");
    }

}
