package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("nl")
@Primary
public class PrimaryDutchGreetingService implements GreetingService {
    private GreetingRepository repository;
    
    public PrimaryDutchGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public String sayGreeting() {
        return repository.getDutchGreeting();
    }
}
