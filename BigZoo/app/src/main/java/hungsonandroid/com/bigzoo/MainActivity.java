package hungsonandroid.com.bigzoo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    Button btnRandomZoo;
    ImageView ivShowZoo;
    TextView tvTenZoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnRandomZoo= (Button) findViewById(R.id.btnRandom);
        tvTenZoo= (TextView) findViewById(R.id.tvTenZoo);
        ivShowZoo= (ImageView) findViewById(R.id.ivShowZoo);

        btnRandomZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<ConThu> listConThu=new ArrayList<ConThu>();
                listConThu.add(new ConThu("Cho muc",R.drawable.chomuc));
                listConThu.add(new ConThu("chuong chuong",R.drawable.chuonchuon));
                listConThu.add(new ConThu("con cho",R.drawable.concho));
                listConThu.add(new ConThu("con heo",R.drawable.conheo));
                listConThu.add(new ConThu("con khi ",R.drawable.conkhi));
                listConThu.add(new ConThu("con soi",R.drawable.consoi));
                listConThu.add(new ConThu("con voi",R.drawable.convoi));
                listConThu.add(new ConThu("ech",R.drawable.ech));
                listConThu.add(new ConThu("meo den",R.drawable.meoden));
                listConThu.add(new ConThu("meo trang",R.drawable.meotrang));
                listConThu.add(new ConThu("rua vang",R.drawable.ruavang));


                Random r=new Random();
                int n=r.nextInt(listConThu.size());

                ivShowZoo.setImageResource(listConThu.get(n).Hinh);
               tvTenZoo.setText(listConThu.get(n).TenConThu.toString());
                Toast.makeText(MainActivity.this,""+listConThu.get(n).TenConThu.toString(),Toast.LENGTH_SHORT).show();


            }





        });


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
