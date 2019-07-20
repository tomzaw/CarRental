package tom.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tom.carrental.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {}
