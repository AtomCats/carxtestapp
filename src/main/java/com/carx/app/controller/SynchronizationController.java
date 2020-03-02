package com.carx.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/synchronization/{userId}")
public class SynchronizationController {

    @PostMapping(value = "/userdata")
    public void updateUserGameData() {

    }

    @GetMapping(value = "/userdata")
    public void getUserGameData() {

    }

    @PostMapping(value = "/statistics")
    public void updateUserGameStatistics() {

    }
}
