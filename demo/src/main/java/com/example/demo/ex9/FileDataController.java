package com.example.demo.ex9;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/files-data")
public class FileDataController {
    private final FileDataService fileDataService;

    @GetMapping
    public FileDataWrap getAll(){
        return fileDataService.getAll();
    }

    @GetMapping("/{id}")
    public FileData getById(@PathVariable("id") String fileId){
        return fileDataService.getById(fileId);
    }

    @PostMapping()
    public ResponseEntity<FileData> create(@RequestBody FileData fileData) {
        FileData savedFileData = fileDataService.save(fileData);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .location(URI.create("localhost:8080/api/files-data/" + savedFileData.getId()))
                .body(savedFileData);
    }

}

