package com.book.movie.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.movie.beans.MovieDetails;


@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {

}
