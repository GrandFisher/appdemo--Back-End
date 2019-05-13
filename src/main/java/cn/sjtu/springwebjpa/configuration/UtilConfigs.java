package cn.sjtu.springwebjpa.configuration;

import org.modelmapper.Conditions;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xuan
 * @date 2019-05-10 14:08.
 */
@Configuration
public class UtilConfigs {

    //这是cors 跨域
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }

    @Bean
    public ModelMapper mappper(){
        final ModelMapper mapper = new ModelMapper();

        mapper.addConverter((Converter<String, Boolean>) mappingContext -> "是".equals(mappingContext.getSource()));
        mapper.getConfiguration()
                .setSkipNullEnabled(true)
                .setPropertyCondition(Conditions.isNotNull());

        return mapper;
    }
}
