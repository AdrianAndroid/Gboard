package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iii  reason: default package */
/* loaded from: classes.dex */
public final class iii {
    public Exception a;
    public llr b;
    private int c;
    private boolean d;
    private nem e;
    private int f;
    private boolean g;
    private byte h;

    public iii() {
    }

    public iii(iij iijVar) {
        this.c = iijVar.b;
        this.d = iijVar.c;
        this.a = iijVar.d;
        this.e = iijVar.e;
        this.b = iijVar.f;
        this.f = iijVar.g;
        this.g = iijVar.h;
        this.h = (byte) 15;
    }

    public final iij a() {
        if (this.h != 15 || this.e == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.h & 1) == 0) {
                sb.append(" code");
            }
            if ((this.h & 2) == 0) {
                sb.append(" success");
            }
            if (this.e == null) {
                sb.append(" body");
            }
            if (this.b == null) {
                sb.append(" headers");
            }
            if ((this.h & 4) == 0) {
                sb.append(" totalTimeInMillis");
            }
            if ((this.h & 8) == 0) {
                sb.append(" isFromCache");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new iij(this.c, this.d, this.a, this.e, this.b, this.f, this.g);
    }

    public final void b(nem nemVar) {
        if (nemVar != null) {
            this.e = nemVar;
            return;
        }
        throw new NullPointerException("Null body");
    }

    public final void c(int i) {
        this.c = i;
        this.h = (byte) (this.h | 1);
    }

    public final void d(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 8);
    }

    public final void e(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 2);
    }

    public final void f(int i) {
        this.f = i;
        this.h = (byte) (this.h | 4);
    }

    public final void g(Map map) {
        lmh lmhVar = new lmh();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        jdg.u(comparator);
        lmhVar.b = comparator;
        for (Map.Entry entry : map.entrySet()) {
            llq.d((String) entry.getKey(), (Iterable) entry.getValue(), lmhVar);
        }
        this.b = llq.a(lmhVar);
    }
}
