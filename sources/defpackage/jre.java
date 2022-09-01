package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jre  reason: default package */
/* loaded from: classes.dex */
public abstract class jre implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(10);
    private static final Comparator a = jpf.e;

    public static jre h(Collection collection, Collection collection2, byte[] bArr, byte[] bArr2, boolean z) {
        Comparator comparator = a;
        llp z2 = llp.z(comparator, collection);
        llp z3 = llp.z(comparator, collection2);
        final llk e = llp.e();
        final llk e2 = llp.e();
        jtq.p(z2, z3, new jtp() { // from class: jrd
            @Override // defpackage.jtp
            public final void a(Object obj, int i) {
                llk llkVar = llk.this;
                llk llkVar2 = e2;
                juc jucVar = (juc) obj;
                if (i == 1) {
                    llkVar.h(jucVar);
                } else {
                    llkVar2.h(jucVar);
                }
            }
        }, comparator);
        llp g = e.g();
        llp g2 = e2.g();
        return i(z2, z3, g, g2, !g.isEmpty() || !g2.isEmpty() || !Arrays.equals(bArr, bArr2), z, bArr2);
    }

    public static jre i(llp llpVar, llp llpVar2, llp llpVar3, llp llpVar4, boolean z, boolean z2, byte[] bArr) {
        return new jpe(llpVar, llpVar2, llpVar3, llpVar4, z, z2, bArr);
    }

    public static llp j(Parcelable[] parcelableArr) {
        if (parcelableArr == null) {
            return llp.q();
        }
        llk e = llp.e();
        for (Parcelable parcelable : parcelableArr) {
            e.h((juc) parcelable);
        }
        return e.g();
    }

    public static jre k(Collection collection, Collection collection2) {
        return h(collection, collection2, null, null, true);
    }

    public static final String l(List list) {
        return jtq.h(list, new jky(10));
    }

    public abstract llp a();

    public abstract llp b();

    public abstract llp c();

    public abstract llp d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract byte[] g();

    public String toString() {
        lfa T = jdg.T("");
        T.b("old", c());
        T.b("new", b());
        T.h("metadata", g() != null);
        T.h("last batch", f());
        return T.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray((juc[]) c().toArray(new juc[0]), i);
        parcel.writeParcelableArray((juc[]) b().toArray(new juc[0]), i);
        parcel.writeParcelableArray((juc[]) a().toArray(new juc[0]), i);
        parcel.writeParcelableArray((juc[]) d().toArray(new juc[0]), i);
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeByteArray(g());
    }
}
