package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jep  reason: default package */
/* loaded from: classes.dex */
public final class jep extends jeo {
    public static final Parcelable.Creator CREATOR = new icc(6);
    public final Map a;

    public jep(Parcel parcel) {
        this.a = b(parcel);
    }

    public jep(Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        e(parcel, this.a);
    }
}
