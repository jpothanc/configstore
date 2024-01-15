package com.ibit.controllers;

import com.ibit.common.CryptoManager;
import com.ibit.helpers.Helper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/config")
public class ConfigController {

    @GetMapping("/ping")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("healthy");
    }

    @GetMapping("/decrypt")
    public ResponseEntity<String> decrypt(@RequestParam String value) {
        String result = null;
        try {
            result = CryptoManager.decrypt(value, Helper.getPasswordEncryptionKey());
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/encrypt")
    public ResponseEntity<String> encrypt(@RequestParam String value) {
        String result = null;
        try {
            result = CryptoManager.encrypt(value, Helper.getPasswordEncryptionKey());
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
        return ResponseEntity.ok(result);
    }
}
