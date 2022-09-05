
package com.muhammet.icerikyonetimi.repository;

import com.muhammet.icerikyonetimi.repository.entity.Questions;
import com.muhammet.icerikyonetimi.utility.MyFactoryRepository;


public class QuestionsRepository extends MyFactoryRepository<Questions, Long>{
    public QuestionsRepository(){
        super(new Questions());
    }
    
}
