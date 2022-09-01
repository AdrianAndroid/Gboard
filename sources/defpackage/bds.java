package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: bds  reason: default package */
/* loaded from: classes.dex */
final class bds implements bcz {
    final /* synthetic */ bdz a;

    public bds(bdz bdzVar) {
        this.a = bdzVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.bcz
    public final void a(boolean z) {
        ArrayList arrayList;
        bgj.j();
        synchronized (this.a) {
            arrayList = new ArrayList((Collection) this.a.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bcz) arrayList.get(i)).a(z);
        }
    }
}
