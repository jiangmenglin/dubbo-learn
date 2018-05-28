package com.jml.test;

import com.jml.fixfunds.FixfundsDaoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: jml
 * @Date: 18-5-28
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FixfundsDaoApplication.class)
//@Transactional
public class BaseTest {
}
