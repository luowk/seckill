package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {

    @Autowired
    private SuccessKilledDao successKilledDao;

    @Test
    public void insert() throws Exception {
        Long seckillId = 1001L;
        String userPhone = "1234567890";
        Integer num = successKilledDao.insert(seckillId, userPhone);
        System.out.println("num:" + num);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        Long seckillId = 1001L;
        String userPhone = "1234567890";
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
        System.out.println(successKilled);
    }

}