package com.bizcenter.freight.api.config;

import com.bitsun.core.common.apollo.config.JsonConfigService;
import com.bitsun.core.common.apollo.config.LoggerLevelRefresher;
import com.bitsun.core.common.apollo.config.YamlConfigService;
import com.bitsun.core.common.auth.shiro.jwt.JWTRealm;
import com.bitsun.core.common.config.RedisConfig;
import com.bitsun.core.common.config.WebInterceptorConfig;
import com.bitsun.core.common.exception.AppExceptionHandler;
import com.bitsun.core.common.mybatis.configuration.MybatisPlusConfiguration;
import com.bitsun.core.common.web.ApolloConfigController;
import com.bitsun.core.common.web.FeignClientController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import com.bitsun.core.common.config.WebMvcConfig;
/**
 * 启动要加载的配置类
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Import({LoggerLevelRefresher.class,YamlConfigService.class, JsonConfigService.class,WebMvcConfig.class,WebInterceptorConfig.class,
    JWTRealm.class,MybatisPlusConfiguration.class})
@Configuration
public class FreightConfig {

    @Configuration
    class SwaggerDocumentationConfig {

        ApiInfo apiInfo() {
            return new ApiInfoBuilder().title("freight").description("freight")
                .license("").licenseUrl("http://unlicense.org")
                .termsOfServiceUrl("").version("1.0.0").contact(new Contact("", "", "")).build();
        }

        @Bean
        public Docket customImplementation() {
            return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.bizcenter.freight")).build()
                .apiInfo(apiInfo());
        }
    }

}