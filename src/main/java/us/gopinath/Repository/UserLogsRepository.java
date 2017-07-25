package us.gopinath.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import us.gopinath.Entity.UsersLogs;

public interface UserLogsRepository extends MongoRepository<UsersLogs, String> {
}
