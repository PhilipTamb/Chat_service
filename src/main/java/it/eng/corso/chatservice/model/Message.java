package it.eng.corso.chatservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document(collation = "chat") //alogo di Entity per i DB sql. specifichiamo la collection alla quale vogliamo connetterci
public class Message {

    @Id //specifichiamo l'id
    private String id;
    private Integer roomId;
    private String sender;
    private String message;
    private LocalDateTime createAt;
}
