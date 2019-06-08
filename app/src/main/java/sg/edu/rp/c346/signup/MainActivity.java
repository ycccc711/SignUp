package sg.edu.rp.c346.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText fname, lname;
    Button signup;
    ToggleButton student;
    TextView tvmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.et1);
        lname = findViewById(R.id.et2);

        signup = findViewById(R.id.btnSignUp);

        student = findViewById(R.id.toggle);

        tvmessage = findViewById(R.id.tvMessage);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = fname.getText().toString();
                String lastname = lname.getText().toString();
                String message = "Sign up fees: $";

                if(fname.getText().toString().isEmpty() || lname.getText().toString().isEmpty()){
                       message = "Name cannot be empty!";
                }else{
                    if(!student.isChecked()){
                        message += "5";
                    }else{
                        message += "20";
                    }
                }
                tvmessage.setText(message);

            }
        });
    }
}
