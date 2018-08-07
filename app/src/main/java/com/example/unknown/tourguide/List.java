package com.example.unknown.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class List implements Parcelable {
    public static final Creator<List> CREATOR = new Creator<List>() {
        @Override
        public List createFromParcel(Parcel in) {
            return new List(in);
        }

        @Override
        public List[] newArray(int size) {
            return new List[size];
        }
    };
    private int mTitle;
    private int mFullImage;
    private int mSmallImage;
    private int mInfo;


    public List(int entryNameId, int entryPictureId, int entryIconId, int entryInfoId) {
        mTitle = entryNameId;
        mFullImage = entryPictureId;
        mSmallImage = entryIconId;
        mInfo = entryInfoId;
    }

    protected List(Parcel in) {
        mTitle = in.readInt();
        mFullImage = in.readInt();
        mInfo = in.readInt();
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmFullImage() {
        return mFullImage;
    }

    public int getmSmallImage() {
        return mSmallImage;
    }

    public int getmInfo() {
        return mInfo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mTitle);
        parcel.writeInt(mFullImage);
        parcel.writeInt(mInfo);
    }
}
