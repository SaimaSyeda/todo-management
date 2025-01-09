package com.saima.todo.dto;



public record TodoDto(Long id,
                      String title,
                      String description,
                      boolean completed) {
}
