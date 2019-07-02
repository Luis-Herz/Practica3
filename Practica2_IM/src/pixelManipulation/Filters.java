
package pixelManipulation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.opencv.core.CvType;
import org.opencv.core.Mat;


/**
 *
 * @author 
 */
public class Filters {
    
    public static Mat addBrightness(byte bytes[],Mat image,int level){
      
             double[] newSpec;
             
             for (int i = 0; i < image.rows(); i++) {
                for (int j = 0; j < image.cols(); j++) {
                    newSpec = image.get(i, j);
                    newSpec[0] = newSpec[0] + level;
                    newSpec[1] = newSpec[1] + level;
                    newSpec[2] = newSpec[2] + level;
                    image.put(i, j, newSpec);
                }
            }
         return image;        
    }
    
    public static Mat Contrast(byte bytes[],Mat image, int level){
        double[] newSpec;
             for (int i = 0; i < image.rows(); i++) {
                for (int j = 0; j < image.cols(); j++) {
                    newSpec = image.get(i, j);
                    int umbral=120;
                    for(int a=0;a<3;a++){
                        if(newSpec[a] <umbral){ 
                            newSpec[a] = newSpec[a]-level; 
                        }else{
                            newSpec[a] = newSpec[a]+level;
                        }
                    }
                    
                    image.put(i, j, newSpec);
                }
            }
         return image;
    }
    
    public static Mat Gamma(byte bytes[], Mat image,int level){
        double[] newSpec;
        float y=level/100;
        if(level<100)//este if le agrega un par de decimas al aumento de gamma
        y=y+(y/10);
        
             for (int i = 0; i < image.rows(); i++) {
                for (int j = 0; j < image.cols(); j++) {
                    newSpec = image.get(i, j);
                    newSpec[0] = newSpec[0] + Math.pow(newSpec[0], y);
                    newSpec[1] = newSpec[1] + Math.pow(newSpec[1], y);
                    newSpec[2] = newSpec[2] + Math.pow(newSpec[2], y);
                    image.put(i, j, newSpec);
                }
            }
         return image;     
    }
    
    public static Mat Negative(byte bytes[],Mat image){
        
        double[] C;
        for (int i=0; i< image.rows(); i++){
            for (int j=0; j < image.cols(); j++){
                
                C = image.get(i, j);
                C[0] = Math.pow(2, 8)-1-C[0];
                C[1] = Math.pow(2, 8)-1-C[1];
                C[2] = Math.pow(2, 8)-1-C[2];
                image.put(i, j, C);
            }
        }
        return image;
    }
    
    public static Mat Binarizacion(byte bytes[],Mat image){
        double []C;
        int umbral = 120;
        for(int i=0; i<image.rows();i++){
            for(int  j=0; j<image.cols();j++){
                C = image.get  (i, j);
                int max=0;
                if(C[0]>C[1]){
                    if(C[0]>C[2]){
                        max= (int) C[0];
                    }else{
                        max= (int) C[2];
                    }
                }else if(C[1]>C[2]){
                    max=  (int) C[1];
                }else{
                    max=  (int) C[2];
                }
                if(umbral>max){
                        C[0]=0;
                        C[1]=0;
                        C[2]=0;
                }else{
                        C[0]=255;
                        C[1]=255;
                        C[2]=255;
                }
                image.put(i, j, C);
            }
        }
        return image;
    }
    
    public static Mat smoothing(Mat image, int a){
        
        Mat imageMod;
        int i,j,x,y,c;
        double[] newSpec;
        double cambio;
        double[] aux0 = new double[9];
        double[] aux1 = new double[9];
        double[] aux2 = new double[9];
        
        imageMod = image;
        
        for(i=1; i<image.rows()-1; i++){
            for(j=1; j<image.cols()-1; j++){
                
                if(j==i){
                    x = i-1;
                    y = j-1;
                    
                    aux0 = vecinos(image, x, y, 0);
                    aux1 = vecinos(image, x, y, 1);
                    aux2 = vecinos(image, x, y, 2);
                    
                    newSpec = imageMod.get(i, j);
                    
                    if(a != 3){
                        cambio = centro(aux0, a);
                        newSpec[0] = cambio;
                        cambio = centro(aux1, a);
                        newSpec[1] = cambio;
                        cambio = centro(aux2, a);
                        newSpec[2] = cambio;
                    
                        imageMod.put(i, j, newSpec);
                    }
                    else{
                        cambio = prom(aux0);
                        newSpec[0] = cambio;
                        cambio = prom(aux1);
                        newSpec[1] = cambio;
                        cambio = prom(aux2);
                        newSpec[2] = cambio;
                        imageMod.put(i, j, newSpec);
                    }
                }
                else if(j<i){
                    x = i-1;
                    y = j-1;
                    
                    aux0 = vecinos(image, x, y, 0);
                    aux1 = vecinos(image, x, y, 1);
                    aux2 = vecinos(image, x, y, 2);
                    
                    newSpec = imageMod.get(i, j);
                    
                    if(a != 3){
                        cambio = centro(aux0, a);
                        newSpec[0] = cambio;
                        cambio = centro(aux1, a);
                        newSpec[1] = cambio;
                        cambio = centro(aux2, a);
                        newSpec[2] = cambio;
                    
                        imageMod.put(i, j, newSpec);
                    }
                    else{
                        cambio = prom(aux0);
                        newSpec[0] = cambio;
                        cambio = prom(aux1);
                        newSpec[1] = cambio;
                        cambio = prom(aux2);
                        newSpec[2] = cambio;
                        imageMod.put(i, j, newSpec);
                    }
                }
                else if(i<j){
                    x = i-1;
                    y = j-1;
                    
                    aux0 = vecinos(image, x, y, 0);
                    aux1 = vecinos(image, x, y, 1);
                    aux2 = vecinos(image, x, y, 2);
                    
                    newSpec = imageMod.get(i, j);
                    
                    if(a != 3){
                        cambio = centro(aux0, a);
                        newSpec[0] = cambio;
                        cambio = centro(aux1, a);
                        newSpec[1] = cambio;
                        cambio = centro(aux2, a);
                        newSpec[2] = cambio;
                    
                        imageMod.put(i, j, newSpec);
                    }
                    else{
                        cambio = prom(aux0);
                        newSpec[0] = cambio;
                        cambio = prom(aux1);
                        newSpec[1] = cambio;
                        cambio = prom(aux2);
                        newSpec[2] = cambio;
                        imageMod.put(i, j, newSpec);
                    }
                }
            }
        }
        
        return imageMod;
    }
    
