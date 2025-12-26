package com.example.demo.controller;

import com.example.demo.model.Host;
import com.example.demo.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hosts")
public class HostController {

    @Autowired
    private HostService hostService;

    @PostMapping
    public Host create(@RequestBody Host host) {
        return hostService.createHost(host);
    }

    @GetMapping("/{id}")
    public Host get(@PathVariable Long id) {
        return hostService.getHost(id);
    }

    @GetMapping
    public List<Host> getAll() {
        return hostService.getAllHosts();
    }
}
