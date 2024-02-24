package br.com.danilodev.api.services;

import br.com.danilodev.api.domain.User;
import br.com.danilodev.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);
}
