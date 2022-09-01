package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(7);
    static final qo a;
    final Bundle b;

    static {
        qo qoVar = new qo();
        a = qoVar;
        qoVar.put("android.media.metadata.TITLE", 1);
        qoVar.put("android.media.metadata.ARTIST", 1);
        qoVar.put("android.media.metadata.DURATION", 0);
        qoVar.put("android.media.metadata.ALBUM", 1);
        qoVar.put("android.media.metadata.AUTHOR", 1);
        qoVar.put("android.media.metadata.WRITER", 1);
        qoVar.put("android.media.metadata.COMPOSER", 1);
        qoVar.put("android.media.metadata.COMPILATION", 1);
        qoVar.put("android.media.metadata.DATE", 1);
        qoVar.put("android.media.metadata.YEAR", 0);
        qoVar.put("android.media.metadata.GENRE", 1);
        qoVar.put("android.media.metadata.TRACK_NUMBER", 0);
        qoVar.put("android.media.metadata.NUM_TRACKS", 0);
        qoVar.put("android.media.metadata.DISC_NUMBER", 0);
        qoVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        qoVar.put("android.media.metadata.ART", 2);
        qoVar.put("android.media.metadata.ART_URI", 1);
        qoVar.put("android.media.metadata.ALBUM_ART", 2);
        qoVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        qoVar.put("android.media.metadata.USER_RATING", 3);
        qoVar.put("android.media.metadata.RATING", 3);
        qoVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        qoVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        qoVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        qoVar.put("android.media.metadata.DISPLAY_ICON", 2);
        qoVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        qoVar.put("android.media.metadata.MEDIA_ID", 1);
        qoVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        qoVar.put("android.media.metadata.MEDIA_URI", 1);
        qoVar.put("android.media.metadata.ADVERTISEMENT", 0);
        qoVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(cf.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
