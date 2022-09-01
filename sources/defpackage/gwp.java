package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: gwp  reason: default package */
/* loaded from: classes.dex */
public final class gwp implements gwl {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/cache/ParcelableSerializer");
    private final Parcelable.Creator b;

    public gwp(Parcelable.Creator creator) {
        this.b = creator;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    @Override // defpackage.gwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.io.InputStream r10) {
        /*
            r9 = this;
            r0 = 0
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L2e
            nem r10 = defpackage.nem.x(r10)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            byte[] r10 = r10.D()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            int r2 = r10.length     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r3 = 0
            r1.unmarshall(r10, r3, r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r1.setDataPosition(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            android.os.Parcelable$Creator r10 = r9.b     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.Object r10 = r10.createFromParcel(r1)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            android.os.Parcelable r10 = (android.os.Parcelable) r10     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r1 == 0) goto L23
            r1.recycle()
            return r10
        L23:
            r0 = r10
            goto L46
        L25:
            r10 = move-exception
            r0 = r1
            goto L4f
        L28:
            r10 = move-exception
            r7 = r10
            r10 = r1
            goto L31
        L2c:
            r10 = move-exception
            goto L4f
        L2e:
            r10 = move-exception
            r7 = r10
            r10 = r0
        L31:
            ltg r1 = defpackage.gwp.a     // Catch: java.lang.Throwable -> L4b
            ltv r1 = r1.c()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "Error while reading parcel."
            java.lang.String r3 = "com/google/android/libraries/inputmethod/cache/ParcelableSerializer"
            java.lang.String r4 = "deserialize"
            r5 = 46
            java.lang.String r6 = "ParcelableSerializer.java"
            defpackage.f.h(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L47
        L46:
            return r0
        L47:
            r10.recycle()
            return r0
        L4b:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L4f:
            if (r0 == 0) goto L54
            r0.recycle()
        L54:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwp.a(java.io.InputStream):java.lang.Object");
    }

    @Override // defpackage.gwl
    public final /* bridge */ /* synthetic */ void b(OutputStream outputStream, Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            outputStream.write(obtain.marshall());
        } finally {
            obtain.recycle();
        }
    }
}
