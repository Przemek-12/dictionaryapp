package com.app.dictionary.application.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class DictionaryListResponse {

    private int itemsOnPage;
    private int totalPages;
    private List<List<WordGetDTO>> dictionary;

}
