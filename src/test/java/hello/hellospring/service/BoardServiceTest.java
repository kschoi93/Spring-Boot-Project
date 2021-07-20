package hello.hellospring.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import hello.hellospring.domain.entity.Board;
import hello.hellospring.domain.repository.BoardRepository;
import hello.hellospring.dto.BoardDto;

public class BoardServiceTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    void 게시글_작성_테스트() {
        // given
        BoardDto dto = BoardDto.builder().title("testcase").content("textcaseContent").author("test").build();

        // when
        boardRepository.save(dto.toEntity());

        // then

    }
}
