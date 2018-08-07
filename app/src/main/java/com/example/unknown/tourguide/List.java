package com.example.unknown.tourguide;

//Implement Parcelable to send information to other activities. More information and code about
// implementing Parcelable can be found in this tutorial:
// https://www.youtube.com/watch?v=WBbsvqSu0is

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
    private int mEntryNameId;
    private int mEntryPictureId;
    private int mEntryIconId;
    private int mEntryInfoId;


    public List(int entryNameId, int entryPictureId, int entryIconId, int entryInfoId) {
        mEntryNameId = entryNameId;
        mEntryPictureId = entryPictureId;
        mEntryIconId = entryIconId;
        mEntryInfoId = entryInfoId;
    }

    protected List(Parcel in) {
        mEntryNameId = in.readInt();
        mEntryPictureId = in.readInt();
        mEntryInfoId = in.readInt();
    }

    public int getmEntryNameId() {
        return mEntryNameId;
    }

    public int getmEntryPicutreId() {
        return mEntryPictureId;
    }

    public int getmEntryIconId() {
        return mEntryIconId;
    }

    public int getmEntryInfoId() {
        return mEntryInfoId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mEntryNameId);
        parcel.writeInt(mEntryPictureId);
        parcel.writeInt(mEntryInfoId);
    }
}
