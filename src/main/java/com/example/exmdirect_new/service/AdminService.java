package com.example.exmdirect_new.service;

import com.example.exmdirect_new.entity.Admin;
import com.example.exmdirect_new.repository.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends AbstractUserService<Admin> {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        super(adminRepository);
        this.adminRepository = adminRepository;
    }
}
