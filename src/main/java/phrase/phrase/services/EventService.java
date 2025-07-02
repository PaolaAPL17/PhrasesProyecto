package phrase.phrase.services;

import phrase.phrase.models.Event;
import phrase.phrase.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvent() {
        return eventRepository.findAll();
    }


    public Event addEvent(Event newEvent){
        Event event = eventRepository.save(newEvent);
        return event;
    }

   public Optional<Event> findById(Integer id){
        return eventRepository.findById(id);
    }

    public void eventDeleteId(Integer id){
        eventRepository.deleteById(id);
    }

    //public Event updateEventById (Integer id, Event umpalumpa){
     //   Event magicbox = eventRepository.findById(id)
     //           .orElseThrow(new RuntimeException("id not found");
     //   magicbox.
    //}
}
