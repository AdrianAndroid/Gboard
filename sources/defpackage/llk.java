package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: llk  reason: default package */
/* loaded from: classes.dex */
public final class llk extends llf {
    public llk() {
        super(4);
    }

    @Override // defpackage.llf
    public final /* synthetic */ void d(Object obj) {
        super.c(obj);
    }

    public final llp g() {
        this.c = true;
        return llp.h(this.a, this.b);
    }

    public final void h(Object obj) {
        super.c(obj);
    }

    public final void i(Object... objArr) {
        super.e(objArr);
    }

    public final void j(Iterable iterable) {
        super.f(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.c(it.next());
        }
    }

    public llk(int i) {
        super(i);
    }
}
