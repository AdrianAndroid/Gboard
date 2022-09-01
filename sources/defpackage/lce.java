package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lce  reason: default package */
/* loaded from: classes.dex */
public final class lce extends mik {
    private lcg a;
    private final int b;

    public lce(lcg lcgVar, int i) {
        this.a = lcgVar;
        this.b = i;
    }

    @Override // defpackage.mik
    protected final void a() {
        long j;
        int i;
        int a;
        lcg lcgVar = this.a;
        this.a = null;
        if (lcgVar == null) {
            return;
        }
        do {
            j = lcgVar.a.get();
            i = (int) j;
            a = lcg.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError("Refcount is: " + j);
            } else if (i == -2147483647) {
                a++;
            }
        } while (!lcgVar.a.compareAndSet(j, lcg.b(a, i - 1)));
        if (i != -2147483647) {
            return;
        }
        while (true) {
            lcf lcfVar = (lcf) lcgVar.b.get();
            if (lcfVar == null || lcfVar.a > this.b) {
                return;
            }
            lcfVar.cancel(true);
            AtomicReference atomicReference = lcgVar.b;
            while (!atomicReference.compareAndSet(lcfVar, null)) {
                if (atomicReference.get() != lcfVar) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        Object obj;
        lcg lcgVar = this.a;
        if (lcgVar == null || (obj = lcgVar.d.a) == null) {
            return null;
        }
        String str = "callable=[" + obj.toString() + "]";
        lcf lcfVar = (lcf) this.a.b.get();
        if (lcfVar == null) {
            return str;
        }
        return str + ", trial=[" + lcfVar.toString() + "]";
    }
}
