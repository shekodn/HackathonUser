package sdn.hackathon.Menu_Layout;

/**
 * Created by SDN on 11/7/15.
 */
public class Productos {

    private int _id;
    private String _productName;

    public Productos(){

    }

    public Productos(String productName){

        this._productName = productName;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_productName() {
        return _productName;
    }

    public void set_productName(String _productName) {
        this._productName = _productName;
    }
}
