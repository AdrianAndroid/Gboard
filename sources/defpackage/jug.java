package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: jug  reason: default package */
/* loaded from: classes.dex */
public abstract class jug implements Parcelable {
    public static final Parcelable.Creator CREATOR = new icc(15);

    public static juf g() {
        juf jufVar = new juf();
        jufVar.g(0);
        jufVar.d(0);
        jufVar.c(0);
        jufVar.e(0);
        jufVar.b(0);
        return jufVar;
    }

    public static jug h(juc jucVar) {
        juf g = g();
        g.f(jucVar);
        return g.a();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract int e();

    public abstract juc f();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(boolean r5, boolean r6) {
        /*
            r4 = this;
            juc r0 = r4.f()
            jsr r0 = r0.o()
            if (r5 == 0) goto Lf
            java.lang.String r5 = r0.g(r6)
            goto L1a
        Lf:
            if (r6 == 0) goto L16
            java.lang.String r5 = r0.toString()
            goto L1a
        L16:
            jrh r0 = (defpackage.jrh) r0
            java.lang.String r5 = r0.b
        L1a:
            int r6 = r4.c()
            int r0 = r4.b()
            int r1 = r4.d()
            int r2 = r4.a()
            r3 = 0
            if (r6 != 0) goto L3a
            r6 = 0
            if (r0 != 0) goto L3a
            if (r1 != 0) goto L39
            if (r2 == 0) goto L37
            r0 = 0
            r1 = 0
            goto L3a
        L37:
            r6 = r3
            goto L3e
        L39:
            r0 = 0
        L3a:
            java.lang.String r6 = defpackage.jtq.b(r6, r0, r1, r2)
        L3e:
            int r0 = r4.e()
            if (r0 == 0) goto L48
            java.lang.String r3 = defpackage.jtq.m(r0)
        L48:
            if (r6 != 0) goto L4e
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            return r5
        L4e:
            java.lang.String r0 = "{"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = ", "
            if (r6 == 0) goto L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
        L6e:
            if (r3 == 0) goto L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r5 = r6.toString()
        L82:
            java.lang.String r6 = "}"
            java.lang.String r5 = r5.concat(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jug.i(boolean, boolean):java.lang.String");
    }

    public String toString() {
        return i(false, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(f(), i);
        parcel.writeInt(c());
        parcel.writeInt(b());
        parcel.writeInt(d());
        parcel.writeInt(a());
        parcel.writeInt(e());
    }
}
