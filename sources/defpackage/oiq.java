package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oiq  reason: default package */
/* loaded from: classes2.dex */
public final class oiq extends ois {
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(oiq.class, "index");
    private final List b;
    private volatile int index;

    public oiq(List list, int i) {
        jdg.w(!list.isEmpty(), "empty list");
        this.b = list;
        this.index = i - 1;
    }

    @Override // defpackage.nua
    public final ntw a() {
        int size = this.b.size();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a;
        int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
        if (incrementAndGet >= size) {
            int i = incrementAndGet % size;
            atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i);
            incrementAndGet = i;
        }
        return ntw.c((ntz) this.b.get(incrementAndGet));
    }

    @Override // defpackage.ois
    public final boolean b(ois oisVar) {
        if (!(oisVar instanceof oiq)) {
            return false;
        }
        oiq oiqVar = (oiq) oisVar;
        return oiqVar == this || (this.b.size() == oiqVar.b.size() && new HashSet(this.b).containsAll(oiqVar.b));
    }

    public final String toString() {
        lfa R = jdg.R(oiq.class);
        R.b("list", this.b);
        return R.toString();
    }
}
