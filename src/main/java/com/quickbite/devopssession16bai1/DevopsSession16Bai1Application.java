package com.quickbite.devopssession16bai1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsSession16Bai1Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DevopsSession16Bai1Application.class);

    @Override
    public void run(String... args) {
        log.trace("TRACE log - Chi xuat hien khi o muc TRACE");
        log.debug("DEBUG log - Chi xuat hien o moi truong DEV");
        log.info("INFO log - System running normally on PROD profile");
        log.warn("WARN log - Warning message");
        log.error("ERROR log - Error message");
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsSession16Bai1Application.class, args);
    }

}
