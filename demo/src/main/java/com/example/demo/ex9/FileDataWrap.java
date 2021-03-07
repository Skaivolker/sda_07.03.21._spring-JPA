package com.example.demo.ex9;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class FileDataWrap {
    private List<FileData> all;
}
