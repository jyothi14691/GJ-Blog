package com.zipcode.gjblog.repository;

import com.zipcode.gjblog.blogmodel.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends CrudRepository<Post,Long> {

    List<Post> findByTag(String tag);

    Post findByTag(String tag);

    @Query(value = "SELECT * FROM POST p WHERE p.TAG = ?1",nativeQuery = true)
    List<Post> findAllByTag(String tag);

}
