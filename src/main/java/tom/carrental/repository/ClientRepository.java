package tom.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tom.carrental.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {}
