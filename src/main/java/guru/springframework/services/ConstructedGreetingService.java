package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hi -constructed injection";
    }
}
