package com.example.demo.service.impl;

import com.example.demo.model.Host;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.HostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServiceImpl implements HostService {

    private final HostRepository hostRepository;

    public HostServiceImpl(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @Override
    public Host createHost(Host host) {
        if (hostRepository.existsByEmail(host.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        return hostRepository.save(host);
    }

    @Override
    public Host getHostById(Long id) {
        return hostRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Host not found"));
    }

    @Override
    public List<Host> getAllHosts() {
        return hostRepository.findAll();
    }

    @Override
    public Host updateHost(Long id, Host host) {
        Host existingHost = getHostById(id);

        existingHost.setHostName(host.getHostName());
        existingHost.setFullname(host.getFullname());
        existingHost.setEmail(host.getEmail());
        existingHost.setDepartment(host.getDepartment());
        existingHost.setPhone(host.getPhone());

        return hostRepository.save(existingHost);
    }

    @Override
    public void deleteHost(Long id) {
        Host host = getHostById(id);
        hostRepository.delete(host);
    }
}
