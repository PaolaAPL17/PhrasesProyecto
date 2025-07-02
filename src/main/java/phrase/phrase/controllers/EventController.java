package phrase.phrase.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import phrase.phrase.models.Event;
import phrase.phrase.repositories.EventRepository;
import phrase.phrase.services.EventService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phrases")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

@GetMapping
    public ResponseEntity<List<Event>> getAllEvent(){
        List<Event> events = eventService.getAllEvent();
        return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
        //return eventService.getAllEvent();
    }

    @PostMapping
    public ResponseEntity<Event> addEvent(@RequestBody Event newEvent) {
          Event createdPhrase =  eventService.addEvent(newEvent);
          return  new ResponseEntity<>(createdPhrase,HttpStatus.CREATED);
    }

@GetMapping("/{id}")
    public ResponseEntity<Optional <Event>> getEventById(@PathVariable Integer id){
        Optional<Event> eventById = eventService.findById(id);
        return new ResponseEntity<>(eventById, HttpStatus.OK);
    }

@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEvent(@PathVariable Integer id){
        eventService.eventDeleteId(id);
        return new ResponseEntity<>("Event Delete",HttpStatus.NO_CONTENT);
}

}
