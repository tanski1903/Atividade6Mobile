package br.ulbra.sistemadecadastrosdt1v;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuario tela_listagem;

    public TelaPrincipal(MainActivity act) {
        this.act = act;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.tela_principal);
        btcadastrar_usuario = (Button)
                act.findViewById(R.id.btCadastro);
        bt_listar_usuarios_cadastrados = (Button)
                act.findViewById(R.id.btLista);

        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });


        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_listagem.CarregarTela();
            }
        });

    }

    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro) {
        this.tela_cadastro = tela_cadastro;
    }

    public void setTelaListagem(TelaListagemUsuario tela_listagem) {
        this.tela_listagem = tela_listagem;
    }


}