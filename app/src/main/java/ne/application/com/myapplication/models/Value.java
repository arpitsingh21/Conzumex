package ne.application.com.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Harikesh on 11/03/2019.
 */
public class Value {
    @SerializedName("cdn")
    @Expose
    private String cdn;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("folder")
    @Expose
    private String folder;

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}
