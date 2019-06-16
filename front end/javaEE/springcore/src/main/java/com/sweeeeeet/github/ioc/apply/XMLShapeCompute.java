package com.sweeeeeet.github.ioc.apply;

/**
 * Author:sweet
 * Created:2019/5/19
 */
public class XMLShapeCompute {
    private IShape circular;
    private IShape rectangle;


    //编写set方法，就可以利用setter方法注入的方式
    public void setCircular(IShape circular) {
        this.circular = circular;
    }

    public void setRectangle(IShape rectangle) {
        this.rectangle = rectangle;
    }

    public IShape compute(String shap){
        if(shap.equals("circular")){
            return circular;
        }
        if(shap.equals("rectangle")){
            return rectangle;
        }

        return null;
    }

}
