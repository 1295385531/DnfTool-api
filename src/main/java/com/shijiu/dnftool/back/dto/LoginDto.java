package com.shijiu.dnftool.back.dto;

import lombok.*;

/**
 * @Date: 2024-02-23-14:01
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private String username;
    private String password;
}
