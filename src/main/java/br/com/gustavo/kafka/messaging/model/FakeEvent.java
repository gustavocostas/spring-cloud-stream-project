package br.com.gustavo.kafka.messaging.model;

import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FakeEvent {
    private Long id;
    private String project;
    private String action;
    private String group;
    private int files;
    private int commits;
    private int addedLines;
    private int removedLines;

    public int returnModifiedLines() {
        return this.addedLines + this.removedLines;
    }
}
