package hello.hellospring.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import hello.hellospring.domain.entity.Board;
import hello.hellospring.domain.repository.BoardRepository;

public class BoardServiceTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    void 게시물_데이터_불러오기_확인() {
        // given
        List<Board> board = boardRepository.findAll();

        // when

        // then

    }
}
