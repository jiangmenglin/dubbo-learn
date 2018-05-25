package com.jml;

import com.alibaba.dubbo.common.utils.NetUtils;
import com.alibaba.dubbo.config.ProtocolConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @Author: jml
 * @Date: 18-5-25
 * @Description:
 * 在dubbo加载配置文件时,会实例化该类,执行init-method配置的init方法
 * 此时通过spring获取所有ProtocolConfig的实体(实际上好像就一个),并将其端口设为随机一个未被使用的端口
 * 源码中随机端口通过new Socket实现,而后将Socket关闭,更多细节不再说
 */
@Component
public class DynamicDubboPortReaderImpl implements ApplicationContextAware {

    @Autowired
    private ApplicationContext applicationContext;
    private int port = 20881;

    @PostConstruct
    public void init() {
        Map<String, ProtocolConfig> beansOfType = applicationContext.getBeansOfType(ProtocolConfig.class);
        for (Map.Entry<String, ProtocolConfig> item : beansOfType.entrySet()) {
            port = NetUtils.getAvailablePort();
            System.out.println("##################use sure###########################"+port);
            item.getValue().setPort(port);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = (ConfigurableApplicationContext) applicationContext;
    }
}
