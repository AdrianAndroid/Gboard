package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ove  reason: default package */
/* loaded from: classes2.dex */
public final class ove implements ovn {
    final /* synthetic */ ovg a;
    private final ovr b = new ovr();

    public ove(ovg ovgVar) {
        this.a = ovgVar;
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.b;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ovg ovgVar = this.a;
        synchronized (ovgVar.c) {
            if (!ovgVar.a) {
                if (ovgVar.b && ((our) ovgVar.c).b > 0) {
                    throw new IOException("source is closed");
                }
                ovgVar.a = true;
                ovgVar.c.notifyAll();
            }
        }
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        ovg ovgVar = this.a;
        synchronized (ovgVar.c) {
            if (ovgVar.a) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                if (!ovgVar.b) {
                    Object obj = ovgVar.c;
                    long j2 = 8192 - ((our) obj).b;
                    if (j2 == 0) {
                        this.b.i(obj);
                    } else {
                        long min = Math.min(j2, j);
                        ((our) ovgVar.c).ik(ourVar, min);
                        j -= min;
                        ovgVar.c.notifyAll();
                    }
                } else {
                    throw new IOException("source is closed");
                }
            }
        }
    }

    @Override // defpackage.ovn, java.io.Flushable
    public final void flush() {
        ovg ovgVar = this.a;
        synchronized (ovgVar.c) {
            if (!ovgVar.a) {
                if (ovgVar.b && ((our) ovgVar.c).b > 0) {
                    throw new IOException("source is closed");
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }
}
