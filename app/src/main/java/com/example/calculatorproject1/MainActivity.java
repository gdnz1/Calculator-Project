package com.example.calculatorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView textView1, textView2;

    Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9;

    Button point_button, equals_button, plus_button, minus_button, multiply_button, divide_button, percent_button, ac_button;

    ImageButton backspace_button;

    Boolean addition=false, divide=false, substact=false, multiply=false;

    Float number_1, number_2, result, p_num;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = findViewById(R.id.textview_1);
        textView2 = findViewById(R.id.textview_2);
        point_button = findViewById(R.id.point_button);
        equals_button = findViewById(R.id.equals_button);
        backspace_button = findViewById(R.id.backspace_button);
        plus_button = findViewById(R.id.plus_button);
        minus_button = findViewById(R.id.minus_button);
        multiply_button = findViewById(R.id.multiply_button);
        divide_button = findViewById(R.id.divide_button);
        percent_button = findViewById(R.id.percent_button);
        ac_button = findViewById(R.id.ac_button);
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView2.setText(textView2.getText()+"0");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView2.setText(textView2.getText()+"1");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"2");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"3");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"4");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");


            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"5");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"6");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"7");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"8");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");

            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(textView2.getText()+"9");
                textView1.setText(textView2.getText());
                number_2 = Float.parseFloat(textView1.getText()+" ");


            }

        });
        point_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+".");
                textView2.setText(textView1.getText());
            }
        });

        ac_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                substact=false;
                divide=false;
                multiply=false;
                addition=false;
                textView1.setText("");
                textView2.setText("");

            }
        });

        backspace_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = textView1.getText().toString();

                if(text.length()!=0){
                    String text2 = text.substring(0, text.length() - 1);
                    textView1.setText(text2);
                    textView2.setText(textView1.getText());
                }

            }

        });
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView2==null){

                    textView2.setText("");
                }else{
                    number_1 = Float.parseFloat(textView2.getText()+" ");
                    addition=true;
                    textView2.setText(" ");

                }

            }
        });
        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView2==null){

                    textView2.setText("");
                }else{
                    number_1 = Float.parseFloat(textView2.getText()+" ");
                    substact=true;
                    textView2.setText(" ");

                }
            }
        });
        multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView2==null){

                    textView2.setText("");

                }else{
                    number_1 = Float.parseFloat(textView2.getText()+" ");
                    multiply=true;
                    textView2.setText(" ");

                }

            }
        });

        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView2==null){

                    textView2.setText("");
                }else{
                    number_1 = Float.parseFloat(textView2.getText()+" ");
                    divide=true;
                    textView2.setText(" ");

                }
            }

        });

        percent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_num = Float.parseFloat(textView2.getText()+"");
                p_num = p_num / 100;
                textView1.setText(p_num.toString());
                textView2.setText(p_num.toString());

            }
        });

        equals_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number_2 = Float.parseFloat(textView1.getText()+" ");

                if(addition==true){
                    result = number_1 + number_2;
                    res = result.toString();
                    if(res.endsWith(".0")){
                        res = res.replace(".0","");
                    }
                    textView2.setText(res);
                    textView1.setText(number_1+"+"+number_2);
                    addition=false;

                }else if(substact==true){
                    result = number_1 - number_2;
                    res = result.toString();
                    if(res.endsWith(".0")){
                        res = res.replace(".0","");
                    }
                    textView1.setText(number_1+"-"+number_2);
                    textView2.setText(res);
                    substact=false;

                }else if(multiply==true){
                    result = number_1 * number_2;
                    res = result.toString();
                    if(res.endsWith(".0")){
                        res = res.replace(".0","");
                    }
                    textView1.setText(number_1+"*"+number_2);
                    textView2.setText(res);
                    multiply=false;

                }else if(divide==true){
                    result = number_1 / number_2;
                    res = result.toString();
                    if(res.endsWith(".0")){
                        res = res.replace(".0","");
                    }
                    textView1.setText(number_1+"/"+number_2);
                    textView2.setText(res);
                    divide=false;
                }
            }
        });

    }


}