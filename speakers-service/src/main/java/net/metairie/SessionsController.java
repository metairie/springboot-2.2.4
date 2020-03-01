package net.metairie;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SessionsController {
    private final SessionsRepository repository;

    public SessionsController(SessionsRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/listsessions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Session> listSessions() {
        return this.repository.findAll();
    }

    @GetMapping(path = "/ListSessions/{day}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<List<Session>> listSessionsByDay(@PathVariable String day) {
        return this.repository.findAllByDay(day);
    }
}
