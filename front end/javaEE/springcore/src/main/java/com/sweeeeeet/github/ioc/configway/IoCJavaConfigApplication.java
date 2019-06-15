package com.sweeeeeet.github.ioc.configway;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:sweet
 * Created:2019/5/19
 */
@Configuration
public class IoCJavaConfigApplication {


    public static class Studnets{
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Studnets{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    @Bean
    public String hello(){
        return "hello";
    }
    @Bean(value = "zhangsan")
    public Studnets zhangsan(){
        Studnets studnets=new Studnets();
        studnets.setId("12");
        studnets.setName("zhangsan");
        return studnets;
    }

    @Bean(value = "lisi")
    public Studnets lisi(){
        Studnets studnets=new Studnets();
        studnets.setId("12");
        studnets.setName("lisi");
        return studnets;
    }


}
