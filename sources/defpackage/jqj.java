package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jqj  reason: default package */
/* loaded from: classes.dex */
public abstract class jqj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(8);
    public static final jqj d;

    static {
        jqi e = e();
        e.d(true);
        e.e = null;
        d = e.a();
    }

    public static jqi e() {
        jqi jqiVar = new jqi();
        jqiVar.d(true);
        return jqiVar;
    }

    public abstract llp a();

    public abstract boolean b();

    public abstract byte[] c();

    public llp d() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        lfa T = jdg.T("");
        T.b("slices", a());
        T.h("last batch", b());
        T.h("sync metadata", c() != null);
        return T.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray((jug[]) a().toArray(new jug[0]), i);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeByteArray(c());
    }
}
