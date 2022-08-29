package jenkins.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: Xu Yuwen
 * @Date: 2022-08-29 15:42
 */
@RestController
@Slf4j
public class jenkins {
    @GetMapping("/ddd")
    public String getDDD(){
        return "我确实是大锤子";
    }
}
