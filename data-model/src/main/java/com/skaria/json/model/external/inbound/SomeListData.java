
package com.skaria.json.model.external.inbound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.skaria.json.JsonPrintable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * SomeListData
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
    "messageId",
    "name",
    "systemId",
    "timestamp",
    "entryData",
    "status"
})
@Generated("jsonschema2pojo")
public class SomeListData implements JsonPrintable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("messageId")
    @NotNull
    public String messageId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @NotNull
    public String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("systemId")
    @NotNull
    public String systemId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @NotNull
    public String timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("entryData")
    @Valid
    @NotNull
    public List<SomeListEntryData> entryData = new ArrayList<SomeListEntryData>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @NotNull
    public SomeListData.Status status;

    @Generated("jsonschema2pojo")
    public enum Status {

        Active("Active"),
        Inactive("Inactive");
        private final String value;
        private final static Map<String, SomeListData.Status> CONSTANTS = new HashMap<String, SomeListData.Status>();

        static {
            for (SomeListData.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SomeListData.Status fromValue(String value) {
            SomeListData.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
