package com.example.message.controller;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class JsonReq {
    private String id;
    @NotEmpty(message = "{valid.id}")
    private String name;
}
