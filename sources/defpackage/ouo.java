package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ouo  reason: default package */
/* loaded from: classes2.dex */
public final class ouo implements ovp {
    final /* synthetic */ oup a;
    final /* synthetic */ ovp b;

    public ouo(oup oupVar, ovp ovpVar) {
        this.a = oupVar;
        this.b = ovpVar;
    }

    @Override // defpackage.ovp
    public final /* synthetic */ ovr a() {
        return this.a;
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        oup oupVar = this.a;
        ovp ovpVar = this.b;
        oupVar.e();
        try {
            long b = ovpVar.b(ourVar, j);
            if (oix.h(oupVar)) {
                throw oupVar.d(null);
            }
            return b;
        } catch (IOException e) {
            if (oix.h(oupVar)) {
                throw oupVar.d(e);
            }
            throw e;
        } finally {
            oix.h(oupVar);
        }
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oup oupVar = this.a;
        ovp ovpVar = this.b;
        oupVar.e();
        try {
            ovpVar.close();
            if (oix.h(oupVar)) {
                throw oupVar.d(null);
            }
        } catch (IOException e) {
            if (oix.h(oupVar)) {
                throw oupVar.d(e);
            }
        } finally {
            oix.h(oupVar);
        }
    }

    public final String toString() {
        ovp ovpVar = this.b;
        return "AsyncTimeout.source(" + ovpVar + ")";
    }
}
