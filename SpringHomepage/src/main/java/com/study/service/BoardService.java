package com.study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.study.domain.Board;
import com.study.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	public Page<Board> list(Pageable pageable) {
		return boardRepository.findAll(pageable);
	}

    public Board insert(Board board) {
		return boardRepository.save(board);
    }

    public Optional<Board> selectDetail(Long bno) {
		return boardRepository.findById(bno)
				// 위 내용을 진행하기 전에 아래를 먼저 수행한다!
				// 조회수 올려야 하기 때문에!
				.map(board -> {
					board.setCount(board.getCount() + 1);
					return boardRepository.save(board);
				});
    }

	public Board update(Board board) {
		Board rboard = boardRepository.findById(board.getBno()).get();
		rboard.setTitle(board.getTitle());
		rboard.setContent(board.getContent());

		return boardRepository.save(rboard);
	}
}
