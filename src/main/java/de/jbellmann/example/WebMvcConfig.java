package de.jbellmann.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/" };

    @Bean
    public WebMvcConfigurer viewControllers(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/app/**").setViewName("index");
            }
        };
    }

    @Bean
    public WebMvcConfigurer resources(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                if(!registry.hasMappingForPattern("/*.js")){
                    registry.addResourceHandler("/*.js").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
                }

                if(!registry.hasMappingForPattern("/assets/**")){
                    registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/assets/");
                }
            }
        };
    }
}
