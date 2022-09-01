package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: t  reason: default package */
/* loaded from: classes2.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(1);
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public t(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public t(s sVar) {
        int size = sVar.d.size();
        this.a = new int[size * 6];
        if (!sVar.j) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            bp bpVar = (bp) sVar.d.get(i);
            int i3 = i2 + 1;
            this.a[i2] = bpVar.a;
            ArrayList arrayList = this.b;
            an anVar = bpVar.b;
            arrayList.add(anVar != null ? anVar.l : null);
            int[] iArr = this.a;
            int i4 = i3 + 1;
            iArr[i3] = bpVar.c ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = bpVar.d;
            int i6 = i5 + 1;
            iArr[i5] = bpVar.e;
            int i7 = i6 + 1;
            iArr[i6] = bpVar.f;
            iArr[i7] = bpVar.g;
            this.c[i] = bpVar.h.ordinal();
            this.d[i] = bpVar.i.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.e = sVar.i;
        this.f = sVar.l;
        this.g = sVar.c;
        this.h = sVar.m;
        this.i = sVar.n;
        this.j = sVar.o;
        this.k = sVar.p;
        this.l = sVar.q;
        this.m = sVar.r;
        this.n = sVar.s;
    }
}
