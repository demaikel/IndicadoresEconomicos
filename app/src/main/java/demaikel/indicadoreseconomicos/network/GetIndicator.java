package demaikel.indicadoreseconomicos.network;

import java.util.Map;

import demaikel.indicadoreseconomicos.modelos.Wrapper;
import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by Michael on 06-12-2016.
 */

public interface GetIndicator {

    @GET("api")
    Call<Wrapper> getWrappers();
}
