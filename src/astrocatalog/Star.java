package astrocatalog;

public class Star extends skyObject{

  int temperature;
  double luminosity;
  double density;
  double volume;
  double surface;
  double gravity;
  String classification;
  String spectrum;
  boolean hasSystem;

  public Star(String name, float mass, float size){
    super(name,mass,size);
  }
  public Star(String name, float mass, float size,int temperature,double luminosity, double density,
                double volume, double surface,double gravity, String classification, String spectrum, boolean hasSystem){
    super(name,mass,size);
    this.temperature = temperature;
    this.luminosity = luminosity;
    this.density = density;
    this.volume = volume;
    this.surface = surface;
    this.gravity = gravity;
    this.classification = classification;
    this.spectrum = spectrum;
    this.hasSystem = hasSystem;
  }

  @Override
  public String printProperties(){
    String info = "";
    info += "Name: "+name+"\nMass (x10³ kg): "+String.format("%e",mass)+"\nSize (km): "+String.format("%e",size)+"\n";
    info += "Temperature (K): "+String.format("%d",temperature)+"\nLuminosity (x1e22 W): "+String.format("%e",luminosity)+"\n";
    info += "Density (x10³ kg/m³): "+String.format("%e",density)+"\nVolume (x1e27 m³): "+String.format("%e",volume)+"\n";
    info += "Surface (x1e18 m²): "+String.format("%e",surface)+"\nGravity (m/s²): "+String.format("%e",gravity)+"\n";
    info += "Classification: "+classification+"\nSpectrum Class: "+spectrum+"\n";
    info += (hasSystem ? "Has a planetary system." : "Does not have a planetary system.");
    return info;
  }
}
