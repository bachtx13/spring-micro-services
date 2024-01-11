package com.bachtx.mangaservice.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Genre extends BaseEntity {
    private String name;
    @ManyToMany
    @JoinTable(
            name = "genre_manga",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "manga_id")
    )
    private List<Manga> mangas;
}
