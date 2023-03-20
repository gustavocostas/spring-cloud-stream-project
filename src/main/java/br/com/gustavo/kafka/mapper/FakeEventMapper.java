package br.com.gustavo.kafka.mapper;

import br.com.gustavo.kafka.dto.FormattedEvent;
import br.com.gustavo.kafka.model.FakeEvent;

public class FakeEventMapper {
    public static FormattedEvent toFormattedEvent(FakeEvent fakeEvent) {
        return FormattedEvent.builder()
                .project(fakeEvent.getProject())
                .groupProject(fakeEvent.getGroup())
                .files(fakeEvent.getFiles())
                .commits(fakeEvent.getCommits())
                .build();
    }
}
