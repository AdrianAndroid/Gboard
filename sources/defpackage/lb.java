package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: lb  reason: default package */
/* loaded from: classes.dex */
public final class lb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(17);
    public int a;
    public int b;
    public boolean c;

    public lb() {
    }

    public lb(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public lb(lb lbVar) {
        this.a = lbVar.a;
        this.b = lbVar.b;
        this.c = lbVar.c;
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
