package patrick.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button button1,button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button_1);
        button2=(Button)findViewById(R.id.button_2);
        button3=(Button)findViewById(R.id.button_3);
        button4=(Button)findViewById(R.id.button_4);
        button5=(Button)findViewById(R.id.button_5);
        button6=(Button)findViewById(R.id.button_6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        ;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                Toast.makeText(this,"this button will launch my Popular Movies app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_2:
                Toast.makeText(this,"this button will launch my stock hawk app!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_3:
                Toast.makeText(this,"this button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_4:
                Toast.makeText(this,"this button will launch my make your app material app!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_5:
                Toast.makeText(this,"this button will launch my go ubiquitous app!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_6:
                Toast.makeText(this,"this button will launch my captone app!",Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
