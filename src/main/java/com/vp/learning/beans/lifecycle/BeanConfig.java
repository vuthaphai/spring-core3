package com.vp.learning.beans.lifecycle;

import com.vp.learning.beans.lifecycle.com.vp.learning.custom.annotations.Vutha;
import com.vp.learning.component.scan.ClassB;
import com.vp.learning.component.scan.ClassC;
import com.vp.learning.component.scan.ComScan;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages = {"com.vp.learning.beans.lifecycle;com.vp.learning.component.scan"})
//@ComponentScan(basePackageClasses = { IndexModel.class, ComScan.class}, includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { ClassB.class, ClassC.class}), excludeFilters = @ComponentScan.Filter(classes = { Student.class}, type = FilterType.ASSIGNABLE_TYPE))
@ComponentScan(basePackageClasses = { IndexModel.class, ComScan.class}, includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Vutha.class}))
public class BeanConfig {
    /*

//    @Bean(initMethod = "setUp", destroyMethod = "clear")
    @Bean
   public Student getStudent() {
        Student student = new Student();
//        student.setUp();
        return new Student();
    }

//    @Bean (initMethod = "init", destroyMethod = "cleanUp")
    @Bean
    @Lazy
    public Subject getSubject() {
        return new Subject();
    }

*/

}
