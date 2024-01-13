package com.cs.ibit.controllers;

import com.cs.ibit.services.WebCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/web")
public class WebController {
    private WebCounterService webCounterService;
    @Autowired
    public WebController(WebCounterService webCounterService) {
        this.webCounterService = webCounterService;
    }
    @CrossOrigin
    @GetMapping("/counter")
    public ResponseEntity<Integer> getWebCounter(@RequestParam String siteName) {
        int counter = 0;
        try {
            counter = webCounterService.getCounter(siteName);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(counter);

    }
    @CrossOrigin
    @GetMapping("/incrementCounter")
    public ResponseEntity<Integer> incrementWebCounter(@RequestParam String siteName) {
        ResponseEntity<Integer> response = null;
        try {
            webCounterService.incrementCounter(siteName);
            response = getWebCounter(siteName);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return response;
    }
}
