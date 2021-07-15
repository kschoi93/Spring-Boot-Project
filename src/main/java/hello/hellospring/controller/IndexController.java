package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hello.hellospring.domain.posts.PostsRepository;
import hello.hellospring.dto.posts.PostsSaveRequestDto;
import hello.hellospring.service.PostsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class IndexController {

    private PostsRepository postsRepository;

    private PostsService postsService;

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }

    @GetMapping("/")
    public String home() {

        return "index";
    }
}
