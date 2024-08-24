package com.su.react.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
public class Person {
    private int id;

    @NotBlank(message = "名前を入力してください。")
    @Length(max = 20, message = "名前は20文字以内で入力してください。")
    private String name;

    @Range(min = 1, max = 200, message = "年齢は1～200までの半角数字を入力してください。")
    private int age;
}