    private static double[] vecinos(Mat imagen, int x, int y, int c){
        
        double[] ve = new double[9];
        double[] newSpec;
        int i,j,n;
        
        n=0;
        
        if(c == 0){
            
            for(i=x; i<x+3; i++){
                for(j=y; j<y+3; j++){
                    newSpec = imagen.get(i, j);
                    ve[n] = newSpec[0];
                    n++;
                }
            }
        }
        else if(c == 1){
            
            for(i=x; i<x+3; i++){
                for(j=y; j<y+3; j++){
                    newSpec = imagen.get(i, j);
                    ve[n] = newSpec[1];
                    n++;
                }
            }
        }
        else if(c == 2){
            
            for(i=x; i<x+3; i++){
                for(j=y; j<y+3; j++){
                    newSpec = imagen.get(i, j);
                    ve[n] = newSpec[2];
                    n++;
                }
            }
        }
        
        return ve;
    }
    
    private static double centro(double[] aux, int a){
        double cambio=0;
        int i;
        
        if(a == 1){
            
            double[] kernel = {1,1,1,1,1,1,1,1,1}; 
        
            for(i=0; i<kernel.length; i++){
          
                cambio = cambio + (kernel[i] * aux[i])/9;
            }
        }
        else if(a == 2){
            
            double[] kernel = {1,2,1,2,4,2,1,2,1}; 
        
            for(i=0; i<kernel.length; i++){
          
                cambio = cambio + (kernel[i] * aux[i])/16;
            }
        }
        
        return cambio;
    }
    
    private static double prom(double[] aux){
        double promedio;
        
        Arrays.sort(aux);
        
        promedio = aux[4];
       
        return promedio;
    }
    
    public static Mat escalar(Mat image, double S){
        
        double[] newSpec;
        int i,j, is, js;
      
        Mat Timage =  new Mat(image.rows(), image.cols(), CvType.CV_8UC3);
      
        for(i=0; i<image.rows(); i++){
            for(j=0; j<image.cols(); j++){
                newSpec = image.get(i, j);
                
                is = (int) (i*S);
                js = (int) (j*S);
                
                Timage.put(is, js, newSpec);
            }
        }
        
        return Timage;
    }
    
    public static Mat Rotar(byte bytes[], Mat image,double angulo, double s){
        double[] pixel;
        int x=0,y=0;
        //Mat imagenResultante = new Mat(image.rows(), image.cols(), CvType.CV_8UC3);
        Mat imagenResultante;
        imagenResultante=image.clone();
        
        for(int i=0;i<imagenResultante.rows();i++){ 
            for(int j=0;j<imagenResultante.cols();j++){
                pixel = imagenResultante.get(i, j);
                pixel[0] = 0;
                pixel[1] = 0;
                pixel[2] = 0;
                imagenResultante.put(i, j, pixel);
            }
        }
        
        for(int i=0;i<image.rows();i++){
            for(int j=0;j<image.cols();j++){
                pixel=image.get(i,j);
                x= (int)(i*Math.cos(angulo) - j*Math.sin(angulo));//Coordenadas de rotacion
                y= (int)(i*Math.sin(angulo) + j*Math.cos(angulo));
                x= (int) (x*s);//escalado
                y= (int) (y*s);
                
                x=x+image.rows()/2;
                y=y+image.cols()/2;
                
                imagenResultante.put(x, y, pixel);//colocando el pixel en su nueva posicion
            }
        }
        //imagenResultante=Trasladar(bytes, imagenResultante);
        return imagenResultante;
    }
    
}
