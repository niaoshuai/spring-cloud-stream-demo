package ren.shuaipeng.cloud.stream;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequiredArgsConstructor
public class MessageRestController {
    private final StreamBridge streamBridge;

    @RequestMapping("/sendRegister")
    @ResponseStatus(HttpStatus.OK)
    public String sendRegisterMsg(@RequestBody String body) {
        streamBridge.send("register_out", new Date());
        return body;
    }

    @RequestMapping("/sendLogin")
    @ResponseStatus(HttpStatus.OK)
    public String sendLoginMsg(@RequestBody String body) {
        streamBridge.send("login_out", body);
        return body;
    }
}
