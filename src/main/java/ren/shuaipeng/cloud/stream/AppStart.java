package ren.shuaipeng.cloud.stream;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@RequiredArgsConstructor
public class AppStart {


    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

}
