package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nzj  reason: default package */
/* loaded from: classes2.dex */
public final class nzj extends nzh {
    final /* synthetic */ nzn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzj(nzo nzoVar, nzn nznVar) {
        super(nzoVar.a);
        this.a = nznVar;
    }

    @Override // defpackage.nzh
    public final void a() {
        List<Runnable> list;
        nzn nznVar = this.a;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (nznVar) {
                if (nznVar.b.isEmpty()) {
                    nznVar.b = null;
                    nznVar.a = true;
                    return;
                }
                list = nznVar.b;
                nznVar.b = arrayList;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
