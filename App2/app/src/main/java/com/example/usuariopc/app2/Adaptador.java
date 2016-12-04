package com.example.usuariopc.app2;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Worren Gilgamesh on 03/12/2016.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.usuarioViewHolder> {

    List<Usuario> listUsers;

    public Adaptador(List<Usuario> listUsers) {
        this.listUsers = listUsers;
    }

    @Override
    public usuarioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false );
        usuarioViewHolder holder=new usuarioViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(usuarioViewHolder holder, int position) {
        holder.imgUsuario.setImageResource(listUsers.get(position).getFoto());
        holder.txtUsuario.setText(listUsers.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return listUsers.size();
    }

    public static class usuarioViewHolder extends RecyclerView.ViewHolder{
        ImageView imgUsuario;
        TextView txtUsuario;

        public usuarioViewHolder(View itemView) {
            super(itemView);
            imgUsuario= (ImageView) itemView.findViewById(R.id.imageView);
            txtUsuario= (TextView) itemView.findViewById(R.id.txtUsuario);
        }
    }

}
