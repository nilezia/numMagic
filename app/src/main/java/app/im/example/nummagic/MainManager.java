package app.im.example.nummagic;

import android.util.Log;

import com.google.gson.GsonBuilder;

import app.im.example.nummagic.data.GenerateNumberDao;
import app.im.example.nummagic.data.ResponseNumber;
import app.im.example.nummagic.network.HttpManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Nougat on 4/25/2017.
 */

public class MainManager {

    public interface onUpdateData {
        void updateUI(ResponseNumber.ResultBean data);
    }

    private onUpdateData mListener;

    public MainManager(onUpdateData listener) {

        this.mListener = listener;
    }

    public void RandomNumber() {
        GenerateNumberDao dao = new GenerateNumberDao();
        dao.setId(1);
        dao.setJsonrpc("2.0");
        dao.setMethod("generateIntegers");

        dao.setParams(new GenerateNumberDao.ParamsBean("8a107d4d-8dc4-43b4-9386-690c5ef0b0c2", 1, 1000, 9999, true));

        Call<ResponseNumber> call = new HttpManager().getService().Registration(dao);
        call.enqueue(new Callback<ResponseNumber>() {
            @Override
            public void onResponse(Call<ResponseNumber> call, Response<ResponseNumber> response) {
                ResponseNumber body = response.body();

                if (body == null) {
                    Log.d("HttpManager", response.errorBody().toString());
                } else {
                    Log.d("HttpManager", new GsonBuilder().setPrettyPrinting().create().toJson(body));
                    mListener.updateUI(body.getResult());
                }
            }

            @Override
            public void onFailure(Call<ResponseNumber> call, Throwable t) {
                Log.d("HttpManager", t.toString());
            }
        });
    }

    public boolean isCheckNumber(String inputNumber, int serverNumber) {

        return Integer.valueOf(inputNumber) == serverNumber;

    }
}
