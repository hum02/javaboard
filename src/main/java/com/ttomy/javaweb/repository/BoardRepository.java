package com.ttomy.javaweb.repository;

import com.ttomy.javaweb.model.board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<board,Long> {

}
