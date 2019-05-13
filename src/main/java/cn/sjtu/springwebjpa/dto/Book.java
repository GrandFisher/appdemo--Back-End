package cn.sjtu.springwebjpa.dto;

import lombok.Data;

/**
 * @author xuan
 * @date 2019-05-09 20:51.
 */
@Data
public class Book {
    private Integer id;
    private String bookName;
    private String author;
    private String bookClass;
    private int price;
    private String image;
}
