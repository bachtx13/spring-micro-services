package com.bachtx.mangaservice.repositories;

import com.bachtx.mangaservice.entites.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MangaRepository extends JpaRepository<Manga, UUID> {
}
