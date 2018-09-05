package filmsarchive.thingcinema.com.filmsarchiveapp.repositories;

import java.io.IOException;
import java.util.List;

import filmsarchive.thingcinema.com.filmsarchiveapp.http.HttpRequester;
import filmsarchive.thingcinema.com.filmsarchiveapp.parsers.base.JsonParser;
import filmsarchive.thingcinema.com.filmsarchiveapp.repositories.base.Repository;

public class HttpRepository<T> implements Repository<T>{

    private final HttpRequester mHttpRequester;
    private final String mServerUrl;
    private final JsonParser<T> mJsonParser;

    public HttpRepository(HttpRequester mHttpRequester, String mServerUrl, JsonParser<T> mJsonParser) {
        this.mHttpRequester = mHttpRequester;
        this.mServerUrl = mServerUrl;
        this.mJsonParser = mJsonParser;
    }


    @Override
    public List<T> getAll() throws IOException {
        String jsonArray = null;
        jsonArray = mHttpRequester.get(mServerUrl);
        return mJsonParser.fromJsonArray(jsonArray);
    }

    @Override
    public T add(T item) throws IOException {
        String requestBody = mJsonParser.toJson(item);
        String responseBody = mHttpRequester.post(mServerUrl, requestBody);
        return mJsonParser.fromJson(responseBody);
    }

    @Override
    public T getById(int id) throws IOException {
        String url = mServerUrl + "/" + id;
        String json = mHttpRequester.get(url);
        return mJsonParser.fromJson(json);
    }

    @Override
    public T deleteById(int id) throws IOException {
        String url = mServerUrl + "/" + id;
        String json = mHttpRequester.delete(url);
        return  mJsonParser.fromJson(json);
    }
}
