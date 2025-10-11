package com.codingnomads.springdata.example.mybatis.mapperslesson;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
public class Book {
    private Long id;
    private String title;
    private String author;
    private double price;
    private int page;
}
