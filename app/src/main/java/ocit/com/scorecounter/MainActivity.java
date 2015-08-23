package ocit.com.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvSatu, tvDua;
    private Button btnPlus3, btnPlus2, btnThrows_satu, btnPlus3_dua, btnPlus2_dua, btnThrows_dua, btnReset;

    private int DEFAULT_VALUE_DUA = 0;
    private int DEFAULT_VALUE_SATU = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSatu = (TextView) findViewById(R.id.tvCount_satu);
        tvDua = (TextView) findViewById(R.id.tvCount_dua);

        btnPlus3 = (Button) findViewById(R.id.btnPlus3);
        btnPlus2 = (Button) findViewById(R.id.btnPlus2);
        btnThrows_satu = (Button) findViewById(R.id.btnFThrows_satu);

        btnPlus3_dua = (Button) findViewById(R.id.btnPlus3_dua);
        btnPlus2_dua = (Button) findViewById(R.id.btnPlus2_dua);
        btnThrows_dua = (Button) findViewById(R.id.btnFThrows_dua);

        btnReset = (Button) findViewById(R.id.btnReset);

        setClickedDua(btnPlus3_dua, tvDua, 3);
        setClickedDua(btnPlus2_dua, tvDua, 2);
        setClickedDua(btnThrows_dua, tvDua, 1);

        setClickedSatu(btnPlus3, tvSatu, 3);
        setClickedSatu(btnPlus2, tvSatu, 2);
        setClickedSatu(btnThrows_satu, tvSatu, 1);

        setReset(btnReset, tvSatu, tvDua, 0);
    }

    public void setClickedSatu(Button btn, TextView tv, final int number) {
        final TextView tvClick = tv;
        btn.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       DEFAULT_VALUE_SATU = DEFAULT_VALUE_SATU + number;
                                       tvClick.setText("" + DEFAULT_VALUE_SATU);
                                   }
                               }

        );
    }


    public void setClickedDua(Button btn, TextView tv, final int number) {
        final TextView tvClick = tv;
        btn.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       DEFAULT_VALUE_DUA = DEFAULT_VALUE_DUA + number;
                                       tvClick.setText("" + DEFAULT_VALUE_DUA);
                                   }
                               }

        );
    }

    public void setReset(Button btn, TextView tv, TextView tvClick_dua, final int number) {
        final TextView tvClick1 = tv;
        final TextView tvClick2 = tvClick_dua;
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       tvClick1.setText("" + 0);
                                       tvClick2.setText("" + 0);
                                       DEFAULT_VALUE_SATU = 0;
                                       DEFAULT_VALUE_DUA = 0;
                                   }
                               }

        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}