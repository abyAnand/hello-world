package com.demo.helloworld.repo;

import com.demo.helloworld.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<Demo, Integer> {
}
