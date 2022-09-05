
package com.muhammet.icerikyonetimi.service;

import com.muhammet.icerikyonetimi.repository.UserRepository;
import com.muhammet.icerikyonetimi.repository.entity.User;
import com.muhammet.icerikyonetimi.utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User, Long> {
    public UserService(){
        super(new UserRepository());
    }
}
