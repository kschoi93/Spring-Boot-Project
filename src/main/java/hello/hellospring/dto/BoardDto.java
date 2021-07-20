package hello.hellospring.dto;

import java.util.Date;

import hello.hellospring.domain.entity.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BoardDto {

    private String title;
    private String content;
    private String author;
    private Date writedate;
    private int views;

    public Board toEntity() {
        return Board.builder().title(title).content(content).author(author).writedate(writedate).views(views).build();
    }

    @Builder
    public BoardDto(String title, String content, String author, Date writedate, int views) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.writedate = writedate;
        this.views = views;
    }

}
