package com.giantlizard.core.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 日志记录切面
 * @author 康东伟
 * @date 2023/04/10 21:56
 */
@Component
@Aspect
public class LogRecordAspect {

    @Pointcut("@annotation(com.giantlizard.core.annotation.LogRecord)")
    public void logRecord() {
    }

}
