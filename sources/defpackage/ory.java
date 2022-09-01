package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ory  reason: default package */
/* loaded from: classes2.dex */
final class ory extends orw {
    final /* synthetic */ osc e;
    private final opz f;
    private long g = -1;
    private boolean h = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ory(osc oscVar, opz opzVar) {
        super(oscVar);
        this.e = oscVar;
        this.f = opzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
        r0.b -= r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012d, code lost:
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
        r1.g = r4;
        r0 = r1.e.c.p().trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
        if (r1.g < 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
        if (r0.isEmpty() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0151, code lost:
        if (r0.startsWith(";") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0159, code lost:
        if (r1.g != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015b, code lost:
        r1.h = false;
        r0 = r1.e;
        defpackage.orq.g(r0.a.j, r1.f, r0.h());
        r1.c(true, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
        if (r1.h == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019c, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
        throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + r1.g + r0 + "\"");
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108 A[Catch: NumberFormatException -> 0x01c8, TryCatch #0 {NumberFormatException -> 0x01c8, blocks: (B:27:0x004c, B:100:0x006c, B:101:0x008a, B:41:0x008b, B:44:0x0098, B:46:0x00a5, B:49:0x00ab, B:51:0x00c0, B:53:0x00ca, B:55:0x00d9, B:56:0x00f3, B:59:0x00b4, B:63:0x00bd, B:94:0x00f8, B:95:0x0105, B:68:0x0108, B:70:0x0116, B:75:0x0127, B:92:0x0112), top: B:26:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112 A[Catch: NumberFormatException -> 0x01c8, TryCatch #0 {NumberFormatException -> 0x01c8, blocks: (B:27:0x004c, B:100:0x006c, B:101:0x008a, B:41:0x008b, B:44:0x0098, B:46:0x00a5, B:49:0x00ab, B:51:0x00c0, B:53:0x00ca, B:55:0x00d9, B:56:0x00f3, B:59:0x00b4, B:63:0x00bd, B:94:0x00f8, B:95:0x0105, B:68:0x0108, B:70:0x0116, B:75:0x0127, B:92:0x0112), top: B:26:0x004c }] */
    @Override // defpackage.orw, defpackage.ovp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.our r22, long r23) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ory.b(our, long):long");
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.h && !oqs.C(this, TimeUnit.MILLISECONDS)) {
            c(false, null);
        }
        this.b = true;
    }
}
