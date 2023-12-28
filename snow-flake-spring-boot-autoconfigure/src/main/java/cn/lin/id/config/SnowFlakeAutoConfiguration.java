package cn.lin.id.config;

import cn.lin.id.properties.SnowFlakeProperties;
import cn.lin.id.service.DefaultIdGenerateService;
import cn.lin.id.service.IdGenerateService;
import cn.lin.id.service.SnowFlakeFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author linchengdong
 * @Date 2023-12-28 11:16
 * @PackageName:cn.lin.id.config
 * @ClassName: GreetingAutoConfiguration
 * @Description: TODO
 * @Version 1.0
 */
@Configuration
@ConditionalOnProperty(prefix = "snow-flake", name = "enable", havingValue = "true")
@ConditionalOnClass(SnowFlakeFactory.class)
@EnableConfigurationProperties(SnowFlakeProperties.class)
public class SnowFlakeAutoConfiguration {

    private final SnowFlakeProperties snowFlakeProperties;

    public SnowFlakeAutoConfiguration(SnowFlakeProperties snowFlakeProperties) {
        this.snowFlakeProperties = snowFlakeProperties;
    }

    @Bean
    public IdGenerateService idGenerateService() {
        return new DefaultIdGenerateService(snowFlakeProperties);
    }


}
