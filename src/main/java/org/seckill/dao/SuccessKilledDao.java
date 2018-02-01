package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * 秒杀成功明细DAO
 */
public interface SuccessKilledDao {

    /**
     * 插入秒杀成功明细 可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 返回插入行数
     */
    public Integer insert(@Param("seckillId") Long seckillId, @Param("userPhone") String userPhone);

    /**
     * 根据id查询SuccessKilled 并携带Seckill对象
     * @param seckillId
     * @param userPhone
     * @return
     */
    public SuccessKilled queryByIdWithSeckill(@Param("seckillId") Long seckillId, @Param("userPhone") String userPhone);
}
