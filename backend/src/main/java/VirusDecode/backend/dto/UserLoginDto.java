package VirusDecode.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDto {
    private String loginId;
    private String password;
}