package com.amsidh.mvc.controller.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class TodoRequestModel implements Serializable {
    private String username;
    private String description;
}
