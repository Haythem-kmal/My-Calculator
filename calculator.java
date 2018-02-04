/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.calculator
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.calculator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.calculator.R;

/**
 * This app is avery simple calculator just to practise coding.
 */
public class MainActivity extends AppCompatActivity {


    float factorA = 0;
    int equalsPressed = 0;
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitZero(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {  // Tracking the "equalsPressed" variable so I know if "equals" button was pressed.
                                   // without this tracking process,the app crashes because it can't convert a "float string" to "int"
                                  // "float string" means a string that was converted from a floating number.
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 0;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitOne(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 1;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitTwo(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 2;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitThree(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 3;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitFour(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 4;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitFive(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 5;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitSix(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 6;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitSeven(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 7;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitEight(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 8;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void submitNine(View view) {
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        if (equalsPressed == 1) {
            screenTextView.setText("0");
            equalsPressed = 0;
        }
        String screentext = screenTextView.getText().toString() + 9;
        int a = Integer.parseInt(screentext);
        display(a);
    }

    public void operateAdd(View view) {
        operator = "+";
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        String factora = screenTextView.getText().toString(); // this is to store what on the screen in the "factora" variable
        factorA = Float.parseFloat(factora);
        screenTextView.setText("0");
    }

    public void operateSubtract(View view) {
        operator = "-";
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        String factora = screenTextView.getText().toString();
        factorA = Float.parseFloat(factora);
        screenTextView.setText("0");
    }

    public void operateMultiply(View view) {
        operator = "x";
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        String factora = screenTextView.getText().toString();
        factorA = Float.parseFloat(factora);
        screenTextView.setText("0");
    }

    public void operateDivide(View view) {
        operator = "/";
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        String factora = screenTextView.getText().toString();
        factorA = Float.parseFloat(factora);
        screenTextView.setText("0");
    }

    public void equal(View view) {
        float result = 0;
        TextView screenTextView = (TextView) findViewById(R.id.screen_text);
        String factorb = screenTextView.getText().toString();              // this is to store what on the screen in the "factorb" variable
        float factorB = 0;
        factorB = Float.parseFloat(factorb);
        if (operator == "+") {
            result = factorA + factorB;
        } else if (operator == "-") {
            result = factorA - factorB;
        } else if (operator == "x") {
            result = factorA * factorB;
        } else if (operator == "/") {
            result = factorA / factorB;
        } else {
            result = 0;
        }
        factorA = 0;
        operator = "";
        equalsPressed = 1;
        displayresult(result);
    }

    /**
     * This method displays the numbers on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.screen_text);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the result on the screen.
     */
    private void displayresult(float number) {
        TextView quantityTextView = (TextView) findViewById(R.id.screen_text);
        quantityTextView.setText("" + number);
    }
}
