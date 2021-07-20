package hello.hellospring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.dto.BoardDto;
import hello.hellospring.service.BoardService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    @GetMapping("/board")
    public String write() {
        return "board/write";
    }

    @PostMapping("/board")
    public String write(HttpSession session, BoardDto dto) {
        dto.setAuthor((String) session.getAttribute("logName"));

        Long result = boardService.save(dto);

        if (result != 0) {
            return "redirect:/";
        } else {
            return "board/failed";
        }

    }
}
