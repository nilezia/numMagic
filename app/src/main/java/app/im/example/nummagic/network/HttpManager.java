package app.im.example.nummagic.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nougat on 4/25/2017.
 */

public class HttpManager {
    private ApiService service;
    public static final String BASE_URL = "https:api.random.org/json-rpc/";


    public HttpManager() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient client = builder.build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).client(client)
                .build();

        service = retrofit.create(ApiService.class);

    }

    public ApiService getService() {
        return service;
    }

}
