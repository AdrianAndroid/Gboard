package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: nyj  reason: default package */
/* loaded from: classes2.dex */
final class nyj extends nsc {
    private final nyk a;

    public nyj(nyk nykVar, ofl oflVar) {
        jdg.Q(nykVar, "tracer");
        this.a = nykVar;
        jdg.Q(oflVar, "time");
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.nsc
    public final void a(int i, String str) {
        ntm ntmVar = this.a.c;
        Level c = c(i);
        if (nyk.a.isLoggable(c)) {
            nyk.a(ntmVar, c, str);
        }
        d(i);
    }

    @Override // defpackage.nsc
    public final void b(int i, String str, Object... objArr) {
        Level c = c(i);
        d(i);
        a(i, nyk.a.isLoggable(c) ? MessageFormat.format(str, objArr) : null);
    }
}
