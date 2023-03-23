import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mhnewland.util.CalendarFactory;

@Configuration
@ComponentScan({"com.mhnewland"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(value=BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        //SpeakerServiceImpl service = new SpeakerServiceImpl(); //no Spring
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); // Using Beans
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
