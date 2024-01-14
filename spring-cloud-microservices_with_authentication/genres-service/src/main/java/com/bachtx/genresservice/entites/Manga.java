package com.bachtx.genresservice.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Manga extends BaseEntity {
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToMany(mappedBy = "mangas")
    private List<Genre> genres;
}
