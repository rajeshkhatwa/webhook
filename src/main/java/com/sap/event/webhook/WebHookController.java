package com.sap.event.webhook;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebHookController {

    @GetMapping("/name")
    public String getName()
    {
        return "Rajesh Khatwa"; }
    
}
    

