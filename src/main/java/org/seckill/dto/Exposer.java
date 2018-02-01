package org.seckill.dto;

/**
 * 暴露秒杀接口DTO
 */
public class Exposer {
    private boolean exposed;

    //一种加密方式
    private String md5;

    //id
    private Long seckillId;

    //系统当前时间（毫秒）
    private Long nowTime;

    //开启时间
    private Long startTime;

    //结束时间
    private Long endTIme;

    public Exposer(boolean exposed, String md5, Long seckillId) {

        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, Long nowTime, Long startTime, Long endTIme) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
        this.nowTime = nowTime;
        this.startTime = startTime;
        this.endTIme = endTIme;
    }

    public Exposer(boolean exposed, Long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getNowTime() {
        return nowTime;
    }

    public void setNowTime(Long nowTime) {
        this.nowTime = nowTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTIme() {
        return endTIme;
    }

    public void setEndTIme(Long endTIme) {
        this.endTIme = endTIme;
    }

    @Override
    public String toString() {
        return "Exposer{" +
                "exposed=" + exposed +
                ", md5='" + md5 + '\'' +
                ", seckillId=" + seckillId +
                ", nowTime=" + nowTime +
                ", startTime=" + startTime +
                ", endTIme=" + endTIme +
                '}';
    }
}
