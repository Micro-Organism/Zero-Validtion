package com.zero.validation.domain.entity;

import com.zero.validation.common.validate.IpAddress;
import javax.validation.constraints.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SystemUserEntity {

    @NotNull(message = "id  is null")
    private Long id;

    @NotBlank(message = "username is null")
    private String username;

    @NotNull(message = "age is null")
    @Min(value = 1, message = "min age is 1 ")
    @Max(value = 200, message = "max age is 200")
    private Integer age;

    @Email(message = "email format limit")
    private String email;

    @IpAddress(message = "ip format  limit")
    private String ip;
}
