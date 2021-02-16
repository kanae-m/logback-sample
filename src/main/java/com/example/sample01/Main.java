package com.example.sample01;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Entering application.");

        Foo foo = new Foo();
        foo.doIt();
        log.info("Exiting application.");
    }

}
