package com.proxy.google.book.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoogleVolumeResponse {

    private String kind;
    private Integer totalItems;
    private List<Volume> items;

}
