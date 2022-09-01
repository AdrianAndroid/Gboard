package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: gpm  reason: default package */
/* loaded from: classes.dex */
public final class gpm implements Iterable, Parcelable {
    public static final Parcelable.Creator CREATOR = new gcz(12);
    public final List a;
    public final List b;
    private final String c;
    private String d;
    private gpq e;

    static {
        new gpm((byte[]) null);
    }

    public gpm() {
        this((byte[]) null);
    }

    public final int a() {
        return this.a.size();
    }

    public final gpn b(int i) {
        return (gpn) this.a.get(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestId: 0 First result: ");
        sb.append(!this.a.isEmpty() ? ((gpn) this.a.get(0)).a : "EMPTY RESULT");
        sb.append(" inkhash: ");
        sb.append(this.c);
        sb.append(" numStrokes: ");
        sb.append(this.e.size());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        String str = this.d;
        if (str == null) {
            parcel.writeString("");
        } else {
            parcel.writeString(str);
        }
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        gpq gpqVar = this.e;
        if (gpqVar == null || gpqVar == gpq.a) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        this.e.writeToParcel(parcel, i);
    }

    public gpm(Parcel parcel) {
        this.d = null;
        this.e = gpq.a;
        this.c = parcel.readString();
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readTypedList(arrayList, gpn.CREATOR);
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        parcel.readTypedList(arrayList2, gpl.CREATOR);
        if (parcel.readInt() == 1) {
            this.e = new gpq(parcel);
        }
    }

    public gpm(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d = null;
        this.e = gpq.a;
        this.c = "";
        this.a = arrayList;
        this.b = arrayList2;
    }

    public gpm(String[] strArr, float[] fArr, String[][] strArr2, int[][][][] iArr) {
        this.d = null;
        this.e = gpq.a;
        this.c = "";
        this.a = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            this.a.add(new gpn(strArr[i], fArr[i]));
        }
        this.b = new ArrayList();
        if (strArr2 == null || iArr == null) {
            return;
        }
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.b.add(new gpl(strArr2[i2], iArr[i2]));
        }
    }
}
