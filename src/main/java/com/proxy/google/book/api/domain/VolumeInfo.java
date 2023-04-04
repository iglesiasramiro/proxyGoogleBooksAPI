
package com.proxy.google.book.api.domain;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import org.springframework.data.mongodb.core.index.Indexed;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class VolumeInfo {

    @SerializedName("allowAnonLogging")
    private Boolean mAllowAnonLogging;
    @Indexed
    @SerializedName("authors")
    private List<String> mAuthors;
    @SerializedName("canonicalVolumeLink")
    private String mCanonicalVolumeLink;
    @SerializedName("contentVersion")
    private String mContentVersion;
    @SerializedName("industryIdentifiers")
    private List<IndustryIdentifier> mIndustryIdentifiers;
    @SerializedName("infoLink")
    private String mInfoLink;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("maturityRating")
    private String mMaturityRating;
    @SerializedName("previewLink")
    private String mPreviewLink;
    @SerializedName("printType")
    private String mPrintType;
    @SerializedName("publishedDate")
    private String mPublishedDate;
    @SerializedName("readingModes")
    private ReadingModes mReadingModes;
    @Indexed
    @SerializedName("title")
    private String mTitle;

    public Boolean getAllowAnonLogging() {
        return mAllowAnonLogging;
    }

    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        mAllowAnonLogging = allowAnonLogging;
    }

    public List<String> getAuthors() {
        return mAuthors;
    }

    public void setAuthors(List<String> authors) {
        mAuthors = authors;
    }

    public String getCanonicalVolumeLink() {
        return mCanonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        mCanonicalVolumeLink = canonicalVolumeLink;
    }

    public String getContentVersion() {
        return mContentVersion;
    }

    public void setContentVersion(String contentVersion) {
        mContentVersion = contentVersion;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return mIndustryIdentifiers;
    }

    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        mIndustryIdentifiers = industryIdentifiers;
    }

    public String getInfoLink() {
        return mInfoLink;
    }

    public void setInfoLink(String infoLink) {
        mInfoLink = infoLink;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getMaturityRating() {
        return mMaturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        mMaturityRating = maturityRating;
    }

    public String getPreviewLink() {
        return mPreviewLink;
    }

    public void setPreviewLink(String previewLink) {
        mPreviewLink = previewLink;
    }

    public String getPrintType() {
        return mPrintType;
    }

    public void setPrintType(String printType) {
        mPrintType = printType;
    }

    public String getPublishedDate() {
        return mPublishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        mPublishedDate = publishedDate;
    }

    public ReadingModes getReadingModes() {
        return mReadingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        mReadingModes = readingModes;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
