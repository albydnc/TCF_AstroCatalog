/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrocatalog;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/**
 *
 * @author GRUPPO999
 */
public class AstroCatalog extends Application {
    Star Sun = new Star("Sun",(float) 1.9891e30,(float) 1.3909e9,5777,3.827e26,1.408e3,1.412e27,6.088e18,274,"Yellow Dwarf", "G2 V", true);
    Planet Mercury = new Planet("Mercury",(float)3.3011e23,(float)4879.4,(float)440,(float)5.427e3,(float)6.083e19,
                                (float)7.5e13,(float)3.7,(float)5.067e6,(float)7.6e9,(float)6.98e10,(float)4.7e10,0,0,"Terrestrial Planet",false);
    Planet Venus = new Planet("Venus",(float)4.87e24,(float)1.21e7,(float)737,(float)5.243e3,(float)9.28e20,
                                (float)4.6e14,(float)8.87,(float)2.1e7,(float)2.1e7,(float)1.09e11,(float)1.07e11,0,0,"Terrestrial Planet",false);
    Planet Earth = new Planet("Earth",(float)5.97e24,(float)1.27e7,(float)287,(float)5.514e3,(float)1.08e21,
                                (float)5.09e14,(float)9.81,(float)85536,(float)3.2e7,(float)1.52e11,(float)1.4711,1,0,"Terrestrial Planet",true);
    Planet Mars = new Planet("Mars",(float)6.42e23,(float)6805,(float)210,(float)3934,(float)1.63e20,
                                (float)1.45e14,(float)3.69,(float)86549,(float)5.93e7,(float)2.49e11,(float)2.067e11,2,0,"Terrestrial Planet",false);
    Planet Jupiter = new Planet("Jupiter",(float)1.9e27,(float)1.38e8,(float)152,(float)1.33e3,(float)1.43e24,
                                (float)6.2e16,(float)23.12,(float)3.5e4,(float)3.7e11,(float)8.16e11,(float)7.4e11,79,4,"Gas Giant",false);
    Planet Saturn = new Planet("Saturn",(float)5.7e26,(float)1.15e8,(float)143,(float)687,(float)8.27e23,
                                (float)4.26e16,(float)8.96,(float)3.8e4,(float)9.3e8,(float)1.5e12,(float)1.4e12,62,1000,"Gas Giant",false);
    Planet Uranus = new Planet("Uranus",(float)8.6e25,(float)5e7,(float)68,(float)1271,(float)6.8e19,
                                (float)8.1e15,(float)8.69,(float)6.1e4,(float)2.6e9,(float)3e12,(float)2.7e12,27,13,"Gas Giant",false);
    Planet Neptune = new Planet("Neptune",(float)1.02e26,(float)4.9e7,(float)53,(float)1638,(float)6.3e22,
                                (float)7.6e15,(float)11.15,(float)5.7e4,(float)5.2e9,(float)4.5e12,(float)4.5e12,14,10,"Gas Giant",false);
    Planet Pluto = new Planet("Pluto",(float)1.3e22,(float)2.3e6,(float)45,(float)2030,(float)6.39e18,
                                (float)1.67e13,(float)0.62,(float)5.4e5,(float)7.88e9,(float)7.4e12,(float)4.4e12,5,0,"Dwarf Planet",false);
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AstroCatalog.fxml"));
        Parent root = loader.load();
        Ui controller = (Ui) loader.getController();
        controller.skyList.getItems().addAll("Sun","Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto");
        controller.skyList.getSelectionModel().selectedItemProperty().addListener(
                (ObservableValue<? extends String> ov, String old_val, String new_val) -> {
            switch(new_val){
                case "Sun":
                    controller.detailTxt.setText(Sun.printProperties());
                    break;
                case "Mercury":
                    controller.detailTxt.setText(Mercury.printProperties());
                    break;
                case "Venus":
                    controller.detailTxt.setText(Venus.printProperties());
                    break;
                case "Earth":
                    controller.detailTxt.setText(Earth.printProperties());
                    break;
                case "Mars":
                    controller.detailTxt.setText(Mars.printProperties());
                    break;
                case "Jupiter":
                    controller.detailTxt.setText(Jupiter.printProperties());
                    break;
                case "Saturn":
                    controller.detailTxt.setText(Saturn.printProperties());
                    break;
                case "Uranus":
                    controller.detailTxt.setText(Uranus.printProperties());
                    break;
                case "Neptune":
                    controller.detailTxt.setText(Neptune.printProperties());
                    break;
                case "Pluto":
                    controller.detailTxt.setText(Pluto.printProperties());
                    break;
                default:
                    controller.detailTxt.setText("No Item Selected");
                    break;
            }
            Image image;
            image = new Image(getClass().getResourceAsStream("/images/"+new_val+".jpg"));
            controller.objView.setImage(image);
        });
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("AstroCatalog");
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
}
