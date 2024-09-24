package com.amsidh.mvc.controller;

import com.amsidh.mvc.controller.model.TodoRequestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class TodoController {

    private final List<TodoRequestModel> TODOS_LIST = Arrays.asList(
            TodoRequestModel.builder().username("dummy").description("Lean Spring").build(),
            TodoRequestModel.builder().username("dummy").description("Lean Springboot").build(),
            TodoRequestModel.builder().username("dummy").description("Lean Spring Security").build()
    );

    @GetMapping("/{username}/todos")
    public List<TodoRequestModel> retrieveAllTodos(@PathVariable String username) {
        log.info("Retrieving all todos for user {}", username);
        return TODOS_LIST;
    }

    @PostMapping("/{username}/todos")
    public ResponseEntity<String> createTodo(@PathVariable String username, @RequestBody TodoRequestModel todoRequestModel) {
        return ResponseEntity.ok().body("Todo created successfully");
    }
}
