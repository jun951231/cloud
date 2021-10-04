package kofin.shop.api.cloud.user.domain;

import lombok.*;

import java.io.Serializable;

@Getter @Setter @ToString
public class UserSerializer implements Serializable {
    private static final long serialVersionUID = 1L;

    private long userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private String regDate;

    @Builder
    UserSerializer(long userId, String username, String password, String name, String email, String regDate){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.regDate = regDate;
    }
}
