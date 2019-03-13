package ne.application.com.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Harikesh on 11/03/2019.
 */
public class Data {
    @SerializedName("backgroundColor")
    @Expose
    private String backgroundColor;
    @SerializedName("buttonAction")
    @Expose
    private Object buttonAction;
    @SerializedName("buttonConfig")
    @Expose
    private Object buttonConfig;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("fallback")
    @Expose
    private Object fallback;
    @SerializedName("fontName")
    @Expose
    private String fontName;
    @SerializedName("fontSize")
    @Expose
    private String fontSize;
    @SerializedName("fontStyle")
    @Expose
    private String fontStyle;
    @SerializedName("helpText")
    @Expose
    private Object helpText;
    @SerializedName("identifiers")
    @Expose
    private Object identifiers;
    @SerializedName("innerIcon")
    @Expose
    private Object innerIcon;
    @SerializedName("inputConfig")
    @Expose
    private Object inputConfig;
    @SerializedName("inputType")
    @Expose
    private Object inputType;
    @SerializedName("key")
    @Expose
    private Object key;
    @SerializedName("opacity")
    @Expose
    private Integer opacity;
    @SerializedName("placeholder")
    @Expose
    private Object placeholder;
    @SerializedName("selectedValue")
    @Expose
    private Object selectedValue;
    @SerializedName("textConfig")
    @Expose
    private Object textConfig;
    @SerializedName("textTransformation")
    @Expose
    private String textTransformation;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value1")
    @Expose
    private Value value;
    @SerializedName("value")
    @Expose
    private String valueint;
    @SerializedName("valueType")
    @Expose
    private Object valueType;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Object getButtonAction() {
        return buttonAction;
    }

    public void setButtonAction(Object buttonAction) {
        this.buttonAction = buttonAction;
    }

    public Object getButtonConfig() {
        return buttonConfig;
    }

    public void setButtonConfig(Object buttonConfig) {
        this.buttonConfig = buttonConfig;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object getFallback() {
        return fallback;
    }

    public void setFallback(Object fallback) {
        this.fallback = fallback;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public Object getHelpText() {
        return helpText;
    }

    public void setHelpText(Object helpText) {
        this.helpText = helpText;
    }

    public Object getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Object identifiers) {
        this.identifiers = identifiers;
    }

    public Object getInnerIcon() {
        return innerIcon;
    }

    public void setInnerIcon(Object innerIcon) {
        this.innerIcon = innerIcon;
    }

    public Object getInputConfig() {
        return inputConfig;
    }

    public void setInputConfig(Object inputConfig) {
        this.inputConfig = inputConfig;
    }

    public Object getInputType() {
        return inputType;
    }

    public void setInputType(Object inputType) {
        this.inputType = inputType;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Integer getOpacity() {
        return opacity;
    }

    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    public Object getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Object placeholder) {
        this.placeholder = placeholder;
    }

    public Object getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(Object selectedValue) {
        this.selectedValue = selectedValue;
    }

    public Object getTextConfig() {
        return textConfig;
    }

    public void setTextConfig(Object textConfig) {
        this.textConfig = textConfig;
    }

    public String getTextTransformation() {
        return textTransformation;
    }

    public void setTextTransformation(String textTransformation) {
        this.textTransformation = textTransformation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Object getValueType() {
        return valueType;
    }

    public void setValueType(Object valueType) {
        this.valueType = valueType;
    }

    public String getValueint() {
        return valueint;
    }

    public void setValueint(String valueint) {
        this.valueint = valueint;
    }
}
