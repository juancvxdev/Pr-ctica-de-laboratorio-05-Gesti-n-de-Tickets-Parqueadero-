
package ec.edu.ups.dao;

import ec.edu.ups.idao.IVehiculoDao;
import ec.edu.ups.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Juanc
 */
public class VehiculoDao implements IVehiculoDao {
    
 private  List<Vehiculo> vehiculos;

    public VehiculoDao() {
       vehiculos=new ArrayList<>();
    }
 
    @Override
    public void create(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public Vehiculo read(String placa) {
         for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)){
                return v;
            }
        }
        return null;
        
    }

    @Override
    public void update(Vehiculo vehiculo) {
         for (int i = 0; i < vehiculos.size(); i++) {
           Vehiculo v = vehiculos.get(i);
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
               vehiculos.set(i, vehiculo);
                break;
            }
        }
    }

    @Override
    public void delete(Vehiculo vehiculo) {
          Iterator<Vehiculo> it = vehiculos.iterator();
        while (it.hasNext()) {
            Vehiculo v = it.next();
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Vehiculo> ListaVehiculos() {
        
        return vehiculos;
        
    }
    
}
