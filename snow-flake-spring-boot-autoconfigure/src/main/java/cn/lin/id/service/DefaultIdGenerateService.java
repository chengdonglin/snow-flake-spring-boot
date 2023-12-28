package cn.lin.id.service;

import cn.lin.id.properties.SnowFlakeProperties;

/**
 * @Author linchengdong
 * @Date 2023-12-28 11:26
 * @PackageName:cn.lin.id.service
 * @ClassName: DefaultIdGenerateService
 * @Description: 默认的id生成器
 * @Version 1.0
 */
public class DefaultIdGenerateService implements IdGenerateService {

    private final SnowFlakeProperties snowFlakeProperties;

    public DefaultIdGenerateService(SnowFlakeProperties snowFlakeProperties) {
        this.snowFlakeProperties = snowFlakeProperties;
    }

    @Override
    public long nextId() {
        return SnowFlakeFactory.getSnowFlakeByDataCenterIdAndMachineIdFromCache(snowFlakeProperties.getDataCenterId(), snowFlakeProperties.getMachineId()).nextId();
    }
}
