package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component
//@RequestMapping
@Controller //@RequestMappingHandlerMapping은 스프링 빈중에서 @RequestMapping or @Controller 클래스 레벨에 붙어있는 경우에 매핑정보 인식한다.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
