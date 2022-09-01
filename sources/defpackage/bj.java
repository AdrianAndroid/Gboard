package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bj  reason: default package */
/* loaded from: classes.dex */
public final class bj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(3);
    ArrayList a;
    ArrayList b;
    ArrayList c;
    t[] d;
    int e;
    String f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;

    public bj() {
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeStringList(this.i);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.k);
    }

    public bj(Parcel parcel) {
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.a = parcel.createTypedArrayList(bm.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = parcel.createStringArrayList();
        this.d = (t[]) parcel.createTypedArray(t.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(v.CREATOR);
        this.i = parcel.createStringArrayList();
        this.j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.k = parcel.createTypedArrayList(bf.CREATOR);
    }
}
