package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gpn  reason: default package */
/* loaded from: classes.dex */
public final class gpn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gcz(16);
    public final String a;
    public final float b;
    public final List c;

    public gpn(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        parcel.readStringList(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeStringList(this.c);
    }

    public gpn(String str, float f) {
        ArrayList arrayList = new ArrayList(0);
        this.a = str;
        this.b = f;
        this.c = arrayList;
    }
}
