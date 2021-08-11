package com.study.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Description aop面向切面编程
 *
 * @Before 前置通知  在目标方法调用之前会自动触发该前置通知方法
 * @After    后置通知  在目标方法调用结束之后触发该后置通知方法  即使产生异常该方法也会触发
 * @AfterReturning 在目标方法成功执行之后立即触发  紧跟return 之后  比@After先执行
 * @AfterThrowing  在目标方法抛出异常时触发  要比after先执行
 * @Around   通知包裹了目标方法 在目标方法调用之前和之后触发
 *
 * @author shaoming
 * @date 2021/8/10 09:23
 * @since 1.0
 */
@Aspect
@Component
public class LogAop {

    /**
     * 寻找规则  :
     * 1.任意公共方法执行 execution(public * *(..))
     * 2.任意set方法 execution(* set*(..))
     * 3.service包下任意方法 execution(* com.xxx.service.*(..))
     */
//    @Pointcut("execution(* com.study.springboot.aop.service..*(..))")
    @Pointcut("@annotation(LogAnnotation)")
    public void pointCut(){
    }

    @Pointcut("execution(* com.study.springboot.aop.service.AroundLogService.testAroundAnnotation())")
    public void pointCut1(){
    }




    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("------------------------");
        System.out.println("aop - before执行");
        System.out.println();
        Object[] args = joinPoint.getArgs();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        // 方法签名
        MethodSignature mSign = (MethodSignature) joinPoint.getSignature();
        String[] parameterNames = mSign.getParameterNames();
        System.out.println("className = " + className);
        System.out.println("methodName = " + methodName);
        for (int i = 0; i < parameterNames.length; i++) {
            System.out.println(parameterNames[i]+":"+args[i]);
        }

        System.out.println();
        // 获取自定义注解参数
        LogAnnotation[] annotations = mSign.getMethod().getDeclaredAnnotationsByType(LogAnnotation.class);
        for (LogAnnotation annotation : annotations) {
            System.out.println("annotation.value() = " + annotation.value());
            System.out.println("annotation.description() = " + annotation.description());
            System.out.println("annotation.flag() = " + annotation.flag());
        }

        System.out.println();
        System.out.println("------------------------");
    }



    @After("pointCut()")
    public void after(){
        System.out.println();
        System.out.println("------------------------");
        System.out.println("aop - after执行");
        System.out.println("------------------------");
    }


    @AfterReturning(pointcut = "pointCut()",returning = "rs")
    public void afterReturning(Object rs){
        System.out.println();
        System.out.println("------------------------");
        System.out.println("aop - afterReturning执行, returning = "+rs);
        System.out.println("------------------------");
    }


    @AfterThrowing(pointcut = "pointCut()",throwing = "error")
    public void afterThrowing(Throwable error){
        System.out.println();
        System.out.println("------------------------");
        System.out.println("aop - afterThrowing执行 --- 目标方法产生了异常:"+error.getMessage());
        System.out.println("------------------------");
    }

    /**
     * @Around 在before之前执行(如果有before的话  before之后是method目标方法)
     * 通过手动执行目标方法 然后在目标方法前后加上处理  达到环绕的目的
     * @param joinPoint
     * @return
     */

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("--------------around-start--------------");
        // 手动执行业务方法
        Object result = joinPoint.proceed();
        System.out.println("--------------around-end--------------");
        return result;
    }

}
