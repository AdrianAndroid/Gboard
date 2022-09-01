package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: awh  reason: default package */
/* loaded from: classes.dex */
final class awh implements awk, avi {
    private final List a;
    private final awl b;
    private final awj c;
    private int d = -1;
    private auw e;
    private List f;
    private int g;
    private File h;
    private volatile fws i;

    public awh(List list, awl awlVar, awj awjVar) {
        this.a = list;
        this.b = awlVar;
        this.c = awjVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avj, java.lang.Object] */
    @Override // defpackage.awk
    public final void a() {
        fws fwsVar = this.i;
        if (fwsVar != null) {
            fwsVar.a.fh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [avj, java.lang.Object] */
    @Override // defpackage.avi
    public final void b(Object obj) {
        this.c.e(this.e, obj, this.i.a, 3, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (d() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = r7.f;
        r3 = r7.g;
        r7.g = r3 + 1;
        r3 = r7.h;
        r4 = r7.b;
        r7.i = ((defpackage.azn) r0.get(r3)).b(r3, r4.e, r4.f, r4.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r7.i == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r7.b.h(r7.i.a.a()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        r7.i.a.f(r7.b.n, r7);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        r7.i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v20, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [avj, java.lang.Object] */
    @Override // defpackage.awk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r7 = this;
        L0:
            java.util.List r0 = r7.f     // Catch: java.lang.Throwable -> L93
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L58
            boolean r0 = r7.d()     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto Ld
            goto L58
        Ld:
            r0 = 0
            r7.i = r0     // Catch: java.lang.Throwable -> L93
        L10:
            if (r1 != 0) goto L57
            boolean r0 = r7.d()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L57
            java.util.List r0 = r7.f     // Catch: java.lang.Throwable -> L93
            int r3 = r7.g     // Catch: java.lang.Throwable -> L93
            int r4 = r3 + 1
            r7.g = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L93
            azn r0 = (defpackage.azn) r0     // Catch: java.lang.Throwable -> L93
            java.io.File r3 = r7.h     // Catch: java.lang.Throwable -> L93
            awl r4 = r7.b     // Catch: java.lang.Throwable -> L93
            int r5 = r4.e     // Catch: java.lang.Throwable -> L93
            int r6 = r4.f     // Catch: java.lang.Throwable -> L93
            ava r4 = r4.h     // Catch: java.lang.Throwable -> L93
            fws r0 = r0.b(r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L93
            r7.i = r0     // Catch: java.lang.Throwable -> L93
            fws r0 = r7.i     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L10
            awl r0 = r7.b     // Catch: java.lang.Throwable -> L93
            fws r3 = r7.i     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> L93
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L93
            boolean r0 = r0.h(r3)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L10
            fws r0 = r7.i     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L93
            awl r1 = r7.b     // Catch: java.lang.Throwable -> L93
            atk r1 = r1.n     // Catch: java.lang.Throwable -> L93
            r0.f(r1, r7)     // Catch: java.lang.Throwable -> L93
            r1 = 1
            goto L10
        L57:
            return r1
        L58:
            int r0 = r7.d     // Catch: java.lang.Throwable -> L93
            int r0 = r0 + r2
            r7.d = r0     // Catch: java.lang.Throwable -> L93
            java.util.List r2 = r7.a     // Catch: java.lang.Throwable -> L93
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L93
            if (r0 < r2) goto L66
            return r1
        L66:
            java.util.List r0 = r7.a     // Catch: java.lang.Throwable -> L93
            int r2 = r7.d     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L93
            auw r0 = (defpackage.auw) r0     // Catch: java.lang.Throwable -> L93
            awi r2 = new awi     // Catch: java.lang.Throwable -> L93
            awl r3 = r7.b     // Catch: java.lang.Throwable -> L93
            auw r4 = r3.m     // Catch: java.lang.Throwable -> L93
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L93
            aye r3 = r3.d()     // Catch: java.lang.Throwable -> L93
            java.io.File r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L93
            r7.h = r2     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L0
            r7.e = r0     // Catch: java.lang.Throwable -> L93
            awl r0 = r7.b     // Catch: java.lang.Throwable -> L93
            java.util.List r0 = r0.g(r2)     // Catch: java.lang.Throwable -> L93
            r7.f = r0     // Catch: java.lang.Throwable -> L93
            r7.g = r1     // Catch: java.lang.Throwable -> L93
            goto L0
        L93:
            r0 = move-exception
            goto L96
        L95:
            throw r0
        L96:
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awh.c():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [avj, java.lang.Object] */
    @Override // defpackage.avi
    public final void e(Exception exc) {
        this.c.d(this.e, exc, this.i.a, 3);
    }
}
