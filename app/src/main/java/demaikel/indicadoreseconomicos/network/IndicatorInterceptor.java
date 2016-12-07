package demaikel.indicadoreseconomicos.network;

import demaikel.indicadoreseconomicos.modelos.Wrapper;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Michael on 06-12-2016.
 */

public class IndicatorInterceptor {

    private static final String BASE_URL = "http://www.mindicador.cl/";

    public GetIndicator getInterceptor() {
        Retrofit interceptor = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetIndicator getIndicator = interceptor.create(GetIndicator.class);
        return getIndicator;
    }


}
