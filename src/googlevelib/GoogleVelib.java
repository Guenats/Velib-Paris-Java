/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlevelib;

import Velo.Station;
import com.teamdev.jxmaps.ControlPosition;
import com.teamdev.jxmaps.GeocoderCallback;
import com.teamdev.jxmaps.GeocoderRequest;
import com.teamdev.jxmaps.GeocoderResult;
import com.teamdev.jxmaps.GeocoderStatus;
import com.teamdev.jxmaps.InfoWindow;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.MapMouseEvent;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.MapTypeControlOptions;
import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.MouseEvent;
import generated.Carto;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;





/**
 *
 * @author Guena
 */
public class GoogleVelib extends MapView{

    private static Carto carto;
    private static Station velo;
    private static final String INITIAL_LOCATION = "Paris";
    

    public GoogleVelib(JAXBContext jv,Unmarshaller v)  {
     
        setOnMapReadyHandler((MapStatus status) -> {
            // Check if the map is loaded correctly
            if (status == MapStatus.MAP_STATUS_OK) {
                // Getting the associated map object
                final Map map = getMap();
                // Creating a map options object
                MapOptions options = new MapOptions(map);
                // Creating a map type control options object
                MapTypeControlOptions controlOptions = new MapTypeControlOptions(map);
                // Changing position of the map type control
                controlOptions.setPosition(ControlPosition.TOP_RIGHT);
                // Setting map type control options
                options.setMapTypeControlOptions(controlOptions);
                // Setting map options
                map.setOptions(options);
                // Setting the map center
                map.setCenter(new LatLng(map, 35.91466, 10.312499));
                // Setting initial zoom value
                map.setZoom(7.0);
                
                performGeocode(INITIAL_LOCATION,jv,v);   
                
            }
        });
}
    
    private void performGeocode(String text,JAXBContext jv,Unmarshaller v) {
        // Getting the associated map object
        final Map map = getMap();
        
        // Creating a geocode request
        GeocoderRequest request = new GeocoderRequest(map);
        // Setting address to the geocode request
        request.setAddress(text);
        // Geocoding position by the entered address
        getServices().getGeocoder().geocode(request, new GeocoderCallback(map) {
            @Override
            
            public void onComplete(GeocoderResult[] results, GeocoderStatus status) {
                // Checking operation status
                if ((status == GeocoderStatus.OK) && (results.length > 0)) {
                   
                        List<generated.Carto.Markers.Marker> markers = carto.getMarkers().getMarker();
                        markers.stream().map((m) -> {
                            System.out.println(m.getName());
                        return m;
                    }).map((m) -> {
                        Marker newMarker = new Marker(map);
                        newMarker.setPosition(new LatLng(m.getLat(), m.getLng()));
                        newMarker.setTitle(m.getName());
                        newMarker.addEventListener("click", new MapMouseEvent() {
                            @Override
                            public void onEvent(MouseEvent me) {
                                try {
                                velo = (Station)v.unmarshal(new URL("http://www.velib.paris.fr/service/stationdetails/"+m.getNumber()));
                                final InfoWindow infoWindow = new InfoWindow(map);
                                infoWindow.setContent("<strong>"+m.getFullAddress()+"</strong>"
                                +"<br />"+m.getName()+"<br />"+"Velo disponible"+velo.getFree());
                                infoWindow.open(map,newMarker);
                                } catch (JAXBException | MalformedURLException ex) {
                                    Logger.getLogger(GoogleVelib.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                            }
                        });
                        
                        return newMarker; 
                    }).forEachOrdered((newMarker) -> {
                        newMarker.setClickable(true);
                    });
                    }
                }   
        });
    }
   
    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws JAXBException, MalformedURLException {

        
        JAXBContext jv = JAXBContext.newInstance("Velo");
        Unmarshaller v = jv.createUnmarshaller();
        GoogleVelib sample = new GoogleVelib(jv,v);
        URL url = new URL("http://www.velib.paris.fr/service/carto");
        JAXBContext jc = JAXBContext.newInstance("generated");
        Unmarshaller u = jc.createUnmarshaller();
        carto = (Carto)u.unmarshal(url);
        
        JFrame frame = new JFrame("Map Integration");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(sample, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);   
    
        
    }
    
}
