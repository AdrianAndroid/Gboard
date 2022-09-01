package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: bec  reason: default package */
/* loaded from: classes.dex */
public final class bec implements bdj {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.bdj
    public final void m() {
        for (bfh bfhVar : bgj.h(this.a)) {
            bfhVar.m();
        }
    }

    @Override // defpackage.bdj
    public final void n() {
        for (bfh bfhVar : bgj.h(this.a)) {
            bfhVar.n();
        }
    }

    @Override // defpackage.bdj
    public final void o() {
        for (bfh bfhVar : bgj.h(this.a)) {
            bfhVar.o();
        }
    }
}
