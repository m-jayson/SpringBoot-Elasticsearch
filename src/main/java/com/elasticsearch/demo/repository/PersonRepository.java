package com.elasticsearch.demo.repository;

import com.elasticsearch.demo.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person,String> {
}
