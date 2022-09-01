package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: kre  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kre implements Closeable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kre(krb krbVar, int i) {
        this.b = i;
        this.a = krbVar;
    }

    public /* synthetic */ kre(krj krjVar, int i) {
        this.b = i;
        this.a = krjVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z = true;
        if (this.b == 0) {
            ((krb) this.a).d = true;
            return;
        }
        Object obj = this.a;
        synchronized (((krj) obj).i) {
            int i = ((krj) obj).l;
            if (i <= 0) {
                z = false;
            }
            jdg.H(z, "Refcount went negative!", i);
            ((krj) obj).l--;
            ((krj) obj).d();
        }
    }
}
