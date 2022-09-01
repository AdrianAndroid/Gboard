package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: odd  reason: default package */
/* loaded from: classes2.dex */
public final class odd extends nuc {
    public final ntv b;
    private ntz c;

    public odd(ntv ntvVar) {
        this.b = ntvVar;
    }

    @Override // defpackage.nuc
    public final void a(nvu nvuVar) {
        ntz ntzVar = this.c;
        if (ntzVar != null) {
            ntzVar.d();
            this.c = null;
        }
        this.b.d(nsl.TRANSIENT_FAILURE, new odb(ntw.b(nvuVar)));
    }

    @Override // defpackage.nuc
    public final void b(nty ntyVar) {
        List list = ntyVar.a;
        ntz ntzVar = this.c;
        if (ntzVar == null) {
            ntv ntvVar = this.b;
            jdg.w(!list.isEmpty(), "addrs is empty");
            ntz b = ntvVar.b(nxo.p(Collections.unmodifiableList(new ArrayList(list)), nry.a, (Object[][]) Array.newInstance(Object.class, 0, 2)));
            b.e(new oio(this, b, 1));
            this.c = b;
            this.b.d(nsl.CONNECTING, new odb(ntw.c(b)));
            b.c();
            return;
        }
        ntzVar.f(list);
    }

    @Override // defpackage.nuc
    public final void c() {
        ntz ntzVar = this.c;
        if (ntzVar != null) {
            ntzVar.d();
        }
    }
}
