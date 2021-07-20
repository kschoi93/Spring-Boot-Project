package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hello.hellospring.domain.entity.Board;
import hello.hellospring.domain.repository.BoardRepository;
import hello.hellospring.dto.BoardDto;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class BoardServiceTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    void 게시글_작성_테스트() {
        // given
        BoardDto dto = BoardDto.builder().title("testcase").content("textcaseContent").author("test").build();

        // when
        Long result = boardRepository.save(dto.toEntity()).getNo();
        Optional<Board> board = boardRepository.findByNo(result);
        // then
        assertThat(board.get().getNo(), is(result));

    }
}
