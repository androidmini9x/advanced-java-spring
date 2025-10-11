/* CodingNomads (C)2024 */
package com.codingnomads.springdata.example.mybatis.mapperslesson;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyBatisDemoApplication {

    /* Before running this app, be sure to:

       * create a new empty schema in the mysql database named "mybatis"

       * execute the SQL found "songs_table.sql" on the mybatis schema

       * update the "spring.datasource.url" property in your application.properties file to
         jdbc:mysql://localhost:3306/mybatis?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC

    */

    public static void main(String[] args) {
        SpringApplication.run(MyBatisDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadInitialData(SongMapper songMapper, BookMapper bookMapper) {
        return (args) -> {
//            Song song1 = new Song();
//            song1.setName("Minnesota, WI");
//            song1.setAlbum_name("Bon Iver");
//            song1.setArtist_name("Bon Iver");
//            song1.setSong_length(232);
//
//            Song song2 = new Song();
//            song2.setName("Post Humorous");
//            song2.setAlbum_name("Orca");
//            song2.setArtist_name("Gus Dapperton");
//            song2.setSong_length(279);
//
//            songMapper.insertNewSong(song1);
//            songMapper.insertNewSong(song2);
//
//            Song song3 = songMapper.getSongById(1L);
//
//            List<Song> longSongs = songMapper.getSongsWithLengthGreaterThan(250);
//
//            longSongs.forEach(System.out::println);
//
//            System.out.println(song3.toString());

//            Book bk1 = Book.builder()
//                    .title("John")
//                    .author("Emily Stone")
//                    .price(12.99)
//                    .page(250)
//                    .build();
//
//            Book bk2 = Book.builder()
//                    .title("The Silent River")
//                    .author("Daniel Ross")
//                    .price(15.50)
//                    .page(320)
//                    .build();
//
//            Book bk3 = Book.builder()
//                    .title("Whispers of Time")
//                    .author("Clara Benson")
//                    .price(9.75)
//                    .page(198)
//                    .build();
//
//            Book bk4 = Book.builder()
//                    .title("Mountains Beyond")
//                    .author("Henry Lee")
//                    .price(18.00)
//                    .page(400)
//                    .build();
//
//            Book bk5 = Book.builder()
//                    .title("Echoes in the Dark")
//                    .author("Nora Hayes")
//                    .price(14.20)
//                    .page(275)
//                    .build();
//
//            bookMapper.addBook(bk1);
//            bookMapper.addBook(bk2);
//            bookMapper.addBook(bk3);
//            bookMapper.addBook(bk4);
//            bookMapper.addBook(bk5);
            System.out.println("====== Get All Books ======");
            List<Book> books = bookMapper.getAllBooks();
            for (Book bk : books) {
                System.out.println(bk);
            }
            System.out.println("====== Get Book By ID(2) ======");
            Book bk1 = bookMapper.getBookById(2l);
            System.out.println(bk1);
            System.out.println("====== Update Book By ID(2) ======");
            bk1.setAuthor("John Kently");
            bookMapper.updateBook(bk1);
            bk1 = bookMapper.getBookById(2l);
            System.out.println(bk1);
            System.out.println("====== Update Book By ID(2) ======");
            bookMapper.deleteBook(2l);
            System.out.println("====== Get All Books ======");
            books = bookMapper.getAllBooks();
            for (Book bk : books) {
                System.out.println(bk);
            }
        };
    }
}
