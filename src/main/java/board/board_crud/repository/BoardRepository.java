package board.board_crud.repository;

import board.board_crud.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}