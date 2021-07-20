package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.dto.BoardDto;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {

    @GetMapping("/board")
    public String write() {
        return "board/write.html";
    }

    @PostMapping("/board")
    public String write(BoardDto dto) {
        return "redirect:/";
    }
}
