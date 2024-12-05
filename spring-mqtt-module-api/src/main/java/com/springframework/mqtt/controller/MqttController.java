package com.springframework.mqtt.controller;

import com.springframework.mqtt.service.MqttService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mqtt")
@RequiredArgsConstructor
public class MqttController {

    private final MqttService mqttService;

}
