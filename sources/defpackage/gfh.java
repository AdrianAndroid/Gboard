package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gfh  reason: default package */
/* loaded from: classes.dex */
public final class gfh extends frw {
    public static final Parcelable.Creator CREATOR = new gcz(11);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public gfh(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 2, this.a);
        fyb.F(parcel, 3, this.b);
        fyb.U(parcel, 4, this.c);
        fyb.I(parcel, 5, this.d);
        fyb.S(parcel, 6, this.e);
        fyb.F(parcel, 7, this.f);
        fyb.E(parcel, C);
    }
}
