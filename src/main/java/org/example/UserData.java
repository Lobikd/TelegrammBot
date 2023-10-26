package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
    private int questionNumber;
    private int score;

    public UserData() {
        this.questionNumber = 0;
        this.score = 0;
    }
}
