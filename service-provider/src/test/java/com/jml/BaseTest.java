package com.jml;

import com.jml.serviceprovider.DubboProviderApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: jml
 * @Date: 18-5-22
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboProviderApplication.class)
@Transactional
public class BaseTest {
}
