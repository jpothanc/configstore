package com.cs.ibit.controllers;

import com.cs.ibit.services.WebCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/web")
public class WebController {

    @Autowired
    private WebCounterService webCounterService;

    public WebController() {

    }

    @GetMapping("/counter")
    public ResponseEntity<Integer> getWebCounter(@RequestParam String siteName) {
        return ResponseEntity.ok(webCounterService.getCounter(siteName));
    }
    @GetMapping("/increment")
    public ResponseEntity<Integer> incrementWebCounter(@RequestParam String siteName) {
        webCounterService.incrementCounter(siteName);
        return ResponseEntity.ok(webCounterService.getCounter(siteName));
    }
}
