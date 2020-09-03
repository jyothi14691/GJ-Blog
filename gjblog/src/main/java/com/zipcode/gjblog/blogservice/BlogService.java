package com.zipcode.gjblog.blogservice;

import com.zipcode.gjblog.blogmodel.Post;
import com.zipcode.gjblog.blogmodel.PostContent;
import com.zipcode.gjblog.repository.BlogRepository;
import com.zipcode.gjblog.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {

    BlogRepository blogRepository;

    @Autowired
    ContentRepository contentRepository;

    @Autowired
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Post postBlog(Post request) {
        Post savedPost = blogRepository.save(request);
        return savedPost;
    }

    public PostContent getBlog(long id) {
        return contentRepository.findById(id).get();
    }


    public Post getBlogByTag(String tag) {
        return blogRepository.findByTag(tag);
    }

    public List<Post> getAllBlog() {
        List<Post> resultList = new ArrayList<>();
       blogRepository.findAll().iterator().forEachRemaining(post -> resultList.add(post));
       return resultList;

      // return (List<Post>) blogRepository.findAll();
    }
}
