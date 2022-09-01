package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ph  reason: default package */
/* loaded from: classes2.dex */
public final class ph implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(20);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public ph(IntentSender intentSender, int i, int i2) {
        this.a = intentSender;
        this.b = null;
        this.c = i;
        this.d = i2;
    }

    public ph(Parcel parcel) {
        this.a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
