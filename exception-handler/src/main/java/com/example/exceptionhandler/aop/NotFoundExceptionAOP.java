package com.example.exceptionhandler.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class NotFoundExceptionAOP {

    @AfterThrowing(
            pointcut = "target(com.example.exceptionhandler.service.TestService)"
            , throwing = "e"
    )
    public void logAfterThrowingExceptionCall(Exception e) throws Throwable {
        log.error("after throwing error");
    }

    @Before(value = "execution(* com.example.exceptionhandler.service.TestServiceImpl.throwNotFoundException())")
    public void test(){
        log.info("before calling method");
    }
}
