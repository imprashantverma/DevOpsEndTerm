package com.example.manit.test.DevOpsTest.controller;

import com.example.manit.test.DevOpsTest.DTO.PostDTO;
import com.example.manit.test.DevOpsTest.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private  final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PostDTO>> getAllPost(){
        return  ResponseEntity.ok(postService.getAllPost());
    }

    @PostMapping("/create")
    public ResponseEntity<PostDTO> createNewPost(@RequestBody PostDTO postDTO) {
        return ResponseEntity.ok(postService.createNewPost(postDTO));
    }
}
