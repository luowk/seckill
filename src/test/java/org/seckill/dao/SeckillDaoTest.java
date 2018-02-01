package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void redeceNumber() throws Exception {
        /*Long seckillId = 1000L;
        Date killedTime = new Date();
        Integer num = seckillDao.redeceNumber(seckillId, killedTime);
        System.out.println("num:" + num);*/
        System.out.println(2.00-1.10);  //0.8999999999999999
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));    //0.10
    }

    @Test
    public void queryById() throws Exception {
        Long seckillId = 1000L;
        Seckill seckill = seckillDao.queryById(seckillId);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        Integer offset = 0;
        Integer limit = 100;
        List<Seckill> seckillList = seckillDao.queryAll(offset, limit);
        for (Seckill seckill : seckillList) {
            System.out.println(seckill);
        }
    }

}