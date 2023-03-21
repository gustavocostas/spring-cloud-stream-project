package br.com.gustavo.kafka.messaging.dto;

import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FormattedEventDto {
    private String project;
    private String groupProject;
    private int files;
    private int commits;
    private int modifiedLines;
}
