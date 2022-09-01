package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: oun  reason: default package */
/* loaded from: classes2.dex */
public final class oun implements ovn {
    final /* synthetic */ oup a;
    final /* synthetic */ ovn b;

    public oun(oup oupVar, ovn ovnVar) {
        this.a = oupVar;
        this.b = ovnVar;
    }

    @Override // defpackage.ovn
    public final /* synthetic */ ovr a() {
        return this.a;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oup oupVar = this.a;
        ovn ovnVar = this.b;
        oupVar.e();
        try {
            ovnVar.close();
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

    @Override // defpackage.ovn, java.io.Flushable
    public final void flush() {
        oup oupVar = this.a;
        ovn ovnVar = this.b;
        oupVar.e();
        try {
            ovnVar.flush();
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

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        oli.f(ourVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                ovk ovkVar = ourVar.a;
                oll.b(ovkVar);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += ovkVar.c - ovkVar.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        ovkVar = ovkVar.f;
                        oll.b(ovkVar);
                    }
                }
                oup oupVar = this.a;
                ovn ovnVar = this.b;
                oupVar.e();
                try {
                    ovnVar.ik(ourVar, j2);
                    if (oix.h(oupVar)) {
                        throw oupVar.d(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (oix.h(oupVar)) {
                        throw oupVar.d(e);
                    }
                    throw e;
                } finally {
                    oix.h(oupVar);
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        ovn ovnVar = this.b;
        return "AsyncTimeout.sink(" + ovnVar + ")";
    }
}
