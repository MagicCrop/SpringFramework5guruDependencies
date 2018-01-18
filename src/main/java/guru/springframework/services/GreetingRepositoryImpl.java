package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/24/17.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }
    
    @Override
    public String getDutchGreeting() {
        return "Primaire greeting service";
    }
    
    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
