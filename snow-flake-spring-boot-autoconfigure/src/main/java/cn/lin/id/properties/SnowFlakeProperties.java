package cn.lin.id.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author linchengdong
 * @Date 2023-12-28 11:14
 * @PackageName:cn.lin.id.properties
 * @ClassName: SnowFlakeProperties
 * @Description: TODO
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "snow-flake")
public class SnowFlakeProperties {

    private String enable;

    private Long dataCenterId;

    private Long machineId;
}
