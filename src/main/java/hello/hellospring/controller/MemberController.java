package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller     // @Component 애노테이션을 포함하고 있기 때문에 스프링 빈으로 등록 -> 컴포넌트 스캔과 자동 의존관계 설정
public class MemberController {
    private final MemberService memberService;

    @Autowired      // memberService를 스프링 컨테이너에 존재하는 동일한 이름의 스프링 빈과 연결시켜줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}