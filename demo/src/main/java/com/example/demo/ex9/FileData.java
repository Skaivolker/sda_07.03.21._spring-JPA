package com.example.demo.ex9;

import javax.persistence.*;

@Entity(name = "files_data")
public class FileData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size_in_kb")
    private int sizeInKb;

    @Column(name = "content")
    private String content;
}
