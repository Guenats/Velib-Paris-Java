/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlevelib;

import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.Marker;
import generated.Carto;
import generated.Carto.Markers;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Guena
 */
public class main {
    
    static List<generated.Carto.Markers.Marker> listMark;
    
    public static List<generated.Carto.Markers.Marker> ListMarkers() throws MalformedURLException, JAXBException, IOException{
        URL url = new URL("http://www.velib.paris.fr/service/carto");
                        JAXBContext jc = JAXBContext.newInstance("generated");
                        Unmarshaller u = jc.createUnmarshaller();
                        Carto carto = (Carto)u.unmarshal(url.openStream()); 
                        List<generated.Carto.Markers.Marker> markers = carto.getMarkers().getMarker();
                        return markers;
    }

   
    public static void main(String[] args) throws MalformedURLException, JAXBException {
        
                   
    }
    
    
}
