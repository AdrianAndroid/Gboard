package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* renamed from: juc  reason: default package */
/* loaded from: classes.dex */
public abstract class juc implements Parcelable {
    public static final llp o;
    public static final lwm q;
    public static final Date p = new Date(Long.MAX_VALUE);
    public static final Parcelable.Creator CREATOR = new icc(14);

    static {
        lwm lwmVar = new lwm();
        q = lwmVar;
        o = llp.r(lwmVar);
    }

    public static jub p() {
        jub jubVar = new jub();
        jubVar.n(0L);
        jubVar.h(0L);
        jubVar.k(0);
        jubVar.i(0);
        jubVar.o(true);
        jubVar.j(p);
        return jubVar;
    }

    public static String q(String str) {
        List k = lfy.e("_").k(str);
        String str2 = (String) k.get(0);
        String str3 = k.size() > 1 ? (String) k.get(1) : null;
        String str4 = (String) lfy.e("-").k(str2).get(0);
        if (str3 != null) {
            return str4 + "_" + str3;
        }
        return str4;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract jtr e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juc)) {
            return false;
        }
        juc jucVar = (juc) obj;
        if (o() != null) {
            return o().equals(jucVar.o());
        }
        return jucVar.o() == null;
    }

    public abstract jub f();

    public abstract llp g();

    public abstract llp h();

    public final int hashCode() {
        if (o() != null) {
            return o().hashCode();
        }
        return 0;
    }

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract Date l();

    public abstract boolean m();

    public jsq n() {
        throw null;
    }

    public jsr o() {
        throw null;
    }

    public final String toString() {
        return i();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(e(), i);
        parcel.writeString(j());
        parcel.writeString(i());
        parcel.writeLong(d());
        parcel.writeLong(c());
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeStringList(g());
        parcel.writeStringList(h());
        parcel.writeString(k());
        parcel.writeLong(l().getTime());
        parcel.writeString(n().b("label", null));
    }
}
