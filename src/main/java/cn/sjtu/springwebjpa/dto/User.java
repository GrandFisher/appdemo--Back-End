package cn.sjtu.springwebjpa.dto;

import lombok.Data;

/**
 * @author xuan
 * @date 2019-05-09 20:51.
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;

}
