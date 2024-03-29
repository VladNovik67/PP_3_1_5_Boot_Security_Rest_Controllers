package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.entities.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import java.util.List;


@Service
public class RoleServiceImp implements RoleService {

    final private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleRepository.save(role);
    }

}
