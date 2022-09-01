package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: bcx  reason: default package */
/* loaded from: classes.dex */
final class bcx implements bdi {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.bdi
    public final void a(bdj bdjVar) {
        this.a.add(bdjVar);
        if (this.c) {
            bdjVar.m();
        } else if (this.b) {
            bdjVar.n();
        } else {
            bdjVar.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c = true;
        for (bdj bdjVar : bgj.h(this.a)) {
            bdjVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = true;
        for (bdj bdjVar : bgj.h(this.a)) {
            bdjVar.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b = false;
        for (bdj bdjVar : bgj.h(this.a)) {
            bdjVar.o();
        }
    }

    @Override // defpackage.bdi
    public final void e(bdj bdjVar) {
        this.a.remove(bdjVar);
    }
}
