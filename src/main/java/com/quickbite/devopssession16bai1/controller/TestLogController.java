package com.quickbite.devopssession16bai1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestLogController {

    private static final Logger log = LoggerFactory.getLogger(TestLogController.class);

    @GetMapping("/test-error")
    public String testError() {
        try {
            // Co tinh nem Exception de kiem thu ghi Log JSON
            throw new RuntimeException("Loi thu nghiem dinh dang Log JSON va StackTrace cho ELK");
        } catch (Exception e) {
            log.error("Da xay ra loi he thong khi xu ly request!", e);
            return "Test Log Exception successfully!";
        }
    }
}