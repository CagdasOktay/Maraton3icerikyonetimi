
package com.muhammet.icerikyonetimi.service;

import com.muhammet.icerikyonetimi.repository.QuestionsRepository;
import com.muhammet.icerikyonetimi.repository.entity.Questions;
import com.muhammet.icerikyonetimi.utility.MyFactoryService;


public class QuestionsService extends MyFactoryService<QuestionsRepository, Questions, Long> {
    public QuestionsService(){
        super(new QuestionsRepository());
    }
}
