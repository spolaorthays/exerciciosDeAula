package com.example.elisios.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Double operador1;

    private Double operador2;

    private String operadores;

    private TextView textoDoVisor;

    private Button botaoC, botaoNum0, botaoUm, botaoDois, botaoTres, botaoQuatro, botaoCinco,
            botaoSeis, botaoSete, botaoOito, botaoNove, botaoMais, botaoMenos, botaoMaisMenos,
            botaoMultiplicar, botaoDividir, botaoPorcentagem, botaoPonto, botaoIgual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoDoVisor = (TextView) findViewById(R.id.id_texto_principal);

        inicializador();
        botoesClicados();
    }

    public void inicializador (){

        //Números da calculadora
        botaoNum0 = (Button)findViewById(R.id.id_botao_0);
        botaoUm = (Button)findViewById(R.id.id_botao_1);
        botaoDois = (Button)findViewById(R.id.id_botao_2);
        botaoTres = (Button)findViewById(R.id.id_botao_3);
        botaoQuatro = (Button)findViewById(R.id.id_botao_4);
        botaoCinco = (Button)findViewById(R.id.id_botao_5);
        botaoSeis = (Button)findViewById(R.id.id_botao_6);
        botaoSete = (Button)findViewById(R.id.id_botao_7);
        botaoOito = (Button)findViewById(R.id.id_botao_8);
        botaoNove = (Button)findViewById(R.id.id_botao_9);

        //Apagar
        botaoC = (Button)findViewById(R.id.id_botao_c);

        //Operadores e sinais
        botaoPorcentagem = (Button)findViewById(R.id.id_botao_porcentagem);
        botaoDividir = (Button)findViewById(R.id.id_botao_dividir);
        botaoMultiplicar = (Button)findViewById(R.id.id_botao_multiplicar);
        botaoMenos = (Button)findViewById(R.id.id_botao_menos);
        botaoMais = (Button)findViewById(R.id.id_botao_mais);
        botaoPonto = (Button)findViewById(R.id.id_botao_ponto);
        botaoMaisMenos = (Button)findViewById(R.id.id_botao_maismenos);

        //Resultado
        botaoIgual = (Button)findViewById(R.id.id_botao_igual);
    }

    public void botoesClicados(){
        botaoC.setOnClickListener(this);
        botaoNum0.setOnClickListener(this);
        botaoUm.setOnClickListener(this);
        botaoDois.setOnClickListener(this);
        botaoTres.setOnClickListener(this);
        botaoQuatro.setOnClickListener(this);
        botaoCinco.setOnClickListener(this);
        botaoSeis.setOnClickListener(this);
        botaoSete.setOnClickListener(this);
        botaoOito.setOnClickListener(this);
        botaoNove.setOnClickListener(this);
        botaoMais.setOnClickListener(this);
        botaoMenos.setOnClickListener(this);
        botaoMaisMenos.setOnClickListener(this);
        botaoMultiplicar.setOnClickListener(this);
        botaoDividir.setOnClickListener(this);
        botaoPorcentagem.setOnClickListener(this);
        botaoPonto.setOnClickListener(this);
        botaoIgual.setOnClickListener(this);
    }

    private void tecladoNumerico (int numero){


        if(textoDoVisor.getText().toString().trim().equals("0.0")){
            limparTela();
            textoDoVisor.setText(textoDoVisor.getText().toString()+String.valueOf(numero));
        }else{
            textoDoVisor.setText(textoDoVisor.getText().toString()+String.valueOf(numero));
        }
    }

    public void ponto (String ponto){
        textoDoVisor.setText(textoDoVisor.getText().toString()+ponto);
    }


     public void operacoes (String operadores){

        this.operadores=operadores;

        if (operadores == "+"){
            operador1 = Double.parseDouble(textoDoVisor.getText().toString().trim());
            limparTela();

        } else if (operadores == "-"){
            operador1 = Double.parseDouble(textoDoVisor.getText().toString().trim());
            limparTela();

        }else if (operadores == "x"){
            operador1 = Double.parseDouble(textoDoVisor.getText().toString().trim());
            limparTela();

        }else if (operadores == "÷"){
            operador1 = Double.parseDouble(textoDoVisor.getText().toString().trim());
            limparTela();

        }else if (operadores == "%"){
            operador1 = Double.parseDouble(textoDoVisor.getText().toString().trim());
            limparTela();

        }else if (operadores == "+/-"){
            operador1 = Double.parseDouble(textoDoVisor.getText().toString().trim());
            limparTela();
        }
    }

    public void igual (){

        this.operadores = operadores;
        operador2 = Double.parseDouble(textoDoVisor.getText().toString());
        limparTela();
        Double resultado = 0D;

        if(textoDoVisor.getText().toString().trim().equals("")){

            if(operadores == "+"){
                resultado = operador1+operador2;

            }else if (operadores == "-"){
                resultado = operador1-operador2;

            }else if (operadores == "x"){
                resultado = operador1*operador2;

            }else if (operadores == "÷"){
                if(operador1 == 0){
                    resultado = 0D;

                }else if (operador2 == 0){
                    resultado = 0D;

                }else{
                    resultado = operador1 / operador2;
                }

            }else if (operadores == "%"){
                if(operador2 != null){
                    resultado = operador1*(operador2/100);
                }/*else if (operador2 == null){
                    //resultado = operador1/100;
                } */
            //todo ver como faz com o +/-
            }/*else if (operadores == "+/-"){
                resultado = operacoes("-")+operador1;

            }*/
        }
        textoDoVisor.setText(String.valueOf(resultado));
    }

    public void limparTela (){
        textoDoVisor.setText("");
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.id_botao_0:
                tecladoNumerico(0);
                break;

            case R.id.id_botao_1:
                tecladoNumerico(1);
                break;

            case R.id.id_botao_2:
                tecladoNumerico(2);
                break;

            case R.id.id_botao_3:
                tecladoNumerico(3);
                break;

            case R.id.id_botao_4:
                tecladoNumerico(4);
                break;

            case R.id.id_botao_5:
                tecladoNumerico(5);
                break;

            case R.id.id_botao_6:
                tecladoNumerico(6);
                break;

            case R.id.id_botao_7:
                tecladoNumerico(7);
                break;

            case R.id.id_botao_8:
                tecladoNumerico(8);
                break;

            case R.id.id_botao_9:
                tecladoNumerico(9);
                break;

            case R.id.id_botao_c:
                limparTela();
                break;

            case R.id.id_botao_igual:
                igual();
                break;

            case R.id.id_botao_ponto:
                ponto(".");
                break;

            case R.id.id_botao_mais:
                operacoes("+");
                break;

            case R.id.id_botao_menos:
                operacoes("-");
                break;

            case R.id.id_botao_dividir:
                operacoes("÷");
                break;

            case R.id.id_botao_multiplicar:
                operacoes("x");
                break;

            case R.id.id_botao_porcentagem:
                operacoes("%");
                break;

            case R.id.id_botao_maismenos:
                operacoes("+/-");
                break;
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
