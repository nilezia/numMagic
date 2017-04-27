package app.im.example.nummagic.network;

import app.im.example.nummagic.data.GenerateNumberDao;
import app.im.example.nummagic.data.ResponseNumber;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Nougat on 4/25/2017.
 */

public interface ApiService {

    @POST("1/invoke")
    Call<ResponseNumber> Registration(@Body GenerateNumberDao regist);

}
