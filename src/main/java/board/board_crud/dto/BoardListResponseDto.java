package board.board_crud.dto;

import board.board_crud.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {

    private String title;
    private String content;

    public BoardListResponseDto(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}