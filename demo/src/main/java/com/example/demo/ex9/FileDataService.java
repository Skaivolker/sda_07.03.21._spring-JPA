package com.example.demo.ex9;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileDataService {
    private final FileDataRepository fileDataRepository;

    public FileDataWrap getAll() {
        return new FileDataWrap(fileDataRepository.findAll());
    }
}