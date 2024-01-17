package com.study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.study.domain.Member;
import com.study.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

//	public Member insert(Member member) {
//		// save() : insert해주는 메소드
//		Member rMember = memberRepository.save(member);
//		return rMember;
//	}

	/*
	 * Optional<T> : NullpointerException 방지하기 위해 사용
	 * 				기존의 반환 값 타입 T에 Optional<T>를 Wrapping하여,
	 * 				null 대신 Optional안에 빈 타입 객체를 돌려준다
	 * 		ex) Member member = memberRepository.findById("userid"); -> 그 값이 없을 때
	 * 			member.getUsername(); => 호출시 NullpointerException 발생 
	 */
	public Optional<Member> select(Long id) {
		// findById() : Entity에서 @Id가 붙은 필드를 의미
		Optional<Member> member = memberRepository.findById(id);
		return member;
	}

	public List<Member> selectAll() {
		// List<Member> list = memberRepository.findAll();
		return memberRepository.findAll();
	}

	public void delete(Long id) {
		memberRepository.deleteById(id);
	}

	public Member update(Member member) {
//		Member rMember = memberRepository.save(member);
		return memberRepository.save(member);
	}

	public void insert() {
		Member member;
		member = new Member("test1@test.com","이순신");
		memberRepository.save(member);
		member = new Member("test2@test.com","강감찬");
		memberRepository.save(member);
		member = new Member("test3@test.com","김유신");
		memberRepository.save(member);
		member = new Member("test4@test.com","연개소문");
		memberRepository.save(member);
		member = new Member("test5@test.com","세종대왕");
		memberRepository.save(member);
		member = new Member("test6@test.com","계백");
		memberRepository.save(member);
		member = new Member("test7@test.com","최영");
		memberRepository.save(member);
		member = new Member("test8@test.com","김남신");
		memberRepository.save(member);
		member = new Member("test9@test.com","김옥신");
		memberRepository.save(member);
	}

	public Optional<Member> selectById(Long id) {
		return memberRepository.findById(id);	
	}

	public Optional<Member> selectByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

	public Optional<Member> selectByName(String name) {
		return memberRepository.findByName(name);
	}

	public List<Member> selectByNameLike(String name) {
		return memberRepository.findByNameLike(name);
	}

	public List<Member> selectByNameLikeDesc(String name) {
		return memberRepository.findByNameLikeOrderByNameDesc(name);
	}

	public List<Member> selectByNameLike(String name, Sort sort) {
		return memberRepository.findByNameLike(name, sort);
	}
	
}
