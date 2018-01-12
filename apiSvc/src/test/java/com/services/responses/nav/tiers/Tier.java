package com.services.responses.nav.tiers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Tier {

    @JsonProperty("id")
    private String id;

    @JsonProperty("parentTierId")
    private String parentTierId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("displaySequenceId")
    private long displaySequenceId;

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("isTemplateInherited")
    private boolean isTemplateInherited;

    @JsonIgnore
    private Date updatedTimeStamp;

    @JsonProperty("updatedBy")
    private String updatedBy;

    @JsonIgnore
    private Link links;

    @JsonProperty("hasChildren")
    private boolean hasChildren;

    @JsonProperty("isHidden")
    private boolean isHidden;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentTierId() {
        return parentTierId;
    }

    public void setParentTierId(String parentTierId) {
        this.parentTierId = parentTierId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDisplaySequenceId() {
        return displaySequenceId;
    }

    public void setDisplaySequenceId(long displaySequenceId) {
        this.displaySequenceId = displaySequenceId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isTemplateInherited() {
        return isTemplateInherited;
    }

    public void setTemplateInherited(boolean templateInherited) {
        isTemplateInherited = templateInherited;
    }

    public Date getUpdatedTimeStamp() {
        return updatedTimeStamp;
    }

    public void setUpdatedTimeStamp(Date updatedTimeStamp) {
        this.updatedTimeStamp = updatedTimeStamp;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }

    class Link {
        @JsonProperty("productTemplate")
        private String productTemplate;

        Link() {
        }

        public String getProductTemplate() {
            return productTemplate;
        }

        public void setProductTemplate(String productTemplate) {
            this.productTemplate = productTemplate;
        }
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }
}
