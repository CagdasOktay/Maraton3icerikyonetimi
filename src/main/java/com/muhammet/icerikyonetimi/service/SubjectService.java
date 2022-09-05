
package com.muhammet.icerikyonetimi.service;

import com.muhammet.icerikyonetimi.repository.SubjectRepository;
import com.muhammet.icerikyonetimi.repository.entity.Subject;
import com.muhammet.icerikyonetimi.utility.MyFactoryService;


public class SubjectService extends MyFactoryService<SubjectRepository, Subject, Long> {
    public SubjectService(){
        super(new SubjectRepository());
    }
}
