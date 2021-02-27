package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String FirstNum="";
    private String SecondNum="";
    private double Res=0;
    private String Action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Eq(View view){
        if (FirstNum!="") {
            Intent intent = getIntent();
            TextView messageText = (TextView) findViewById(R.id.test);
            SecondNum = messageText.getText().toString();
            messageText.setText("");
            DoAction();
        }



    }
    public void Plus(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        if (SecondNum =="" && FirstNum=="")
        {
            FirstNum= messageText.getText().toString();
            messageText.setText("");
            Action="+";


        }
        else if(SecondNum =="" && FirstNum!="")
        {
            SecondNum= messageText.getText().toString();
            messageText.setText("");
            DoAction();
            FirstNum=Double.toString(Res);
            Action="+";
        }


        }
    public void Minus(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        if (SecondNum =="" && FirstNum=="")
        {
            FirstNum= messageText.getText().toString();
            messageText.setText("");
            Action="-";


        }
        else if(SecondNum =="" && FirstNum!="")
        {
            SecondNum= messageText.getText().toString();
            messageText.setText("");
            DoAction();
            FirstNum=Double.toString(Res);
            Action="-";
        }


    }
    public void Multi(View view){

        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        if (SecondNum =="" && FirstNum=="")
        {
            FirstNum= messageText.getText().toString();
            messageText.setText("");
            Action="*";


        }
        else if(SecondNum =="" && FirstNum!="")
        {
            SecondNum= messageText.getText().toString();
            messageText.setText("");
            DoAction();
            FirstNum=Double.toString(Res);
            Action="*";
        }


    }
    public void Divide(View view){

        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        if (SecondNum =="" && FirstNum=="")
        {
            FirstNum= messageText.getText().toString();
            messageText.setText("");
            Action="/";


        }
        else if(SecondNum =="" && FirstNum!="")
        {
            SecondNum= messageText.getText().toString();
            messageText.setText("");
            DoAction();
            FirstNum=Double.toString(Res);
            Action="/";
        }


    }
    public void One(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"1");}
    public void Point(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;

        }

        messageText.setText(messageText.getText()+".");}
    public void Clear(View view) {
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);

        messageText.setText("");
        Res =0;
        SecondNum=FirstNum="";
        Action="";


    }
    public void Percent(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        if (SecondNum =="" && FirstNum=="")
        {
            FirstNum= messageText.getText().toString();
            FirstNum= Double.toString(Double.parseDouble(FirstNum)/100);
            messageText.setText("");
            Action="*";


        }
        else if(SecondNum =="" && FirstNum!="")
        {
            SecondNum= messageText.getText().toString();
            messageText.setText("");
            DoAction();
            FirstNum=Double.toString(Res);
            Action="*";
        }


    }
    public void Four(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"4");}
    public void Five(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            FirstNum="";

            messageText.setText("");
            Res=0;

        }


        messageText.setText(messageText.getText()+"5");}
    public void Six(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"6");}
    public void PlusMinus(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        if (messageText.getText().charAt(0)=='-')
        {
            messageText.setText(messageText.getText().subSequence(1,messageText.getText().length()));
            return;
        }

        messageText.setText("-"+messageText.getText());}
    public void Seven(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"7");}
    public void Eight(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"8");}
    public void Nine(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";


        }

        messageText.setText(messageText.getText()+"9");}
    public void Zero(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"0");}
    public void Three(View view){
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";

        }

        messageText.setText(messageText.getText()+"3");}
    public void Two(View view) {
        Intent intent = getIntent();
        TextView messageText = (TextView) findViewById(R.id.test);
        String t= messageText.getText().toString();
        String r= Double.toString(Res).substring(0);
        if (t.compareTo(r)==0)
        {
            messageText.setText("");
            Res=0;
            FirstNum="";


        }
        messageText.setText(messageText.getText() + "2");
    }
    public void DoAction()
        {
            switch (Action) {
                case  ("+"):
                { Intent intent = getIntent();
                    TextView messageText = (TextView) findViewById(R.id.test);
                    double res = Double.parseDouble(FirstNum) + Double.parseDouble(SecondNum);
                    Res=res;
                    SecondNum=FirstNum="";

                    messageText.setText((Double.toString(res)));
                }
                    break;
                case ("-"): {
                    Intent intent = getIntent();
                    TextView messageText = (TextView) findViewById(R.id.test);
                 double res = Double.parseDouble(FirstNum) - Double.parseDouble(SecondNum);

                    Res=res;
                    SecondNum=FirstNum="";

                    messageText.setText((Double.toString(res)));
                }
                    break;

                case ("*"): {
                    Intent intent = getIntent();
                    TextView messageText = (TextView) findViewById(R.id.test);
                    double res = Double.parseDouble(FirstNum) * Double.parseDouble(SecondNum);

                    Res=res;
                    SecondNum=FirstNum="";

                    messageText.setText((Double.toString(res)));
                }
                    break;
                case ("/"):
                {
                    if (SecondNum!="0") {
                        Intent intent = getIntent();
                        TextView messageText = (TextView) findViewById(R.id.test);
                        double res = Double.parseDouble(FirstNum) / Double.parseDouble(SecondNum);
                        ;

                        Res = res;
                        SecondNum = FirstNum = "";

                        messageText.setText((Double.toString(res)));
                    }
                    else
                    {
                        Intent intent = getIntent();
                        TextView messageText = (TextView) findViewById(R.id.test);
                        messageText.setText("Ядерные боеголовки активированы");
                        SecondNum = FirstNum = "";
                        Res=0;
                    }
                }

                    break;
                default:
                {}
                    break;
            }

        }

}