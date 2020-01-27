package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class PostController {
    @GetMapping("/index")
    public String postsIndex(){
        return "index";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId(@PathVariable int id){
        return "View an individual post from id #" + id + ".";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreateForm(){
        return "View the form for creating a post";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String postsCreate(){
        return "Create a new post";
    }
}
