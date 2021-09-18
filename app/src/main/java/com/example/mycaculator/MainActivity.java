package com.example.mycaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Double so1= Double.valueOf(0);
    Double so2= Double.valueOf(0);
    Character Dau=null;
    String input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtKQ = (TextView) findViewById(R.id.tvKQ);
        TextView tvSo= (TextView) findViewById(R.id.tv);
        Button btnSo0 = (Button) findViewById(R.id.so0);
        btnSo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "0");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }
                tvSo.setText((tvSo.getText().toString()+"0"));
            }
        });
        Button btnSo1 = (Button) findViewById(R.id.so1);
        btnSo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "1")                ;
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"1"));
            }
        });
        Button btnSo2 = (Button) findViewById(R.id.so2);
        btnSo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "2");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"2"));
            }
        });
        Button btnSo3 = (Button) findViewById(R.id.so3);
        btnSo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "3");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"3"));
            }
        });
        Button btnSo4 = (Button) findViewById(R.id.so4);
        btnSo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "4");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"4"));
            }
        });
        Button btnSo5 = (Button) findViewById(R.id.so5);
        btnSo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "5");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"5"));
            }
        });
        Button btnSo6 = (Button) findViewById(R.id.so6);
        btnSo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "6");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());;
                }tvSo.setText((tvSo.getText().toString()+"6"));
            }
        });
        Button btnSo7 = (Button) findViewById(R.id.so7);
        btnSo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "7");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"7"));
            }
        });
        Button btnSo8 = (Button) findViewById(R.id.so8);
        btnSo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "8");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"8"));
            }
        });
        Button btnSo9 = (Button) findViewById(R.id.so9);
        btnSo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtKQ.setText(txtKQ.getText().toString() + "9");
                if (Dau == null) {
                    so1 = Double.valueOf(txtKQ.getText().toString());
                } else {
                    so2 = Double.valueOf(txtKQ.getText().toString());
                }tvSo.setText((tvSo.getText().toString()+"9"));
            }
        });

        Button Cong = (Button) findViewById(R.id.DauCong);
        Cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dau = '+';
                txtKQ.setText("");
                tvSo.setText(so1+"+");
            }
        });
        Button Nhan = (Button) findViewById(R.id.DauNhan);
        Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dau = '*';
                txtKQ.setText("");
                tvSo.setText(so1+"*");
            }
        });
        Button Tru = (Button) findViewById(R.id.DauTru);
        Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dau = '-';
                txtKQ.setText("");
                tvSo.setText(so1+"-");
            }
        });
        Button Chia = (Button) findViewById(R.id.Dauchia);
        Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dau = '/';
                txtKQ.setText("");
                tvSo.setText(so1+"/");
            }
        });

        Button Bang = (Button) findViewById(R.id.DauBang);
        Bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Dau != null) {
                    Double kqne = Double.valueOf(0);
                    switch (Dau) {
                        case '+':
                            kqne = Double.parseDouble(String.valueOf(so1)) + Double.parseDouble(String.valueOf(so2));
                            tvSo.setText(so1+"+"+ so2+"=");
                            break;
                        case '-':
                            kqne = Double.parseDouble(String.valueOf(so1)) - Double.parseDouble(String.valueOf(so2));
                            tvSo.setText(so1+"-"+ so2+"=");
                            break;
                        case '*':
                            kqne = Double.parseDouble(String.valueOf(so1)) * Double.parseDouble(String.valueOf(so2));
                            tvSo.setText(so1+"*"+ so2+"=");
                            break;
                        case '/':
                            kqne = Double.parseDouble(String.valueOf(so1)) / Double.parseDouble(String.valueOf(so2));
                            tvSo.setText(so1+"/"+ so2+"=");
                            break;
                    }
                    txtKQ.setText(kqne.toString());
                    so1 = kqne;
                }
            }
        });
        Button ac = (Button) findViewById(R.id.BtnAC);
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                so1 = Double.valueOf(0);
                so2 = Double.valueOf(0);
                Dau = null;
                txtKQ.setText("");
                tvSo.setText("");
            }
        });
        Button xoa = (Button) findViewById(R.id.BtnCE);
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=txtKQ.getText().toString();
                input=tvSo.getText().toString();
                if (input.length()>0){
                    String newText = input.substring(0, input.length()-1);
                    input = newText;
                }
                txtKQ.setText(input);
                tvSo.setText(input);
            }
        });
    }
}
