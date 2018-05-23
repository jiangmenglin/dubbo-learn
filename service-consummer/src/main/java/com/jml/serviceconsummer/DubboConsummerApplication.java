package com.jml.serviceconsummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.jml.serviceconsummer.controller")
public class DubboConsummerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsummerApplication.class, args);
    }

//    @Bean
//    public MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {
//        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        //设置日期格式
//        ObjectMapper objectMapper = new ObjectMapper();
//        SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
//        objectMapper.setDateFormat(smt);
//        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);
//        //设置中文编码格式
//        List<MediaType> list = new ArrayList<MediaType>();
//        list.add(MediaType.APPLICATION_JSON_UTF8);
//        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);
//        return mappingJackson2HttpMessageConverter;
//    }
}
