package defpackage;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jed  reason: default package */
/* loaded from: classes.dex */
public final class jed extends jeo {
    public static final Parcelable.Creator CREATOR = new icc(3);
    public final int a;
    public final llw b;
    public final lmz c;

    public jed(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = llw.k(b(parcel));
        this.c = lmz.p(c(parcel));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        e(parcel, this.b);
        super.d(parcel, this.c);
    }

    public jed(jee jeeVar, SharedPreferences sharedPreferences) {
        this.a = jeeVar.a;
        lls h = llw.h();
        lmx g = lmz.g();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (jeeVar.b(key) && value != null) {
                h.a(key, value);
            }
        }
        this.b = h.l();
        this.c = g.g();
    }
}
