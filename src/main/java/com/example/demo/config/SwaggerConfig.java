package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: boot-mybatis-com.example.demo.config-SwaggerConfig
 * date: 2019/11/15 19:34
 */
//swagger的配置类
@Configuration //表示这是一个配置类
@EnableSwagger2  //开启Swagger使用
public class SwaggerConfig {
    //swagger2的配置类，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createTestApi() {// 创建API基本信息
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())//扫描所有的包 可以扫描指定的包 .apis(RequestHandlerSelectors.basePackage("com.karonda.springbootswagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){// 创建API的基本信息，这些信息会在Swagger UI中进行显示
        return new ApiInfoBuilder()
                .title("Swagger接口文档")//标题
                .description("Swagger-接口文档")// API描述
                .version("1.0.0")//接口的版本
                .build();
    }
    //重启项目 访问swaggerUI界面http://localhost:8080/swagger-ui.html#/

}
