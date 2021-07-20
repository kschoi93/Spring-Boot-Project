package hello.hellospring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import hello.hellospring.domain.entity.Board;
import hello.hellospring.domain.repository.BoardRepository;
import hello.hellospring.dto.BoardDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    // no 기준으로 내림차순 정렬
    @Transactional
    public Page<Board> allSelect(BoardDto dto) {
        // PageRequest.of(page, size, sort)
        // page = 0부터 시작한다
        return boardRepository.findAll(PageRequest.of(0, 10, Direction.DESC, "no"));
    }
}
