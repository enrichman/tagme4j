/**
 * Copyright (c) 2016 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
package it.enricocandino.tagme4j.request;

import com.google.gson.Gson;
import it.enricocandino.tagme4j.TagMeClient;
import it.enricocandino.tagme4j.response.TagMeResponse;
import okhttp3.*;

public abstract class TagMeRequest<T extends TagMeResponse> {

    private TagMeClient tagMeClient;
    protected HttpUrl.Builder builder;
    private String path;
    private Class<T> clazz;

    public TagMeRequest(TagMeClient tagMeClient, String path, Class<T> clazz) {
        this.tagMeClient = tagMeClient;
        this.path = path;
        this.clazz = clazz;
        this.builder = new HttpUrl.Builder();
    }

    protected HttpUrl getUrl() {
        return builder.scheme(TagMeClient.getScheme())
                .host(TagMeClient.getHost())
                .addPathSegments(path)
                .setQueryParameter("gcube-token", tagMeClient.getApikey())
                .build();
    }

    protected abstract Request getRequest();

    public T execute() {
        T tagMeResponse = null;

        try {
            OkHttpClient client = tagMeClient.getClient();
            Gson gson = tagMeClient.getGson();

            Response response = client.newCall(getRequest()).execute();
            String json = response.body().string();
            tagMeResponse = gson.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tagMeResponse;
    }

}
