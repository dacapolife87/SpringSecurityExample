package me.hjjang.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtcController {

    @GetMapping("/etc")
    public String etc() {
        return "etc";
    }
}
