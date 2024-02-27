package com.study.service;

import com.study.domain.Reply;
import com.study.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReplyService {
    @Autowired
    private ReplyRepository replyRepository;


    public ArrayList<Reply> replyList(Long rno) {
        return replyRepository.findAllByRno(rno);
    }

    public Reply insert(Reply reply) {
        return replyRepository.save(reply);
    }
}
