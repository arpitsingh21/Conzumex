package ne.application.com.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Harikesh on 11/03/2019.
 */
public class Background {
    @SerializedName("src")
    @Expose
    private Src src;
    @SerializedName("backdropColor")
    @Expose
    private Object backdropColor;
    @SerializedName("backdropOpacity")
    @Expose
    private Integer backdropOpacity;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("color")
    @Expose
    private List<Object> color = null;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("fallback")
    @Expose
    private String fallback;
    @SerializedName("fill")
    @Expose
    private String fill;
    @SerializedName("opacity")
    @Expose
    private Integer opacity;
    @SerializedName("type")
    @Expose
    private String type;

    public Object getBackdropColor() {
        return backdropColor;
    }

    public void setBackdropColor(Object backdropColor) {
        this.backdropColor = backdropColor;
    }

    public Integer getBackdropOpacity() {
        return backdropOpacity;
    }

    public void setBackdropOpacity(Integer backdropOpacity) {
        this.backdropOpacity = backdropOpacity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Object> getColor() {
        return color;
    }

    public void setColor(List<Object> color) {
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public Integer getOpacity() {
        return opacity;
    }

    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    public Src getSrc() {
        return src;
    }

    public void setSrc(Src src) {
        this.src = src;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
