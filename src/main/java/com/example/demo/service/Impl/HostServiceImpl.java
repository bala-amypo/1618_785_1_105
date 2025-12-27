// package com.example.demo.service.impl;

// import com.example.demo.model.Host;
// import com.example.demo.repository.HostRepository;
// import com.example.demo.service.HostService;
// import com.example.demo.exception.ResourceNotFoundException;
// import java.util.List;
// import org.springframework.stereotype.Service;

// @Service
// public class HostServiceImpl implements HostService {

//     HostRepository hostRepository;

//     public HostServiceImpl() {}

//     public HostServiceImpl(HostRepository hostRepository) {
//         this.hostRepository = hostRepository;
//     }

//     @Override
//     public Host createHost(Host host) {
//         return hostRepository.save(host);
//     }

//     @Override
//     public Host getHost(Long id) {
//         return hostRepository.findById(id)
//                 .orElseThrow(() -> new ResourceNotFoundException("Host not found"));
//     }

//     @Override
//     public List<Host> getAllHosts() {
//         return hostRepository.findAll();
//     }
// }


package com.example.demo.service.Impl;

import com.example.demo.repository.HostRepository;
import com.example.demo.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Essential: Tells Spring this is a managed bean
public class HostServiceImpl implements HostService {

    private final HostRepository hostRepository;

    @Autowired // Spring uses this to inject the bean
    public HostServiceImpl(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @Override
    public Host createHost(Host host) {
        // This will no longer be null
        return hostRepository.save(host);
    }
}