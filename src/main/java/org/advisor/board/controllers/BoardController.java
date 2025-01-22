package org.advisor.board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.advisor.global.exceptions.BadRequestException;
import org.advisor.global.libs.Utils;
import org.advisor.global.rests.JSONData;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class BoardController {

    private final Utils utils;

    /**
     * 게시판 설정 한 개 조회
     *
     * @param bid
     * @return
     */
    @GetMapping("/config/{bid}")
    public JSONData config(@PathVariable("bid") String bid) {

        return null;
    }

    /**
     * 게시글 댓글 작성, 수정 처리
     * @return
     */
    @PostMapping("/save")
    public JSONData save(@Valid @RequestBody RequestBoard form, Errors errors) {
        String mode = form.getMode();
        mode = StringUtils.hasText(mode) ? mode : "write";
        commonProcess(form.getBid(), mode); // 공통처리
        if (errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }


        return null;
    }

    /**
     * 게시글 한 개 조회
     * - 글 보기, 글 수정 시에 활용될 수 있음 (프론트 엔드)
     * @param seq
     * @return
     */
    @GetMapping("/view/{seq}")
    public JSONData view(@PathVariable("seq") Long seq) {

        return null;
    }

    /**
     * 게시글 목록 조회
     *
     * @param bid
     * @return
     */
    @GetMapping("/list/{bid}")
    public JSONData list(@PathVariable("bid") String bid) {

        return null;
    }

    /**
     * 게시글 한 개 삭제
     *
     * @param seq
     * @return
     */
    @DeleteMapping("/{seq}")
    public JSONData delete(@PathVariable("seq") Long seq) {

        return null;
    }

    /**
     * 게시글 번호로 공통 처리
     *
     * @param seq
     * @param mode
     */
    private void commonProcess(Long seq, String mode) {

    }

    /**
     * 게시판 아이디로 공통 처리
     *
     * @param bid
     * @param mode
     */
    private void commonProcess(String bid, String mode) {

    }
}
