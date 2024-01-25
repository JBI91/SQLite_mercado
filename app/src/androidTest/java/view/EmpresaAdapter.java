package view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sqlite_mercado.R;

import java.util.List;

import controller.CtrlMercado;
import model.Empresa;

public class EmpresaAdapter extends RecyclerView.Adapter<EmpresaAdapter.ViewHolder> {
    private List<Empresa> empresaList;

    public EmpresaAdapter(Context context ) {
        this.empresaList = CtrlMercado.getEmpresa(context);
    }

    @NonNull
    @Override
    public EmpresaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empresa, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmpresaAdapter.ViewHolder holder, int position) {
           Empresa empresa = empresaList.get(position);
           holder.tvNombre.setText("Nombre: " +empresa.getNombre());
           holder.tvFacturacion.setText("Facturación: " +empresa.getFacturacion());
           holder.tvSector.setText("Sector: " +empresa.getSector_id());
    }

    @Override
    public int getItemCount() {
        return empresaList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNombre, tvFacturacion, tvSector;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvFacturacion = itemView.findViewById(R.id.tvFacturacion);
            tvSector = itemView.findViewById(R.id.tvSector);
        }
    }
}
