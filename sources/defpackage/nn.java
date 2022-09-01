package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* renamed from: nn  reason: default package */
/* loaded from: classes2.dex */
public final class nn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(19);
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;

    public nn() {
    }

    public nn(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        int readInt = parcel.readInt();
        this.c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.d = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z = false;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.j = parcel.readInt() == 1 ? true : z;
        this.g = parcel.readArrayList(nl.class.getClassLoader());
    }

    public nn(nn nnVar) {
        this.c = nnVar.c;
        this.a = nnVar.a;
        this.b = nnVar.b;
        this.d = nnVar.d;
        this.e = nnVar.e;
        this.f = nnVar.f;
        this.h = nnVar.h;
        this.i = nnVar.i;
        this.j = nnVar.j;
        this.g = nnVar.g;
    }

    public final void a() {
        this.d = null;
        this.c = 0;
        this.a = -1;
        this.b = -1;
    }

    public final void b() {
        this.d = null;
        this.c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.g);
    }
}
