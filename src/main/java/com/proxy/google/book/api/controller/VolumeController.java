package com.proxy.google.book.api.controller;

import com.proxy.google.book.api.service.VolumeService;
import com.proxy.google.book.api.domain.Volume;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/volume")
@Slf4j
public class VolumeController {

    @Autowired
    private VolumeService volumeService;

    @GetMapping
    public ResponseEntity<List<Volume>> search(@RequestParam(required = true) String title, @RequestParam(required = true) String author) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(volumeService.searchByTitleAndAuthor(title, author));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }


}
