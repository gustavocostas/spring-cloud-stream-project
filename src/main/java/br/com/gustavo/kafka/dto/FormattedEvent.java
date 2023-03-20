package br.com.gustavo.kafka.dto;

import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FormattedEvent {
    private String project;
    private String groupProject;
    private int files;
    private int commits;
}
