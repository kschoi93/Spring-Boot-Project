package hello.hellospring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.domain.entity.Member;
import hello.hellospring.dto.posts.MemberSignDto;
import hello.hellospring.dto.posts.PostsSaveRequestDto;
import hello.hellospring.service.MemberService;
import hello.hellospring.service.PostsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class IndexController {

    private PostsService postsService;
    private MemberService memberService;

    @PostMapping("/posts")
    public String savePosts(PostsSaveRequestDto dto) {
        postsService.save(dto);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();

        return "redirect:/";
    }

    @GetMapping("/signInForm")
    public String signInForm() {
        return "sign/signInForm";
    }

    @PostMapping("/signIn")
    public String signOk(HttpSession session, MemberSignDto dto) {
        Member member = memberService.ok(dto);

        if (member != null) {
            session.setAttribute("log", "Y");
            session.setAttribute("logId", member.getId());
            session.setAttribute("logName", member.getName());
            return "redirect:/";
        } else {
            return "sign/failed";
        }

    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
