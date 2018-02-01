package org.seckill.exception;

public class SeckillCLoseException extends SeckillException {
    public SeckillCLoseException(String message) {
        super(message);
    }

    public SeckillCLoseException(String message, Throwable cause) {
        super(message, cause);
    }
}
