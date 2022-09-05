
package com.muhammet.icerikyonetimi.repository;

import com.muhammet.icerikyonetimi.repository.entity.Lesson;
import com.muhammet.icerikyonetimi.utility.MyFactoryRepository;


public class LessonRepository extends MyFactoryRepository<Lesson, Long>{
    public LessonRepository(){
        super(new Lesson());
    }
    
}
