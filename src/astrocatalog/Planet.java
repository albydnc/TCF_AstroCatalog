package astrocatalog;

public class Planet extends skyObject{
  float temperature;
  float rotationPeriod;
  float orbitPeriod;
  float afelio;
  float perielio;
  float density;
  float volume;
  float surface;
  float gravity;
  int satellites;
  int rings;
  String classification;
  boolean hasLife;
  public Planet(String name, float mass, float size){
    super(name,mass,size);
  }

  public Planet(String name, float mass, float size,float temperature, float density, float volume,
                float surface,float gravity, float rotationPeriod, float orbitPeriod, float afelio,
                float perielio, int satellites, int rings, String classification, boolean hasLife){
    super(name,mass,size);
    this.temperature = temperature;
    this.density = density;
    this.volume = volume;
    this.surface = surface;
    this.gravity = gravity;
    this.afelio = afelio;
    this.perielio = perielio;
    this.orbitPeriod = orbitPeriod;
    this.rotationPeriod = rotationPeriod;
    this.classification = classification;
    this.satellites = satellites;
    this.rings = rings;
    this.hasLife = hasLife;
  }
  @Override
  public String printProperties(){
    String info = "";
    info += "Name: "+name+"\nMass (kg): "+String.format("%e",mass)+"\nSize (m): "+String.format("%e",size)+"\n";
    info += "Temperature (K): "+String.format("%e",temperature);
    info += "\nDensity (kg/m³): "+String.format("%e",density)+"\nVolume (m³): "+String.format("%e",volume)+"\n";
    info += "Surface (m²): "+String.format("%e",surface)+"\nGravity (m/s²): "+String.format("%e",gravity)+"\n";
    info += "Aphelion (m): "+String.format("%e",afelio)+"\nPerihelion (m): "+String.format("%e",perielio)+"\n";
    info += "Orbit Period (s): "+String.format("%e",orbitPeriod)+"\nRotation Period (s): "+String.format("%e",rotationPeriod)+"\n";
    info += "Satellites: "+String.format("%d",satellites)+"\nRings: "+String.format("%d",rings)+"\n";
    info += "Classification: "+classification+"\n";
    info += (hasLife ? "Has known living forms" : "Does not have any known living form.");
    return info;
  }
  public class Satellite{
    String name;
    float orbitPeriod;
    float rotationPeriod;
    public Satellite(String name,float orbitPeriod,float rotationPeriod ){
      this.name = name;
      this.orbitPeriod = orbitPeriod;
      this.rotationPeriod = rotationPeriod;
    }
    public String getName(){
      return this.name;
    }
  }
}
