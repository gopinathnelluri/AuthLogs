package us.gopinath.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import us.gopinath.Entity.UsersLogs;
import us.gopinath.Repository.UserLogsRepository;

@EnableMongoRepositories(basePackageClasses = UserLogsRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserLogsRepository userLogsRepository) {
        return strings -> {
            userLogsRepository.save(new UsersLogs("1", "3", "127.0.0.1"));
            userLogsRepository.save(new UsersLogs("2", "2", "127.0.0.1"));
        };
    }

}
