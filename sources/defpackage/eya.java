package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: eya  reason: default package */
/* loaded from: classes.dex */
public final class eya implements fwh {
    private final Iterator a;
    private final /* synthetic */ int b;

    public eya(Iterator it, int i) {
        this.b = i;
        this.a = it;
    }

    @Override // defpackage.fwh
    public final void c(int i) {
    }

    @Override // defpackage.fwh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fwh
    public final void b(fwg fwgVar) {
        if (this.b != 0) {
            if (!this.a.hasNext()) {
                fwgVar.b(null, null);
            } else {
                fwgVar.b(((oxo) this.a.next()).q(), null);
            }
        } else if (!this.a.hasNext()) {
            fwgVar.b(null, null);
        } else {
            fwgVar.b(((oxu) this.a.next()).q(), null);
        }
    }
}
