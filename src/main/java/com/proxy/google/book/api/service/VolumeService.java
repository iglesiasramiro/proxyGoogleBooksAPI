package com.proxy.google.book.api.service;

import com.proxy.google.book.api.repository.VolumeRepository;
import com.proxy.google.book.api.client.GoogleBookAPIClient;
import com.proxy.google.book.api.domain.Volume;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class VolumeService {


    @Autowired
    private VolumeRepository volumeRepository;

    @Autowired
    private GoogleBookAPIClient googleBookAPIClient;

    @Async
    public void save(List<Volume> volumes) {
        for(Volume volume : volumes){
            Volume findDB = volumeRepository.findById(volume.getId());
            if(findDB == null) volumeRepository.insert(volume);
        }
    }

    public List<Volume> findInClient(String title, String author){
        log.info("SEARCH API");
        List<Volume> volumes = googleBookAPIClient.findVolume(title, author).getItems();
        if(volumes != null) save(volumes);
        return volumes;
    }

    public List<Volume> searchByTitleAndAuthor(String title, String author){
        List<Volume> volumes = volumeRepository.findByTitleAndAuthor(title, author);
        return Optional.ofNullable(volumes)
                .filter(v -> !v.isEmpty())
                .orElseGet(() -> this.findInClient(title, author));

    }



}
