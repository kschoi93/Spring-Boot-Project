package hello.hellospring.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hello.hellospring.domain.entity.Member;
import hello.hellospring.dto.posts.MemberSignDto;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Query("select m from Member m where id = :id and pwd = :pwd")
    Member findMember(@Param("id") String id, @Param("pwd") String pwd);
}
