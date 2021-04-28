package repositories;

import entities.Cd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdRepository extends CrudRepository<Cd,Long> {
}
