package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bf  reason: default package */
/* loaded from: classes.dex */
public final class bf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(2);
    final String a;
    final int b;

    public bf(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    public bf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
