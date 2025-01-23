package io.github.sail.starter.web.annotation;

import io.github.sail.starter.web.configuration.GlobalResponseConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启动全局响应注解
 *
 * @author LonelyCloudSail
 * date 2025/1/22 16:32
 * @version 0.0.1
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(GlobalResponseConfiguration.class)
public @interface EnableGlobalResponse {
}
