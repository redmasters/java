package main.java.io.redmasters.javabuilder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "Rua 11 D para Unidade 201";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
