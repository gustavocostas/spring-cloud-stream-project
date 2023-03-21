package br.com.gustavo.kafka.dto;

import lombok.*;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventDatabaseDto {
    private long modifiedLines;
}
