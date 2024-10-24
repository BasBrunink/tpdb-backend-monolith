package io.elementall.tpdbbackend;

import org.springframework.boot.SpringApplication;

public class TestTpdbBackendMonolithApplication {

    public static void main(String[] args) {
        SpringApplication.from(TpdbBackendMonolithApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
