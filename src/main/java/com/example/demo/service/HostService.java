package com.example.demo.service;

import com.example.demo.model.Host;

import java.util.List;

public interface HostService {

    Host createHost(Host host);

    Host getHostById(Long id);

    List<Host> getAllHosts();

    Host updateHost(Long id, Host host);

    void deleteHost(Long id);
}
