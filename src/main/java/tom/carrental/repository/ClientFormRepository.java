package tom.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tom.carrental.model.ClientForm;

@Repository
public interface ClientFormRepository extends JpaRepository<ClientForm, Integer> {}
