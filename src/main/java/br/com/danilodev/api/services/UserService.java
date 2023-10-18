package br.com.danilodev.api.services;

import br.com.danilodev.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
