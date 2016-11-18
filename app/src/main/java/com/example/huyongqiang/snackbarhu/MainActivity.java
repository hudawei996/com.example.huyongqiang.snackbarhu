package com.example.huyongqiang.snackbarhu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        SnackbarHu.make(findViewById(R.id.button), "A Snackbar is a lightweight material" +
                " design method for providing feedback to a user, " +
                "while optionally providing an action to the user.", SnackbarHu.LENGTH_LONG).setAction("知道了", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "beidianji", Toast.LENGTH_SHORT).show();
            }
        }).show();


        /*final SnackbarHu snackbar = SnackbarHu.make(findViewById(R.id.button), "A Snackbar is a lightweight material design method for providing feedback to a user, while optionally providing an action to the user.", SnackbarHu.LENGTH_LONG);
        snackbar.setActionTextColor(Color.WHITE);


        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));

        TextView textView = (TextView) snackbarView.findViewById(R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);

        Button button = (Button) snackbarView.findViewById(R.id.snackbar_action);
        button.setText("取消");
        button.setBackgroundColor(Color.BLACK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });

        snackbar.show();*/
    }
}
