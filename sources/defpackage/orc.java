package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: orc  reason: default package */
/* loaded from: classes2.dex */
class orc extends ouv {
    private boolean a;

    public orc(ovn ovnVar) {
        super(ovnVar);
    }

    protected void c() {
    }

    @Override // defpackage.ouv, defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.a = true;
            c();
        }
    }

    @Override // defpackage.ouv, defpackage.ovn, java.io.Flushable
    public final void flush() {
        if (this.a) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.a = true;
            c();
        }
    }

    @Override // defpackage.ouv, defpackage.ovn
    public final void ik(our ourVar, long j) {
        if (this.a) {
            ourVar.B(j);
            return;
        }
        try {
            super.ik(ourVar, j);
        } catch (IOException unused) {
            this.a = true;
            c();
        }
    }
}
