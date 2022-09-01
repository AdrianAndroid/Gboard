package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jsv  reason: default package */
/* loaded from: classes.dex */
public abstract class jsv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(12);

    public static jsu j() {
        jsu jsuVar = new jsu();
        jsuVar.b = null;
        jsuVar.d(0);
        jsuVar.c(0);
        jsuVar.f(0);
        jsuVar.b(0);
        jsuVar.g(0);
        jsuVar.e(jsq.a);
        return jsuVar;
    }

    public static jsv k(String str) {
        return new jrj(str, null, 0, 0, 0, 0, 0, llp.q(), jsq.a);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract int e();

    public abstract jsq f();

    public abstract llp g();

    public abstract String h();

    public abstract String i();

    public String toString() {
        lfa T = jdg.T("");
        T.d();
        T.b("url", i());
        T.b("const", jtq.b(c(), b(), d(), a()));
        T.b("flags", jtq.m(e()));
        T.b("scheme", h());
        T.b("val", g());
        T.f("extras", f().d().size());
        return T.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(i());
        parcel.writeString(h());
        parcel.writeInt(c());
        parcel.writeInt(b());
        parcel.writeInt(d());
        parcel.writeInt(a());
        parcel.writeInt(e());
        parcel.writeStringList(g());
    }
}
