package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: u  reason: default package */
/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public u(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            case 0:
                return new v(parcel);
            case 1:
                return new t(parcel);
            case 2:
                return new bf(parcel);
            case 3:
                return new bj(parcel);
            case 4:
                return new bm(parcel);
            case 5:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator CREATOR = new u(5);
                    private final int a;
                    private final MediaDescriptionCompat b;

                    {
                        this.a = parcel.readInt();
                        this.b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 6:
                Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (createFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                String i = cd.i(mediaDescription);
                CharSequence h = cd.h(mediaDescription);
                CharSequence g = cd.g(mediaDescription);
                CharSequence f = cd.f(mediaDescription);
                Bitmap a = cd.a(mediaDescription);
                Uri d = cd.d(mediaDescription);
                Bundle e = cd.e(mediaDescription);
                if (e != null) {
                    e = cf.a(e);
                }
                Uri uri = e != null ? (Uri) e.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uri != null) {
                    if (!e.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || e.size() != 2) {
                        e.remove("android.support.v4.media.description.MEDIA_URI");
                        e.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    } else {
                        e = null;
                    }
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(i, h, g, f, a, d, e, uri == null ? ce.a(mediaDescription) : uri);
                mediaDescriptionCompat.a = mediaDescription;
                return mediaDescriptionCompat;
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator CREATOR = new u(9);
                    private final MediaDescriptionCompat a;
                    private final long b;

                    {
                        this.a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        this.a.writeToParcel(parcel2, i2);
                        parcel2.writeLong(this.b);
                    }
                };
            case 10:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
                    public static final Parcelable.Creator CREATOR = new u(10);
                    ResultReceiver a;

                    {
                        this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        this.a.writeToParcel(parcel2, i2);
                    }
                };
            case 11:
                return new Parcelable(parcel.readParcelable(null)) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator CREATOR = new u(11);
                    private final Object a;

                    {
                        this.a = r1;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.a;
                        if (obj2 == null) {
                            return mediaSessionCompat$Token.a == null;
                        }
                        Object obj3 = mediaSessionCompat$Token.a;
                        if (obj3 != null) {
                            return obj2.equals(obj3);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        Object obj = this.a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object] */
                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        parcel2.writeParcelable(this.a, i2);
                    }
                };
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new ParcelableVolumeInfo(parcel);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new PlaybackStateCompat(parcel);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 15:
                return new cj(parcel);
            case 16:
                return new ix(parcel);
            case 17:
                return new lb(parcel);
            case 18:
                return new nl(parcel);
            case 19:
                return new nn(parcel);
            default:
                return new ph(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new v[i];
            case 1:
                return new t[i];
            case 2:
                return new bf[i];
            case 3:
                return new bj[i];
            case 4:
                return new bm[i];
            case 5:
                return new MediaBrowserCompat$MediaItem[i];
            case 6:
                return new MediaDescriptionCompat[i];
            case 7:
                return new MediaMetadataCompat[i];
            case 8:
                return new RatingCompat[i];
            case 9:
                return new MediaSessionCompat$QueueItem[i];
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 11:
                return new MediaSessionCompat$Token[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new ParcelableVolumeInfo[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new PlaybackStateCompat[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new PlaybackStateCompat.CustomAction[i];
            case 15:
                return new cj[i];
            case 16:
                return new ix[i];
            case 17:
                return new lb[i];
            case 18:
                return new nl[i];
            case 19:
                return new nn[i];
            default:
                return new ph[i];
        }
    }
}
