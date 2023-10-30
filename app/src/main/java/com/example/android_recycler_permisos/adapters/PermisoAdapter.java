package com.example.android_recycler_permisos.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycler_permisos.models.Permiso;

import java.util.List;

public class PermisoAdapter extends RecyclerView.Adapter<PermisoAdapter.ViewHolder> {
    private List<Permiso> LP;

    public PermisoAdapter(List<Permiso> lp) {
        LP = lp;
    }


    @NonNull
    @Override
    public PermisoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View v=ly;

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PermisoAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return LP.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtPermiso;
        Switch swPermiso;

        Permiso PermisoH;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //txtPermiso=itemView.findViewById(R.id.tvPermiso);
            //sswPermiso=itemView.findViewById(R.id.swPermiso);
        }


    }
}
