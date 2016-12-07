package demaikel.indicadoreseconomicos.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import demaikel.indicadoreseconomicos.R;
import demaikel.indicadoreseconomicos.modelos.Wrapper;
import demaikel.indicadoreseconomicos.network.BackgroundIndicator;

public class MainActivity extends AppCompatActivity {


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Date cDate = new Date();
        String fDate = new SimpleDateFormat("dd-MM-yyyy").format(cDate);
            TextView fecha = (TextView) findViewById(R.id.fechaTv);
            fecha.setText(fDate);

        new GetWrapper().execute();

    }


    private class GetWrapper extends BackgroundIndicator {

        @Override
        protected void onPostExecute(Wrapper wrapper) {

            if (wrapper != null){
                TextView ufdata = (TextView) findViewById(R.id.ufTv);
                ufdata.setText("UF " +String.valueOf(wrapper.getUf().getValor()) + "  CLP");
                TextView dolardata = (TextView) findViewById(R.id.dolarTv);
                dolardata.setText("DOLAR " + String.valueOf(wrapper.getDolar().getValor()) + "  CLP");
                TextView ipcdata = (TextView) findViewById(R.id.ipcTv);
                ipcdata.setText("IPC " + String.valueOf(wrapper.getIpc().getValor()) + "  CLP");

            }
        }
    }
}
