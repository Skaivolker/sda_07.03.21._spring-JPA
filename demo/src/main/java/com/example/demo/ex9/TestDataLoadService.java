package com.example.demo.ex9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestDataLoadService implements CommandLineRunner {

    private final FileDataRepository fileDataRepository;

    public TestDataLoadService(FileDataRepository fileDataRepository) {
        this.fileDataRepository = fileDataRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        fileDataRepository.saveAll(
                List.of(
                        FileData.builder().fileName("smt").build(),
                        FileData.builder().fileName("smt2").build(),
                        FileData.builder().fileName("smt3").build(),
                        FileData.builder().fileName("smt4").build()
                )
        );
        List<FileData> all = fileDataRepository.findAll();
        log.info(String.valueOf(all));

    }
}
