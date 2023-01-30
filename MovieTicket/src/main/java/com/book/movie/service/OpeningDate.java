package com.book.movie.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.movie.beans.CurrentDateOperation;



@Repository
public interface OpeningDate extends JpaRepository<CurrentDateOperation, Long> {

}
