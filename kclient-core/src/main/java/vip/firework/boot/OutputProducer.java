package vip.firework.boot;

import java.lang.annotation.*;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OutputProducer {
    String propertiesFile() default "";

    String defaultTopic() default "";
}