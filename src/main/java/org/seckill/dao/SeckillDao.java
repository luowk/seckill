package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * 秒杀商品DAO
 */
public interface SeckillDao {

    /**
     * 减少库存
     * @param seckillId
     * @param killedTime
     * @return 返回影响行数
     */
    public Integer redeceNumber(@Param("seckillId") Long seckillId, @Param("killedTime") Date killedTime);

    /**
     * 根据id查询商品
     * @param seckillId
     * @return
     */
    public Seckill queryById(@Param("seckillId") Long seckillId);

    /**
     * 根据偏移量查询所有商品
     * @param offset
     * @param limit
     * @return
     */
    public List<Seckill> queryAll(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
