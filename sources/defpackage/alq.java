package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: PG */
/* renamed from: alq  reason: default package */
/* loaded from: classes.dex */
public final class alq extends wj {
    private final List a = new ArrayList(3);

    private static final void i(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.wj
    public final void e(int i) {
        try {
            for (wj wjVar : this.a) {
                wjVar.e(i);
            }
        } catch (ConcurrentModificationException e) {
            i(e);
        }
    }

    @Override // defpackage.wj
    public final void f(int i, float f, int i2) {
        try {
            for (wj wjVar : this.a) {
                wjVar.f(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            i(e);
        }
    }

    @Override // defpackage.wj
    public final void g(int i) {
        try {
            for (wj wjVar : this.a) {
                wjVar.g(i);
            }
        } catch (ConcurrentModificationException e) {
            i(e);
        }
    }

    public final void h(wj wjVar) {
        this.a.add(wjVar);
    }
}
