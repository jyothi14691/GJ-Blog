package com.zipcode.gjblog.blogcontroller;

import com.zipcode.gjblog.blogmodel.Post;
import com.zipcode.gjblog.blogmodel.PostContent;
import com.zipcode.gjblog.blogservice.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class BlogController {

    BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/blog/new")
    public Post createBlog(@RequestBody Post request){
        return blogService.postBlog(request);
    }

    @GetMapping("/blog/{id}")
    public PostContent displayBlog(@PathVariable long id){
        return blogService.getBlog(id);
    }

    @GetMapping("/blog/tag")
    public Post displayBlogByTag(@RequestParam(name = "tag") String searchTag){
        return blogService.getBlogByTag(searchTag);
    }

    @GetMapping("/blog/all")
    public List<Post> displayAllPosts(){
        return blogService.getAllBlog();
    }
}
