package board.board_crud.controller;


import board.board_crud.dto.BoardListResponseDto;
import board.board_crud.dto.BoardRequestDto;
import board.board_crud.dto.BoardResponseDto;
import board.board_crud.entity.Board;
import board.board_crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/boards")
    public Board createBoard(@RequestBody BoardRequestDto requestDto){
        return boardService.createBoard(requestDto);
    }

    @GetMapping("/boards")          //null 해결하기
    public List<BoardListResponseDto> getAllBoards(){
        return boardService.findAllBoard();
    }

    @GetMapping("/boards/{id}")
    public BoardResponseDto getOneBoard(@PathVariable long id){
        return boardService.findOneBoard(id);
    }

    @PutMapping("/{id}")
    public BoardResponseDto updateBoard(@PathVariable long id, @RequestBody BoardRequestDto requestDto){
        return boardService.updateBoard(id, requestDto);
    }

    @DeleteMapping("/boards/{id}")
    public Long deleteBoard(@PathVariable long id){
        return boardService.deleteBoard(id);
    }

    @GetMapping("board/check/{id}/{inputPassword}")
    public boolean checkPassword(@PathVariable long id,@PathVariable String inputPassword){
        return boardService.checkPassword(id, inputPassword);
    }
}
