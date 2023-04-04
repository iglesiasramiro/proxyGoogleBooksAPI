package com.proxy.google.book.api.repository;


import com.proxy.google.book.api.domain.Volume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VolumeRepository {

    @Autowired
    private MongoTemplate template;

    public Volume findById(String id){
        return this.template.findById(id, Volume.class);
    }

    public List<Volume> findByTitleAndAuthor(String title, String author){
        Criteria criteria = new Criteria();
        return this.template.find(Query.query(criteria.and("mVolumeInfo.mTitle").is(title).and("mVolumeInfo.mAuthors").in(author)), Volume.class);
    }

    public void insert(Volume volume){
        this.template.insert(volume);
    }




}
