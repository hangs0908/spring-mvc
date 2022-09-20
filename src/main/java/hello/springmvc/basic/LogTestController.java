package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // 문자열을 반환하면 그대로 문자열이 반환된다.
public class LogTestController {

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        log.trace("trace log = {}" , name);
        log.debug("debug log = {}" , name);
        log.info("name = {}" , name);
        log.warn("warn log = {}" , name);
        log.error("error log = {}" , name);
        return "ok"; // http 응답 메시지 바디에 그대로 넣는다.
    }
}
