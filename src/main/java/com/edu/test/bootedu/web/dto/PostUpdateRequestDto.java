package com.edu.test.bootedu.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public void PostsUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }

}
