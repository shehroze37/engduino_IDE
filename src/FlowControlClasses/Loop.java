/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FlowControlClasses;

import SketchClasses.Sketch;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author shehrozebhatti
 */
public class Loop extends Module {

    private int start = 0 ;
    
    private int end = 16 ;
    
    private boolean increment = true ;
    
    public Loop(String mod_id, double x_coordinate, double y_coordinate, AnchorPane sketch, Sketch main_sketch) {
        super(new Image("graphics/draggables/loop.png"), mod_id,x_coordinate,y_coordinate,sketch,main_sketch ) ;
        
    }
    
    @Override
    public String getModuleCode(){
        
        return "for(int i = " + this.start + "; i < " + this.end + "; i++ ){" ;
        
    }
    
}
