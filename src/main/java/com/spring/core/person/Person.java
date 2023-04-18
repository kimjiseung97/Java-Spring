package com.spring.core.person;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 파라미터 생성자

//@Data //위 모든것을 한번에 해준다(실무에서는 사용하면 안됌 수정이 힘들어지기때문에)
public class Person {

    private String nickName;
    private String address;
    private int age;



}
