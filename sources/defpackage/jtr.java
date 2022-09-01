package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jtr  reason: default package */
/* loaded from: classes.dex */
public abstract class jtr implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(13);

    public static jtr c(String str, int i) {
        jtq.s("version", i);
        return new jrn(str, i);
    }

    public abstract int a();

    public abstract String b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jtr jtrVar = (jtr) obj;
        if (!b().equals(jtrVar.b())) {
            return b().compareTo(jtrVar.b());
        }
        int a = a();
        int a2 = jtrVar.a();
        if (a == a2) {
            return 0;
        }
        return a < a2 ? -1 : 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        String b = b();
        int a = a();
        return b + "." + a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeInt(a());
    }
}
