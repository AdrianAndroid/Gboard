package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bm  reason: default package */
/* loaded from: classes.dex */
public final class bm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(4);
    final String a;
    final String b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final boolean i;
    final Bundle j;
    final boolean k;
    final int l;
    Bundle m;

    public bm(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }

    public bm(an anVar) {
        this.a = anVar.getClass().getName();
        this.b = anVar.l;
        this.c = anVar.u;
        this.d = anVar.D;
        this.e = anVar.E;
        this.f = anVar.F;
        this.g = anVar.I;
        this.h = anVar.s;
        this.i = anVar.H;
        this.j = anVar.m;
        this.k = anVar.G;
        this.l = anVar.W.ordinal();
    }
}
