package com.codingnomads.springdata.example.mybatis.mapperslesson;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Insert(value = "INSERT INTO books (title, author, price, page) VALUES (#{title}, #{author}, #{price}, #{page})")
    void addBook(Book book);

    @Select("SELECT * FROM books")
    List<Book> getAllBooks();

    @Select("SELECT * FROM books WHERE id = #{id}")
    Book getBookById(Long id);

    @Update("UPDATE books SET title = #{title}, author = #{author}, price = #{price}, page = #{page} WHERE id = #{id}")
    int updateBook(Book book);

    @Delete("DELETE FROM books WHERE id = #{id}")
    void deleteBook(Long id);

}
