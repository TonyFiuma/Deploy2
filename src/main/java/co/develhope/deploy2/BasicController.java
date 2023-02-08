package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class BasicController {
    @GetMapping("")
    public int getSumOfTwoRandomIntegers(){
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        return a+b;
    }
}