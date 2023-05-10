package com.example.mobiluygulama.unite3.uyg3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mobiluygulama.R;

import java.util.ArrayList;

public class UrunAdapter extends ArrayAdapter<Urun> {
    ArrayList<Urun> urunler;
    Context context;

    public UrunAdapter(@NonNull Context context, ArrayList<Urun> urunler) {
        super(context, 0, urunler);
        this.context = context;
        this.urunler = urunler;
    }

    @Override
    public int getCount() {
        return urunler.size();
    }

    @Nullable
    @Override
    public Urun getItem(int position) {
        return urunler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return urunler.get(position);
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        TextView satirUrunAdi;
        TextView satirUrunFiyat;
        TextView satirUrunAdet;
        TextView satirUrunresmi;
        Urun urun = urunler.get(i);
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.u7_uyg3_listview_satir, null);
            
        }

    }
}
