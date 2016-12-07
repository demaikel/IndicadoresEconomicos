package demaikel.indicadoreseconomicos.network;

import android.os.AsyncTask;

import java.io.IOException;

import demaikel.indicadoreseconomicos.modelos.Wrapper;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Michael on 06-12-2016.
 */

public class BackgroundIndicator extends AsyncTask<Void,Void, Wrapper>{

     @Override
    protected Wrapper doInBackground(Void... voids) {
         GetIndicator getIndicator = new IndicatorInterceptor().getInterceptor();
         Call<Wrapper> wrapperCall = getIndicator.getWrappers();

         Wrapper wrapper = null;

         try {
             Response<Wrapper> response = wrapperCall.execute();
             wrapper = response.body();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return wrapper;
    }
}
