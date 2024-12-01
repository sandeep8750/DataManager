package com.sandeep.ContactManger.helper;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Message {
    private String content;
    @Builder.Default
    private Color color = Color.red;
}



