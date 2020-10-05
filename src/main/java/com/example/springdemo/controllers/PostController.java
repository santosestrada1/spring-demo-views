package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/post")
    @ResponseBody
    public String showPostList () {
        return "posts index page";
    }

    @GetMapping("/post/{id}")
    @ResponseBody
    public String showPost () {
        return "view an individual post";
    }

    @GetMapping("/post/create")
    @ResponseBody
    public String showCreatePost () {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }
}
