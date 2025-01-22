package org.advisor.board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.advisor.board.validators.BoardConfigValidator;
import org.advisor.global.exceptions.BadRequestException;
import org.advisor.global.libs.Utils;
import org.advisor.global.rests.JSONData;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class BoardAdminController {

    private final Utils utils;
    private final BoardConfigValidator configValidator;

    /**
     * 게시판 설정 등록, 수정 처리
     *
     * @return
     */
    @PostMapping("/config")
    public JSONData save(@Valid @RequestBody RequestConfig form, Errors errors) {

        configValidator.validate(form, errors);

        if (errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }

        return null; // 임시로 null을 붙힘, 나중에 수정할 것
    }

    /**
     * 게시판 설정 목록
     *
     * @return
     */
    @GetMapping("/config")
    public JSONData list(@ModelAttribute BoardConfigSearch search) {

        return null;
    }

    /**
     * 게시판 한 개 또는 여러개 일괄 수정
     *
     * @return
     */
    @PatchMapping("/config")
    public JSONData update(@RequestBody List<RequestConfig> form) {

        return null;
    }

    /**
     * 게시판 한 개 또는 여러개 삭제 처리
     *
     * @param bids
     * @return
     */
    @DeleteMapping("/config")
    public JSONData delete(@RequestParam("bid") List<String> bids) {

        return null;
    }
}
