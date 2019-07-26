package com.youxuepai.componentprovider.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis plus 配置
 *
 * @author super
 */
@Configuration
@MapperScan("com.youxuepai.componentprovider.mapper")
public class MybatisPlusConfig {

  protected Logger logger = LoggerFactory.getLogger(getClass());

  /***
   * plus 的性能优化,日志打印,开发环境使用
   *
   * @return
   */
  @Bean
  @ConditionalOnProperty(prefix = "spring.cloud.config", name = "profile", havingValue = "dev")
  public PerformanceInterceptor performanceInterceptor() {
    PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
    /***
     * <!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->
     */
    performanceInterceptor.setMaxTime(200);
    /***
     * <!--SQL是否格式化 默认false-->
     */
    performanceInterceptor.setFormat(true);
    return performanceInterceptor;
  }

  /**
   * mybatis-plus分页插件<br>
   * 文档：http://mp.baomidou.com<br>
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    paginationInterceptor.setDialectType("mysql");
    return paginationInterceptor;
  }

}
