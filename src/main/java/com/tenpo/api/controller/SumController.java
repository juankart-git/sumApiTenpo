package com.tenpo.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sum")
public class SumController {

    @GetMapping(path = "/{numberA}/{numberB}")
    @ResponseBody
    public Integer sum(@PathVariable int numberA, @PathVariable int numberB) {
        return numberA + numberB;
    }

}
