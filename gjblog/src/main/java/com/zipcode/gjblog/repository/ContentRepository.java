package com.zipcode.gjblog.repository;

import com.zipcode.gjblog.blogmodel.PostContent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends CrudRepository<PostContent,Long> {

}
