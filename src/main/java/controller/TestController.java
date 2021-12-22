package controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@AllArgsConstructor
@RestController
public class TestController {

    @RequestMapping(value = "/ip.do", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        System.out.println("request Test OK");
        LocalDateTime cur = LocalDateTime.now();
        ResponseEntity.ok(request.getRemoteAddr());
        return cur.toString() + "asdf";
    }
}
