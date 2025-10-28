package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원이 저장소에 저장
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name); //Optional 기능을 사용하여 null 대신 한번 감싸는 용도
    List<Member> findAll(); //저장된 모든 회원 정보를 찾아줌
}
