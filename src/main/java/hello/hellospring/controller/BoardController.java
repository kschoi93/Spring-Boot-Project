package hello.hellospring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.hellospring.dto.BoardDto;
import hello.hellospring.service.BoardService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    // 글쓰기 페이지 이동
    @GetMapping("/board")
    public String boardWrite() {
        return "board/write";
    }

    // 글수정 페이지 이동
    @GetMapping("/board/edit")
    public String boardEdit(@RequestParam("no") long no, Model model) {
        model.addAttribute("editList", boardService.boardSelect(no).get());
        return "board/edit";
    }

    // 글저장
    @PostMapping("/board")
    public String boardWrite(HttpSession session, BoardDto dto) {
        dto.setAuthor((String) session.getAttribute("logName"));

        Long result = boardService.save(dto);

        if (result != 0) {
            return "redirect:/";
        } else {
            return "board/failed";
        }
    }

    // 글조회
    @GetMapping("/board/{no}")
    public String boardView(@PathVariable("no") long no, Model model) {
        model.addAttribute("viewList", boardService.boardSelect(no).get());
        return "board/view";
    }

    // 글삭제
    @DeleteMapping("/board/{no}")
    public void boardDelete(@PathVariable("no") long no) {
        boardService.boardDelete(no);
    }

    // 글수정
    @PutMapping("/board")
    public String boardUpdate(BoardDto dto) {
        long result = boardService.boardUpdate(dto);

        if (result != 0) {
            return "redirect:/";
        } else {
            return "board/failed";
        }

    }

}
