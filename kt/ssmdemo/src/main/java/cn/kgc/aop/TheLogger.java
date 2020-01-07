package cn.kgc.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

//增强处理了逻辑
public class TheLogger {
    private static final Logger logger = Logger.getLogger(TheLogger.class);
    //代表前置增强的逻辑
    public void before(JoinPoint joinPoint){
        //joinPoint.getTarget();//获取被代表的对象
        //joinPoint.getSignature();//获取被代理的方法
        //joinPoint.getSignature().getName();//获取被代理的方法名称
        //Arrays.toString(joinPoint.getArgs());//获取被代理方法的入参
        logger.info("调用了："+joinPoint.getTarget()+"类的，"+joinPoint.getSignature().getName()
                +"，方法入参"+ Arrays.toString(joinPoint.getArgs()));
    }
    //代表后置增强的逻辑
    public void after(JoinPoint joinPoint,Object result){
        logger.info("调用了"+joinPoint.getTarget()+"类的，"+joinPoint.getSignature().getName()
                +"方法返回："+result);
    }
}
