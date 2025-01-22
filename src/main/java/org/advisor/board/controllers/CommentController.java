package org.advisor.board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.advisor.global.exceptions.BadRequestException;
import org.advisor.global.libs.Utils;
import org.advisor.global.rests.JSONData;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final Utils utils;

    /**
     * 댓글 작성, 수정
     *
     * @return
     */
    @PostMapping("/save")
    public JSONData save(@RequestBody @Valid RequestComment form, Errors errors) {

        if (errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }

        return null;
    }

    /**
     * 댓글 한 개 조회
     * - 댓글 수정시 기초 데이터(프론트 엔드)
     *
     * @param seq
     * @return
     */
    @GetMapping("/view/{seq}")
    public JSONData view(@PathVariable("seq") Long seq) {

        return null;
    }

    /**
     * 댓글 목록 조회
     *
     * @param seq : 게시글 번호란 뜻의 seq
     * @return
     */
    @GetMapping("/list/{seq}")
    public JSONData list(@PathVariable("seq") Long seq) {

        return null;
    }

    /**
     * 댓글 한 개 삭제 처리
     *
     * @param seq
     * @return
     */
    @DeleteMapping("/{seq}")
    public JSONData delete(@PathVariable("seq") Long seq) {

        return null;
    }
}
