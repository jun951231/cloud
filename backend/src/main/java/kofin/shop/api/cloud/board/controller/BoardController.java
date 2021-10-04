package kofin.shop.api.cloud.board.controller;

import kofin.shop.api.cloud.board.repository.BoardRepository;
import kofin.shop.api.cloud.board.service.BoardService;
import kofin.shop.api.cloud.board.service.BoardServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController extends BoardServiceImpl{
    private final BoardService boardService;

    public BoardController(BoardRepository boardRepository, BoardService boardService) {
        super(boardRepository);
        this.boardService = boardService;
    }
}
