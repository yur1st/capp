package com.capp.tech.bootstrap;

import com.capp.tech.model.entity.AttributeLimit;
import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.model.entity.Role;
import com.capp.tech.model.entity.User;
import com.capp.tech.repository.datajpa.AttributeLimitRangeRepository;
import com.capp.tech.repository.datajpa.AttributeLimitRepository;
import com.capp.tech.repository.datajpa.RoleRepository;
import com.capp.tech.repository.datajpa.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaDataLoader implements CommandLineRunner {


    private final AttributeLimitRangeRepository repository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final AttributeLimitRepository attributeLimitRepository;

    public JpaDataLoader(AttributeLimitRangeRepository repository, UserRepository userRepository, RoleRepository roleRepository, AttributeLimitRepository attributeLimitRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.attributeLimitRepository = attributeLimitRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        AttributeLimitRange range1 = new AttributeLimitRange();
        range1.setMin(0.75);
        range1.setMax(1.26);
        range1.setActive(true);
        repository.save(range1);

        AttributeLimitRange range2 = new AttributeLimitRange();
        range2.setMin(2.75);
        range2.setMax(112.26);
        repository.save(range2);

        AttributeLimitRange range3 = new AttributeLimitRange();
        range3.setMin(0.34345);
        range3.setMax(75.26);
        repository.save(range3);

        System.out.println("Loaded Ranges for attributes....");

        Role admin = new Role("ADMIN");
        roleRepository.save(admin);

        Role operator = new Role("OPERATOR");
        roleRepository.save(operator);

        Role engineer = new Role("ENGINEER");
        roleRepository.save(engineer);

        System.out.println("Loaded Roles...");

        User user1 = new User();
        user1.setFirstName("Yuri");
        user1.setLastName("Okhvat");
        user1.setEmail("yu@o.ru");
        user1.setPassword("$2y$12$qy5lLrpBLIwz8RziWBCT4.auEtRJlur1Z2EdLMmEVrGDKbVeV9v6i");
        user1.setUsername("admin");
        user1.getRoles().add(admin);
        userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Imyarek");
        user2.setLastName("Nektoev");
        user2.setEmail("imya@nekto.ru");
        user2.setPassword("$2y$12$sbkzaUnSoYrg5i9yCUub4eJZC6XaC8YwZxNaG455WHv/EOYpqWX/y");
        user2.setUsername("engineer");
        user2.getRoles().add(engineer);
        userRepository.save(user2);

        User user3 = new User();
        user3.setFirstName("Vinnie");
        user3.setLastName("Pooh");
        user3.setEmail("vinnie@les.ru");
        user3.setPassword("$2y$12$Ojy6.pEqGfR.WP.RQntYyeO8mjvnnI6I4GWLGTuCPN1wSvQiKMI4m");
        user3.setUsername("operator");
        user3.getRoles().add(operator);
        userRepository.save(user3);

        AttributeLimit limit = new AttributeLimit();
        limit.getPossibleValues().add("Odin");
        limit.getPossibleValues().add("Dva");
        limit.getPossibleValues().add("Pyat");
        limit.getPossibleValues().add("Shest");
        attributeLimitRepository.save(limit);

    }
}

