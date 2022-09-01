package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jqm  reason: default package */
/* loaded from: classes.dex */
public abstract class jqm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(9);

    public static jql f() {
        jql jqlVar = new jql();
        jqlVar.e(0);
        jqlVar.c(llp.q());
        return jqlVar;
    }

    public abstract int a();

    public abstract llw b();

    public abstract String c();

    public jsq d() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public jtr e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqm)) {
            return false;
        }
        jqm jqmVar = (jqm) obj;
        jtr e = e();
        if (e != null) {
            return e.equals(jqmVar.e());
        }
        return jqmVar.e() == null;
    }

    public final juc g(jsr jsrVar) {
        return h(((jrh) jsrVar).b);
    }

    public final juc h(String str) {
        juc jucVar = (juc) b().get(str);
        if (jucVar != null) {
            return jucVar;
        }
        juc jucVar2 = (juc) b().get(juc.q(str));
        if (jucVar2 != null) {
            jub f = jucVar2.f();
            f.l(str);
            return f.a();
        }
        String obj = toString();
        throw new IllegalArgumentException("Pack " + str + " is not part of manifest " + obj);
    }

    public final int hashCode() {
        jtr e = e();
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    public final Collection i() {
        return b().values();
    }

    public final Set j() {
        return b().keySet();
    }

    public String toString() {
        return e().toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeInt(a());
        parcel.writeParcelableArray((juc[]) i().toArray(new juc[0]), i);
    }
}
