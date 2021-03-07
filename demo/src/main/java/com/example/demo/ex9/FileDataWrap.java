package com.example.demo.ex9;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

@Data
@AllArgsConstructor
public class FileDataWrap {
    private List<FileData> all;
}
