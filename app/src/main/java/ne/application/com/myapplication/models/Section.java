package ne.application.com.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Harikesh on 11/03/2019.
 */
public class Section {
    @SerializedName("background")
    @Expose
    private Object background;
    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;
    @SerializedName("sectionId")
    @Expose
    private String sectionId;

    public Object getBackground() {
        return background;
    }

    public void setBackground(Object background) {
        this.background = background;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
}
