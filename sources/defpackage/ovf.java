package defpackage;

/* compiled from: PG */
/* renamed from: ovf  reason: default package */
/* loaded from: classes2.dex */
public final class ovf implements ovp {
    final /* synthetic */ ovg a;
    private final ovr b = new ovr();

    public ovf(ovg ovgVar) {
        this.a = ovgVar;
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.b;
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ovg ovgVar = this.a;
        synchronized (ovgVar.c) {
            ovgVar.b = true;
            ovgVar.c.notifyAll();
        }
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        ovg ovgVar = this.a;
        synchronized (ovgVar.c) {
            if (!ovgVar.b) {
                while (true) {
                    Object obj = ovgVar.c;
                    if (((our) obj).b != 0) {
                        long b = ((our) obj).b(ourVar, 8192L);
                        ovgVar.c.notifyAll();
                        return b;
                    } else if (ovgVar.a) {
                        return -1L;
                    } else {
                        this.b.i(obj);
                    }
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }
}
