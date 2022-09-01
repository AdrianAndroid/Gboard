package defpackage;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ovd  reason: default package */
/* loaded from: classes2.dex */
public final class ovd implements ovn {
    private final OutputStream a;
    private final ovr b;

    public ovd(OutputStream outputStream, ovr ovrVar) {
        oll.e(outputStream, "out");
        this.a = outputStream;
        this.b = ovrVar;
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.b;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ovn, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        oli.f(ourVar.b, 0L, j);
        while (j > 0) {
            this.b.g();
            ovk ovkVar = ourVar.a;
            oll.b(ovkVar);
            int min = (int) Math.min(j, ovkVar.c - ovkVar.b);
            this.a.write(ovkVar.a, ovkVar.b, min);
            int i = ovkVar.b + min;
            ovkVar.b = i;
            long j2 = min;
            j -= j2;
            ourVar.b -= j2;
            if (i == ovkVar.c) {
                ourVar.a = ovkVar.a();
                ovl.b(ovkVar);
            }
        }
    }

    public final String toString() {
        OutputStream outputStream = this.a;
        return "sink(" + outputStream + ")";
    }
}
