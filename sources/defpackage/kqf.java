package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqf  reason: default package */
/* loaded from: classes.dex */
public final class kqf implements miy {
    public final List a;
    public final Executor b;

    public kqf(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.miy
    public final /* bridge */ /* synthetic */ mko a(Object obj) {
        opu opuVar = (opu) obj;
        int i = ((lrl) this.a).c;
        ArrayList arrayList = new ArrayList(i);
        lta listIterator = ((llp) this.a).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(((kqd) listIterator.next()).c());
        }
        return mio.h(mio.h(kcu.L(((kqr) opuVar.a).c.c()), ldd.c(new kks(opuVar, ldd.c(new dke(this, arrayList, i, 4)), mjl.a, 4, null, null, null, null)), mjl.a), ldd.c(new dke(this, i, arrayList, 5)), mjl.a);
    }
}
