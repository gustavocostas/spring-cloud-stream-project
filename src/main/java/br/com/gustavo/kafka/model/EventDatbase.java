package br.com.gustavo.kafka.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EVENT")
public class EventDatbase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String project;
    private String action;
    @Column(name = "GROUP_EVENT")
    private String group;
    private Integer files;
    private Integer commits;
    private Integer addedLines;
    private Integer removedLines;

    public Integer returnModifiedLines() {
        return this.addedLines + this.removedLines;
    }
}
