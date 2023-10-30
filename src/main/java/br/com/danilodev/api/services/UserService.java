package br.com.danilodev.api.services;

import br.com.danilodev.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
