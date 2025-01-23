package io.github.sail.starter.core.util;

import io.micrometer.common.util.StringUtils;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.lang.Nullable;

import java.io.IOException;

/**
 * 读取配置文件
 *
 * @author LonelyCloudSail
 * date 2025/1/22 16:39
 * @version 0.0.1
 */
public class PropertySourceFactory extends DefaultPropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource encodedResource) throws IOException {
        Resource resource = encodedResource.getResource();
        String resourceName = resource.getFilename();
        if (StringUtils.isNotBlank(resourceName) &&
            resourceName.transform(str -> str.lastIndexOf(".yaml") > -1 ||  str.lastIndexOf("yml") > -1)) {
            return new YamlPropertySourceLoader().load(resourceName, resource).getFirst();
        }
        return super.createPropertySource(name, encodedResource);
    }
}
