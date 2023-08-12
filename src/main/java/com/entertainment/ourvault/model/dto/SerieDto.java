package com.entertainment.ourvault.model.dto;

import lombok.Data;

@Data
public class SerieDto {

    private Integer id;

    private String name;

    private Integer chapterForSeason;

    private Integer durationForChapter;

    private CategoryDto category;

    private StreamPageDto streamPage;

    private String image;

    private String trailer;

    private Integer currentlySeason;

    private Integer currentlyChapter;

    private StateDto state;

    private Integer rate;
}
