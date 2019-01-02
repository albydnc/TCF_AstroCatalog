/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrocatalog;

/**
 *
 * @author albertoperro
 */
public abstract class skyObject {
  //variables
  protected String name;
  protected float mass;
  protected float size;


  public skyObject(String name, float mass, float size){
    this.name = name;
    this.mass = mass;
    this.size = size;
  }
  public String getName(){
    return name;
  }
  public abstract String printProperties();
}

