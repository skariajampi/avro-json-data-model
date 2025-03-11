
package com.skaria.json.model.external.inbound;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.skaria.json.JsonPrintable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "identifier",
    "reason",
    "startDate",
    "endDate",
    "contact"
})
@Generated("jsonschema2pojo")
public class SomeListEntryData implements JsonPrintable
{

    @JsonProperty("identifier")
    public String identifier;
    @JsonProperty("reason")
    public String reason;
    @JsonProperty("startDate")
    public String startDate;
    @JsonProperty("endDate")
    public String endDate;
    @JsonProperty("contact")
    public String contact;

}
