
package com.muhammet.icerikyonetimi.repository;

import com.muhammet.icerikyonetimi.repository.entity.Answers;
import com.muhammet.icerikyonetimi.utility.MyFactoryRepository;


public class AnswersRepository extends MyFactoryRepository<Answers, Long>{
    public AnswersRepository(){
    super(new Answers());
    
}
}
