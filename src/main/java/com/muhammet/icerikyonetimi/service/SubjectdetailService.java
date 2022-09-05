
package com.muhammet.icerikyonetimi.service;

import com.muhammet.icerikyonetimi.repository.SubjectdetailRepository;
import com.muhammet.icerikyonetimi.repository.entity.Answers;
import com.muhammet.icerikyonetimi.utility.MyFactoryService;

public class SubjectdetailService extends MyFactoryService<SubjectdetailRepository, Answers, Long> {
    public SubjectdetailService(){
        super(new SubjectdetailRepository());
    }
}
