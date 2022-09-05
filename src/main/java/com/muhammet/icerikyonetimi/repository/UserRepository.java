
package com.muhammet.icerikyonetimi.repository;

import com.muhammet.icerikyonetimi.repository.entity.User;
import com.muhammet.icerikyonetimi.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long>{
    public UserRepository(){
        super(new User());
    }
    
}