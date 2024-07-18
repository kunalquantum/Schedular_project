package schedular.Schedular_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import schedular.Schedular_project.model.User;

public interface UserDao extends JpaRepository<User,Integer> {


}
