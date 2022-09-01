package defpackage;

/* compiled from: PG */
/* renamed from: nxs  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxs implements odg {
    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        if (f() >= i) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.odg
    public void b() {
    }

    @Override // defpackage.odg
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.odg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.odg
    public boolean d() {
        return false;
    }
}
