package tw.com.abc.mystopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Btn1,Btn2;
    private boolean isRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView tv=(TextView)findViewById(R.id.Btn1);
        Btn1=(Button) findViewById(R.id.Btn1);
        Btn2=(Button) findViewById(R.id.Btn2);

    }
    public void doBtn1(View view){



    }
    // Start and Stop 按鍵觸發
    public void doBtn2(View view){
        isRunning = !isRunning;
        if(isRunning){
            Btn1.setText("Restart");
            Btn2.setText("Stop!!");
        }else {
            Btn1.setText("Lap");
            Btn2.setText("Start!!");
        }
    }

}
