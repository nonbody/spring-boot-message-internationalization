package com.example.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DemoController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/get")
    public String get() {
        return "hello world. " + LocaleContextHolder.getLocale() + " " + messageSource.getMessage("title.message", null, LocaleContextHolder.getLocale());
    }

    @PostMapping("/json")
    public JsonReq json(@RequestBody @Valid JsonReq jsonReq) {
        return jsonReq;
    }

}
