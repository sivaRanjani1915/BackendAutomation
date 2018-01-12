package com.services.responses.nav.tiers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductTemplate {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("updatedTimeStamp")
    private String updatedTimeStamp;

    @JsonProperty("updatedBy")
    private String updatedBy;

    @JsonProperty("isMapped")
    private Object isMapped;

    @JsonProperty("sections")
    private Object sections;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("updatedTimeStamp")
    public String getUpdatedTimeStamp() {
        return updatedTimeStamp;
    }

    @JsonProperty("updatedTimeStamp")
    public void setUpdatedTimeStamp(String updatedTimeStamp) {
        this.updatedTimeStamp = updatedTimeStamp;
    }

    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonProperty("isMapped")
    public Object getIsMapped() {
        return isMapped;
    }

    @JsonProperty("isMapped")
    public void setIsMapped(Object isMapped) {
        this.isMapped = isMapped;
    }

    @JsonProperty("sections")
    public Object getSections() {
        return sections;
    }

    @JsonProperty("sections")
    public void setSections(Object sections) {
        this.sections = sections;
    }


}
