package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    private GreetingRepository repository;
    
    public PrimaryGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public String sayGreeting() {
        return repository.getEnglishGreeting();
    }
}
