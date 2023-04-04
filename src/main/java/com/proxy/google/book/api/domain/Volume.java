
package com.proxy.google.book.api.domain;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "volumes")
@CompoundIndexes({
        @CompoundIndex(name = "title_authors", def = "{'mVolumeInfo.mTitle' : 1, 'mVolumeInfo.mAuthors': 1}")
})
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Volume {

    @SerializedName("id")
    @Id
    private String mId;
    @SerializedName("accessInfo")
    private AccessInfo mAccessInfo;
    @SerializedName("etag")
    private String mEtag;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("saleInfo")
    private SaleInfo mSaleInfo;
    @SerializedName("selfLink")
    private String mSelfLink;
    @SerializedName("volumeInfo")
    private VolumeInfo mVolumeInfo;

    private Date created;

    public AccessInfo getAccessInfo() {
        return mAccessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        mAccessInfo = accessInfo;
    }

    public String getEtag() {
        return mEtag;
    }

    public void setEtag(String etag) {
        mEtag = etag;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

    public SaleInfo getSaleInfo() {
        return mSaleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        mSaleInfo = saleInfo;
    }

    public String getSelfLink() {
        return mSelfLink;
    }

    public void setSelfLink(String selfLink) {
        mSelfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return mVolumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        mVolumeInfo = volumeInfo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
