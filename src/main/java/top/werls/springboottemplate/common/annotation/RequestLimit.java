package top.werls.springboottemplate.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 请求限制注解, 用于限制接口在一定时间内的访问次数
 * @author Li JiaWei by 2022/11/27
 * @version 1
 * @since on
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestLimit {

  /**
   * 限制 访问次数，
   *
   */
  int frequency() default 100;

  /**
   * 在几分钟内
   *
   */
  int minute() default 1;
}
