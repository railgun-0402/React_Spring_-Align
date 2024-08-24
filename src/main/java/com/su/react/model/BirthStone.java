package com.su.react.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BirthStone implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 月 */
    private String month;

    /** 名前 */
    private String name;

    /** 色 */
    private String color;
}
