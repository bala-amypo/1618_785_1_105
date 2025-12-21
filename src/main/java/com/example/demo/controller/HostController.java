package com.example.demo.controller;

import com.example.demo.model.Host;
import com.example.demo.service.HostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hosts")
public class HostController {

    private final HostService hostService;

    public HostController(HostService hostService) {
        this.hostService = hostService;
    }

    @PostMapping
    public ResponseEntity<Host> createHost(@RequestBody Host host) {
        return new ResponseEntity<>(hostService.createHost(host), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Host> getHostById(@PathVariable Long id) {
        return ResponseEntity.ok(hostService.getHostById(id));
    }

    @GetMapping
    public ResponseEntity<List<Host>> getAllHosts() {
        return ResponseEntity.ok(hostService.getAllHosts());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Host> updateHost(
            @PathVariable Long id,
            @RequestBody Host host) {
        return ResponseEntity.ok(hostService.updateHost(id, host));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHost(@PathVariable Long id) {
        hostService.deleteHost(id);
        return ResponseEntity.noContent().build();
    }
}
