package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* renamed from: kfc  reason: default package */
/* loaded from: classes.dex */
public final class kfc {
    public final kbh a;
    public final boolean b;

    public kfc() {
    }

    public kfc(kbh kbhVar) {
        this.a = kbhVar;
        this.b = true;
    }

    public static kfc a(Activity activity) {
        return new kfc(new kbh(activity.getClass().getName()));
    }

    public final String b() {
        kbh kbhVar = this.a;
        if (kbhVar != null) {
            return kbhVar.a;
        }
        jez.X(null);
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kfc)) {
            return false;
        }
        kfc kfcVar = (kfc) obj;
        return b().equals(kfcVar.b()) && this.b == kfcVar.b;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        return "MeasurementKey{rawStringEventName=null, noPiiEventName=" + valueOf + ", isActivity=" + z + "}";
    }
}
