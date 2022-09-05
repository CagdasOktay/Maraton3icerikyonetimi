
package com.muhammet.icerikyonetimi.service;

import com.muhammet.icerikyonetimi.repository.AnswersRepository;
import com.muhammet.icerikyonetimi.repository.entity.Answers;
import com.muhammet.icerikyonetimi.utility.MyFactoryService;


public class AnswersService extends MyFactoryService<AnswersRepository, Answers, Long> {
    public AnswersService(){
        super(new AnswersRepository());
    }
}
