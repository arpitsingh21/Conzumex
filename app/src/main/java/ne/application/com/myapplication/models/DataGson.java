package ne.application.com.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Harikesh on 11/03/2019.
 */
public class DataGson {
    @SerializedName("background")
    @Expose
    private Background background;
    @SerializedName("cardId")
    @Expose
    private String cardId;
    @SerializedName("cardType")
    @Expose
    private String cardType;
//    @SerializedName("expandedData")
//    @Expose
//    private ExpandedData expandedData;
    @SerializedName("expandedView")
    @Expose
    private Object expandedView;

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }



    public void setExpandedView(Object expandedView) {
        this.expandedView = expandedView;
    }
    @SerializedName("sections")
    @Expose
    private List<Section> sections = null;

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
