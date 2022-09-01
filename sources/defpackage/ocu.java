package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: ocu  reason: default package */
/* loaded from: classes2.dex */
public final class ocu implements Closeable, nzi {
    public ocr a;
    public int b;
    public nsw c;
    public long e;
    private final ofg g;
    private final ofo h;
    private boolean j;
    private nze k;
    private int n;
    private int p = 1;
    private int i = 5;
    public nze d = new nze();
    private boolean l = false;
    private int m = -1;
    public boolean f = false;
    private volatile boolean o = false;

    public ocu(ocr ocrVar, nsw nswVar, int i, ofg ofgVar, ofo ofoVar) {
        this.a = ocrVar;
        this.c = nswVar;
        this.b = i;
        this.g = ofgVar;
        this.h = ofoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a6, code lost:
        if (r7.f == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ac, code lost:
        if (c() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ae, code lost:
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r3 <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        r7.a.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
        if (r7.p != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        r7.g.c(r3);
        r7.n += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        r3 = r7.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        if (r3 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
        if (r4 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
        r3 = r7.k.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
        if ((r3 & 254) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
        if (1 == (r3 & 1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010f, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
        r7.j = r3;
        r3 = r7.k;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r7.i = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        if (r3 < 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
        if (r3 > r7.b) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
        r7.m++;
        r7.g.g();
        r3 = r7.h;
        r3.g.a();
        r3.h = r3.a.a();
        r7.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
        throw defpackage.nvu.i.f(java.lang.String.format(java.util.Locale.US, "gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r7.b), java.lang.Integer.valueOf(r7.i))).h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0189, code lost:
        throw defpackage.nvu.k.f("gRPC frame header malformed: reserved bits not zero").h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0078, code lost:
        if (r4 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009f, code lost:
        r7.g.h();
        r7.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a8, code lost:
        if (r7.j == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00aa, code lost:
        r2 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ae, code lost:
        if (r2 == defpackage.nsh.a) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b0, code lost:
        r3 = new defpackage.oct(r2.a(defpackage.odj.b(r7.k)), r7.b, r7.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
        r7.k = null;
        r7.a.a(new defpackage.ocs(r3));
        r7.p = 1;
        r7.i = 5;
        r7.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ca, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d7, code lost:
        throw defpackage.nvu.k.f("Can't decode compressed gRPC message as compression not configured").h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d8, code lost:
        r2 = r7.g;
        r3 = r7.k.a;
        r2.i();
        r3 = defpackage.odj.b(r7.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007a, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("Invalid state: ");
        r5 = r7.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0088, code lost:
        if (r5 == 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x008a, code lost:
        if (r5 == 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x008c, code lost:
        r0 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0094, code lost:
        r4.append((java.lang.Object) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009e, code lost:
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x008f, code lost:
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0092, code lost:
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018a, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocu.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.nzi
    public final void close() {
        if (b()) {
            return;
        }
        nze nzeVar = this.k;
        boolean z = false;
        if (nzeVar != null && nzeVar.a > 0) {
            z = true;
        }
        try {
            nze nzeVar2 = this.d;
            if (nzeVar2 != null) {
                nzeVar2.close();
            }
            nze nzeVar3 = this.k;
            if (nzeVar3 != null) {
                nzeVar3.close();
            }
            this.d = null;
            this.k = null;
            this.a.e(z);
        } catch (Throwable th) {
            this.d = null;
            this.k = null;
            throw th;
        }
    }
}
