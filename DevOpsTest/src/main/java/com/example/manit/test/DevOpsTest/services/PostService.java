package com.example.manit.test.DevOpsTest.services;

import com.example.manit.test.DevOpsTest.DTO.PostDTO;
import com.example.manit.test.DevOpsTest.entities.PostEntity;
import com.example.manit.test.DevOpsTest.repositories.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;


    public PostService(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }


    public PostDTO createNewPost(PostDTO postDTO) {
        PostEntity toBeCreated = modelMapper.map(postDTO,PostEntity.class);
        System.out.println(toBeCreated.getContent());
        System.out.println(toBeCreated.getContent());
        PostEntity post = postRepository.save(toBeCreated);
        return modelMapper.map(post,PostDTO.class);
    }

    public List<PostDTO> getAllPost() {
        List<PostEntity> posts = postRepository.findAll();
        return posts.stream()
                .map(post->modelMapper.map(post,PostDTO.class))
                .toList();
    }
}
