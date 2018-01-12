package com.automation.utils;

public class HeadersQueryMapBuilder extends BaseQueryMapBuilder {

    public HeadersQueryMapBuilder() {
        super();
    }

    public HeadersQueryMapBuilder addAccept(String accept) {
        putString("Accept", accept);
        return this;
    }

    public HeadersQueryMapBuilder addContentType(String contentType) {
        putString("Content-Type", contentType);
        return this;
    }

    public HeadersQueryMapBuilder addAuthorization(String token) {
        putString("Authorization", token);
        return this;
    }

    public HeadersQueryMapBuilder addVersion(String version) {
        putString("Version", version);
        return this;
    }

    public HeadersQueryMapBuilder addSsiToken(String ssiToken) {
        putString("X-Meijer-SSI", ssiToken);
        return this;
    }

    // ... Add additional HeadersQueryMapBuilder ...


}
