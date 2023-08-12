package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "serie")
@Data
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer seasons;

    @Column(name = "chapter_for_season")
    private Integer chapterForSeason;

    @Column(name = "duration_for_chapter")
    private Integer durationForChapter;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_stream_page")
    private StreamPage streamPage;

    private String image;

    private String trailer;

    @Column(name = "currently_season")
    private Integer currentlySeason;

    @Column(name = "currently_chapter")
    private Integer currentlyChapter;

    @ManyToOne
    @JoinColumn(name = "id_state")
    private State state;

    private Integer rate;
}
