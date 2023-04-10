package com.giantlizard.core.annotation;

import java.lang.annotation.*;

/**
 * 日志记录注解
 * @author 康东伟
 * @date 2020/11/10 15:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
@Documented
public @interface LogRecord {

    /**
     * 描述
     */
    String description() default "";

    /**
     * 请求类型
     */
    String type() default "";

    /**
     * 是否开启
     */
    boolean isOpen() default true;
}
