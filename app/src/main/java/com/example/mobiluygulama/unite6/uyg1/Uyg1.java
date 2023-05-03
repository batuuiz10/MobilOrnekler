package com.example.mobiluygulama.unite6.uyg1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulama.R;
import com.example.mobiluygulama.databinding.ActivityMainBinding;
import com.example.mobiluygulama.databinding.U6Uyg1Binding;

import java.util.ArrayList;


public class Uyg1 extends AppCompatActivity {

    private U6Uyg1Binding binding;
    int seciliSiraNo;
    ArrayList<Gorsel> gorselArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = U6Uyg1Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        gorselArrayList = new ArrayList<Gorsel>();

        Gorsel balon = new Gorsel("Sarı Balon",1, R.drawable.balon);
        Gorsel cicek = new Gorsel("Mavi Çiçek",2,R.drawable.cicek);
        Gorsel kelebek = new Gorsel("Mavi Kelebek",3,R.drawable.kelebek);
        Gorsel kus = new Gorsel("Yuvada Kuş",4,R.drawable.muhabbet_kusu);

    }



    //<!--************************************************************************************** -->
    //<!--************************************ GERİ GİTME ************************************** -->
    //<!--************************************************************************************** -->
    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    //<!--************************************************************************************** -->
    //<!--*********************************** İLERİ GİTME ************************************** -->
    //<!--************************************************************************************** -->

    public class İleri {
        public void ileriGitme(View view){
            if(seciliSiraNo<gorselArrayList.size()-1){
                seciliSiraNo++;
                binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
                binding.textViewBilgi.setText("Bilgi: " + gorselArrayList.get(seciliSiraNo).bilgi);
            }
        }
    }

}
