package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: opc  reason: default package */
/* loaded from: classes2.dex */
public final class opc implements Closeable, Flushable {
    public final orb a;
    int b;
    int c;
    final opu d = new opu(this);
    private int e;
    private int f;
    private int g;

    public opc(File file, long j) {
        otm otmVar = otm.a;
        this.a = orb.i(otmVar, file, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        r0 = new defpackage.our();
        r0.Y(r17);
        r0.N(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
        if (r12 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        throw new java.lang.NumberFormatException("Number too large: ".concat(r0.n()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(defpackage.out r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opc.a(out):int");
    }

    public static String b(opz opzVar) {
        return ouu.h(opzVar.e).g("MD5").d();
    }

    public static final void f(oqy oqyVar) {
        if (oqyVar != null) {
            try {
                oqyVar.b();
            } catch (IOException unused) {
            }
        }
    }

    public final void c(oqi oqiVar) {
        this.a.j(b(oqiVar.a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final synchronized void d() {
        this.f++;
    }

    public final synchronized void e(oqv oqvVar) {
        this.g++;
        if (oqvVar.a != null) {
            this.e++;
        } else if (oqvVar.b == null) {
        } else {
            this.f++;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
