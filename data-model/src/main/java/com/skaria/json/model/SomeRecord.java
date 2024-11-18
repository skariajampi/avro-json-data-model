
package com.skaria.json.model;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * SomeRecord
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "Id",
    "Timestamp",
    "Identifier",
    "Measure"
})
@Generated("jsonschema2pojo")
public class SomeRecord {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Id")
    @NotNull
    public String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Timestamp")
    @NotNull
    public String timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Identifier")
    @NotNull
    public String identifier;
    @JsonProperty("Measure")
    public Integer measure;

}
