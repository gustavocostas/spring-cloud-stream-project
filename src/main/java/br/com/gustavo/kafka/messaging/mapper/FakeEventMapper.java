package br.com.gustavo.kafka.messaging.mapper;

import br.com.gustavo.kafka.messaging.dto.FormattedEventDto;
import br.com.gustavo.kafka.model.EventDatbase;
import br.com.gustavo.kafka.messaging.model.FakeEvent;

public class FakeEventMapper {
    public static FormattedEventDto toFormattedEventDto(FakeEvent fakeEvent) {
        return FormattedEventDto.builder()
                .project(fakeEvent.getProject())
                .groupProject(fakeEvent.getGroup())
                .files(fakeEvent.getFiles())
                .commits(fakeEvent.getCommits())
                .modifiedLines(fakeEvent.returnModifiedLines() / 2)
                .build();
    }

    public static EventDatbase toEvent(FakeEvent fakeEvent) {
        return EventDatbase.builder()
                .id(fakeEvent.getId())
                .project(fakeEvent.getProject())
                .group(fakeEvent.getGroup())
                .action(fakeEvent.getAction())
                .files(fakeEvent.getFiles())
                .commits(fakeEvent.getCommits())
                .addedLines(fakeEvent.getAddedLines())
                .removedLines(fakeEvent.getRemovedLines())
                .build();
    }
}
