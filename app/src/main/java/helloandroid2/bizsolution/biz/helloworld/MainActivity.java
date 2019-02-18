package helloandroid2.bizsolution.biz.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        /***
         *
         * the Other Way to add Action Click to button beside using XML
         * it work the same way as onClick
         * now google recommend to use this method over the implementation on xml
         *
         */
//        Button btn;
//        btn=findViewById(R.id.btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Person person1=new Person("Mr.A ","012343423","29");
//
//                Intent intent=new Intent(MainActivity.this, MainActivityTwo.class);
//
//                intent.putExtra("String","Here is the String Extra");
//
//                intent.putExtra("int",123);
//
//                intent.putExtra("boolean",true);
//
//                intent.putExtra("float",2.34f);
//
//                intent.putExtra("Serializable",person1);
//
//                startActivity(intent);
//            }
//        });


    }


    /***
     * onClick here is used for Button in activity_main.xml to performed action click
     *
     * the body of the function is open the second Activity
     *
     *
     * @param v is the parameter that is required from original Android library's method
     */
    public void onClick(View v){

        Person person1=new Person("Mr.A ","012343423","29");

        Intent intent=new Intent(MainActivity.this, MainActivityTwo.class);


        //pass String Value to second activity
        intent.putExtra("String","Here is the String Extra");

        //pass int Value to second activity
        intent.putExtra("int",123);

        //pass boolean Value to second activity
        intent.putExtra("boolean",true);

        //pass float Value to second activity
        intent.putExtra("float",2.34f);

        //pass Serializable Value to second activity
        intent.putExtra("Serializable",person1);

        startActivity(intent);
    }



}
