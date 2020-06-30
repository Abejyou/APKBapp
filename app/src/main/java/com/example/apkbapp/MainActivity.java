package com.example.apkbapp;


import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private GridView layout_basico;
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        if(savedInstanceState==null){
            SobreFragment sobre = new SobreFragment();
            HistoricoFragment historico = new HistoricoFragment();
            ContatoFragment contato = new ContatoFragment();
            GaleriaFragment galeria = new GaleriaFragment();
            ft.add(R.id.fragmentos_menu_inferior, sobre);
        }


        String[] menuInferior = new String[]{"@drawable/ic_content_paste_black_24dp", "Histórico", "Contato", "Galeria"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,  android.R.layout.simple_expandable_list_item_1, menuInferior);
        layout_basico = findViewById( R.id.menu);
        layout_basico.setAdapter( adapter );
        layout_basico.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if(position==0){
                    SobreFragment sobre = new SobreFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace( R.id.fragmentos_menu_inferior, sobre, "sobre" );
                    ft.addToBackStack( "pilha" );
                    ft.commit();
                }else if(position==1){
                    HistoricoFragment historico = new HistoricoFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace( R.id.fragmentos_menu_inferior, historico, "historico" );
                    ft.addToBackStack( "pilha" );
                    ft.commit();
                }else if(position==2){
                    ContatoFragment contato = new ContatoFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace( R.id.fragmentos_menu_inferior, contato, "contato" );
                    ft.addToBackStack( "pilha" );
                    ft.commit();
                }else if(position==3){
                    GaleriaFragment galeria = new GaleriaFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace( R.id.fragmentos_menu_inferior, galeria, "galeria" );
                    ft.addToBackStack( "pilha" );
                    ft.commit();
                }
            }
        } );


    }
}
