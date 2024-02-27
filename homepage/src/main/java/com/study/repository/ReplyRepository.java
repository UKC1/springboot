package com.study.repository;

import com.study.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    ArrayList<Reply> findAllByRno(Long rno);
}
