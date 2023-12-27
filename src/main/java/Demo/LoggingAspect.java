package Demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* Demo.ShoppingCart.assist(..))")
    public void beforelogger(){
        System.out.println("Logged In");
    }

    @After("execution(* *.*.assist(..))")
    public void afterLogger(){
        System.out.println("Logged out");
    }
}

