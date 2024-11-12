package com.example.manit.test.DevOpsTest.repositories;

import com.example.manit.test.DevOpsTest.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
