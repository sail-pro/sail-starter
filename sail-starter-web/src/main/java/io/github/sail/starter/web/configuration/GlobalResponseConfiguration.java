package io.github.sail.starter.web.configuration;

import io.github.sail.starter.web.properties.GlobalResponseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PropertySourceFactory;

/**
 * 全局响应注解 实现类
 *
 * @author LonelyCloudSail
 * date 2025/1/22 16:32
 * @version 0.0.1
 */
@Configuration(proxyBeanMethods = false)
@PropertySource(value = "classpath:global-response.yaml", factory = PropertySourceFactory.class)
@EnableConfigurationProperties(GlobalResponseProperties.class)
public class GlobalResponseConfiguration {
}
