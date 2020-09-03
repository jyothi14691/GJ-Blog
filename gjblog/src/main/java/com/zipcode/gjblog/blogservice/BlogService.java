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


    public List<Post> getBlogByTag(String tag) {
        List<Post> resultPosts = new ArrayList<>();
        blogRepository.findAllByTag(tag).iterator().forEachRemaining(post -> resultPosts.add(post));
        return resultPosts;
    }



    public List<Post> getAllBlog() {
        List<Post> resultList = new ArrayList<>();
        blogRepository.findAll().iterator().forEachRemaining(post -> resultList.add(post));
        return resultList;
    }
}
