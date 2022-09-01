package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a extends q {
    final ConcurrentHashMap i;
    l j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        c();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar != null) {
            this.j = null;
            this.i.h(lVar.b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}
