package com.proxy.google.book.api.client;

import com.proxy.google.book.api.domain.GoogleVolumeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class GoogleBookAPIClient {

    @Value("${google.book.api.uri}")
    private String baseUrl;

    @Autowired
    private RestTemplate restTemplate;

    public GoogleVolumeResponse findVolume(String title, String author) {
        return restTemplate.getForObject(baseUrl + "?q=" + buildQueryString(title, author), GoogleVolumeResponse.class);
    }


    private String buildQueryString(String title, String author){
        StringBuilder builder = new StringBuilder();
        if(title != null) builder.append( "intitle:" + title);
        if(title != null && author != null) builder.append("+");
        if(author != null) builder.append( "inauthor:" + author);
        return builder.toString();
    }

}
