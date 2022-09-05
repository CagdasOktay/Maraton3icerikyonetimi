
package com.muhammet.icerikyonetimi.repository;

import com.muhammet.icerikyonetimi.repository.entity.Subject;
import com.muhammet.icerikyonetimi.utility.MyFactoryRepository;


public class SubjectRepository extends MyFactoryRepository<Subject, Long>{
    public SubjectRepository(){
        super(new Subject());
    }
    
}
