package phrase.phrase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import phrase.phrase.models.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
