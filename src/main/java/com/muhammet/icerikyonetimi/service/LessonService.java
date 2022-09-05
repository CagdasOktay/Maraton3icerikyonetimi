
package com.muhammet.icerikyonetimi.service;

import com.muhammet.icerikyonetimi.repository.LessonRepository;
import com.muhammet.icerikyonetimi.repository.entity.Lesson;
import com.muhammet.icerikyonetimi.utility.MyFactoryService;


public class LessonService extends MyFactoryService<LessonRepository, Lesson, Long> {
    public LessonService(){
        super(new LessonRepository());
    }
}
