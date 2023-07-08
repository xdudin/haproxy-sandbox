package com.example.haproxy_sandbox;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@Slf4j
public class SandboxController {

    private int load = 0;

    @Value("${ID}")
    private String id;

    @GetMapping
    public String getLoad() {
        return getFormattedLoad();
    }

    @PostMapping
    public String setLoad(@RequestBody String load) {
        this.load = Integer.parseInt(load);
        return getFormattedLoad();
    }

    private String getFormattedLoad() {
        return String.format("Id = %s, load = %d", id, load);
    }

    @SneakyThrows
    @GetMapping("/heavy")
    public String heavyRequest() {
        Thread.sleep(5000);
        return "OK";
    }
}
