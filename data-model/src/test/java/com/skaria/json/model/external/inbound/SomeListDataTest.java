package com.skaria.json.model.external.inbound;

import org.junit.jupiter.api.Test;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SomeListDataTest {
  
    @Test
    void generateJson() {
        SomeListData data = SomeListData.builder()
                .name("test")
                .status(SomeListData.Status.Active)
                .systemId("systemId")
                .messageId("messageId")
                .timestamp("2025-03-10T13:21:23.345+00:00")
                .entryData(getEntryData())
                .build();
        System.out.println(data.toJson());
    }

    private @Valid @NotNull List<SomeListEntryData> getEntryData() {

        List<SomeListEntryData> data = new ArrayList<>();
        SomeListEntryData someListEntryData = SomeListEntryData.builder()
                .contact("contact")
                .endDate("2025-03-10")
                .startDate("2025-03-01")
                .identifier("identifier")
                .reason("reason")
                .build();
        data.add(someListEntryData);
        return data;
    }
}