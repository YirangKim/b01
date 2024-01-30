package org.zerock.b01.service;

import org.zerock.b01.dto.*;

public interface BoardService {
    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO); //list() 목록/검색 기능

    //댓글 수
    PageResponseDTO<BoardListsReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);

    //게시글 이미지와 댓글 숫자까지 처리
    PageResponseDTO<BoardListAllDTO> listWithAll(PageRequestDTO pageRequestDTO);
}
