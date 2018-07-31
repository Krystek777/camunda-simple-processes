package com.opitz.controller;


import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class UserController {

    @Autowired
    private RuntimeService runtimeService;

    @RequestMapping(value="/increment/user/name={name}/id={id}", method = RequestMethod.GET )
    public void increment(@PathVariable String name, @PathVariable int id) {
        System.out.println(name + " " + id);
       launch(name, id, true);
    }

    @RequestMapping(value="/decrement/user/name={name}/id={id}", method = RequestMethod.GET )
    public void decrement(@PathVariable String name, @PathVariable int id) {
       launch(name, id, false);
    }

    private void launch(String name, long id, boolean increment) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("name",name);
        variables.put("id",id);
        variables.put("increment",increment);
        runtimeService.startProcessInstanceByKey("userStartFormProcess", variables);
    }

}
