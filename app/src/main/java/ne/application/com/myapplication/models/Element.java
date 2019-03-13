package ne.application.com.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Harikesh on 11/03/2019.
 */
public class Element {
    @SerializedName("align")
    @Expose
    private String align;
    @SerializedName("background")
    @Expose
    private Object background;
    @SerializedName("data")
    @Expose
    private List<Data> data = null;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("elementId")
    @Expose
    private String elementId;

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public Object getBackground() {
        return background;
    }

    public void setBackground(Object background) {
        this.background = background;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }
}
