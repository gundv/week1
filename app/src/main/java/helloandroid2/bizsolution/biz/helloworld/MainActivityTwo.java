package helloandroid2.bizsolution.biz.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {


    /**
     * TextView tvHelloWorld here is the text view that referenced to the txtHelloWorld in activity_main_two.xml
     *
     * The way that we can references from MainActivityTwo.java to activity_main_two.xml by:
     *
     * setContentView(R.layout.activity_main_two);
     *
     * and
     *
     * findViewById(R.id.txtHelloWorld);
     *
     */
    private TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        tvHelloWorld = findViewById(R.id.txtHelloWorld);

        /**
         * to get the value from intent from source intent first we need to getIntent();
         * if the getIntent return null value this mean that we directly open the open activity from
         * AndroidManifest.xml by setting it as default activity
         * we can get extra value from previous intent using getExtra from previous intent
         *
         */

        Intent intent = getIntent();


        //Serializable extra from previous activity
        Person msg= (Person) intent.getSerializableExtra("Serializable");

        //integer extra from previous activity, the 0 is default value when there is no key name int
        //from source activity
        int integer = intent.getIntExtra("int",0);

        //float extra from previous activity, the 0.0f is default value when there is no key name float
        //from source activity
        float fl = intent.getFloatExtra("float",0.0f);

        //boolean extra from previous activity, the false is default value when there is no key name boolean
        //from source activity
        boolean bool = intent.getBooleanExtra("boolean",false);


        tvHelloWorld.setText(msg.getName()+ " - "+ msg.getPhone() + " - "+msg.getAge());
    }
}
