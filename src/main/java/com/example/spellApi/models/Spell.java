package com.example.spellApi.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Spell {
    private Long uid;

    private String name;

    private int level;

    private String type;
}
