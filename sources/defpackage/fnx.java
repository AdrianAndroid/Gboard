package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fnx  reason: default package */
/* loaded from: classes.dex */
public class fnx extends Exception {
    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fnx(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.f
            java.lang.String r1 = r4.g
            if (r1 != 0) goto L8
            java.lang.String r1 = ""
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnx.<init>(com.google.android.gms.common.api.Status):void");
    }

    public final int a() {
        return this.a.f;
    }
}
