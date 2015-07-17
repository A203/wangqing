package studio.com.calclationapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.math.RoundingMode;

import studio.com.calclationapplication.R;


public class MainActivity extends Activity {

    private EditText context;
    private EditText result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = (EditText)this.findViewById(R.id.context);
        result = (EditText)this.findViewById(R.id.result);
    }

    private void Calculation() {
        Toast t =null;
        Arithmetic arithmetic=new Arithmetic(context.getText().toString(),2, RoundingMode.HALF_UP);
        try{
            result.setText(arithmetic.calculate());
        }catch(ArithmeticException  ae){
            t = Toast.makeText(this, R.string.Error,Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }catch(Exception e){
            t = Toast.makeText(this, R.string.Error, Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }

    }

    public void onButtonClick(View v) {
        int tem = v.getId();
        switch(tem){
            case R.id.Add:
                context.append("+");
                break;
            case R.id.Less:
                context.append("-");
                break;
            case R.id.Multiply:
                context.append("*");
                break;
            case R.id.Division:
                context.append("/");
                break;
            case R.id.Number1:
                context.append("1");
                break;
            case R.id.Number2:
                context.append("2");
                break;
            case R.id.Number3:
                context.append("3");
                break;
            case R.id.Number4:
                context.append("4");
                break;
            case R.id.Number5:
                context.append("5");
                break;
            case R.id.Number6:
                context.append("6");
                break;
            case R.id.Number7:
                context.append("7");
                break;
            case R.id.Number8:
                context.append("8");
                break;
            case R.id.Number9:
                context.append("9");
                break;
            case R.id.Number0:
                context.append("0");
                break;
            case R.id.Point:
                context.append(".");
                break;
            case R.id.LeftParenthesis:
                context.append("(");
                break;
            case R.id.RightParenthesis:
                context.append(")");
                break;
            case R.id.Calculation:          //º∆À„
                Calculation();
                break;
            case R.id.Clear:                //∏¥Œª
                context.setText("");
                result.setText("");
                break;
        }
    }
}