package client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.RetroApiService1;

public class RetrofitClient1 {
    public static final String URL_BASE = "https://api.onwater.io/api/v1/results/";
    private static Retrofit retrofit;

    public static RetroApiService1 getApiService(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit.create(RetroApiService1.class);
    }
}
