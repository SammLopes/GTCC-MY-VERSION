package br.gtcc.gtcc.model.neo4j;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agenda {

 @Id
 @GeneratedValue
 private String id;                 

 @NonNull
 private LocalDateTime date;        

 @NonNull
 private LocalTime horasComeco;

 @NonNull
 private LocalTime horasFim;

 @NonNull
 private Boolean isLock = false;

 @Relationship(type = "ON_DATE", direction = Direction.INCOMING)  
 private ApresentationBanca apresentacao;

}
