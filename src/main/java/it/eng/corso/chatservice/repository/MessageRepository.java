package it.eng.corso.chatservice.repository;

import it.eng.corso.chatservice.model.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MessageRepository extends ReactiveMongoRepository<Message,String> {

    //in questo caso utilizzando mongoDb in modalità reattiva, questo non restituirà una lista ma un flusso
    // il flusso di dati dal db non verrà mai chiuso ma resterà attivo per la ricezione dei dati
    @Tailable
    Flux<Message> findByRoomId(Integer roomId); //cerca rispetto all'attributo roomId
}
