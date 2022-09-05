
package com.muhammet.icerikyonetimi.repository;

import com.muhammet.icerikyonetimi.repository.entity.Subjectdetail;
import com.muhammet.icerikyonetimi.utility.MyFactoryRepository;


public class SubjectdetailRepository extends MyFactoryRepository<Subjectdetail, Long>{
    public SubjectdetailRepository(){
        super(new Subjectdetail());
    }
    
}
