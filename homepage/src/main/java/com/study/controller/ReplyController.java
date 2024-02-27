package com.study.controller;

import com.study.domain.Member;
import com.study.domain.Reply;
import com.study.service.ReplyService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReplyController {
    @Autowired
    private ReplyService replyService;


    @PostMapping("/rinsert")
    public ResponseEntity<?> insertReply(@RequestBody Reply reply, HttpSession session) {
        Member loginUser = (Member) session.getAttribute("loginUser");
        reply.setWriter(loginUser.getId());
        Reply savedReply = replyService.insert(reply);
        return ResponseEntity.ok(savedReply);
    }

//    @Controller
//    @PostMapping("/rinsert")
//    @ResponseBody
//    public String insertReply(@RequestBody Reply reply, HttpSession session, Model model) {
//        Member loginUser = (Member) session.getAttribute("loginUser");
//        model.addAttribute("loginUser", loginUser);
//        replyService.insert(reply);
//        return "redirect:detailForm";
//    }



}
