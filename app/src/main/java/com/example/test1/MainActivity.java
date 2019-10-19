package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private EditText user,key;
    private CheckBox check1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button_1);
        user=findViewById(R.id.edit_1);
        key=findViewById(R.id.edit_2);
        check1=findViewById(R.id.check_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=user.getText().toString();
                String name2=key.getText().toString();
                if(name1.equals("123456")&&name2.equals("123456"))
                {
                    Toast.makeText(MainActivity.this,"登陆成功，欢迎",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"登录失败，请检查后重试",Toast.LENGTH_SHORT).show();
                }

            }
        });

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked?"已选中记住密码":"未选中记住密码",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
