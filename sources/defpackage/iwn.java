package defpackage;

/* compiled from: PG */
/* renamed from: iwn  reason: default package */
/* loaded from: classes.dex */
public final class iwn implements ixh {
    private final iph a;
    private final Class b;
    private final ngz c;
    private final lmz d;

    public iwn(iph iphVar, Class cls, ngz ngzVar, lmz lmzVar) {
        this.a = iphVar;
        this.b = cls;
        this.c = ngzVar;
        this.d = lmzVar;
    }

    @Override // defpackage.ixh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gvt.a(this.a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        ipb ipbVar = (ipb) this.a.next();
        byte[] bArr = ipbVar.d;
        if (bArr == null) {
            ngz ngzVar = ipbVar.c;
            if (ngzVar == null) {
                throw new IllegalArgumentException("DataItem#protoBytes() and DataItem#message() should not be null at the same time.");
            }
            bArr = ngzVar.q();
        }
        byte[] bArr2 = bArr;
        long a = ipbVar.b.a("_timestamp_", 0L);
        long a2 = ipbVar.b.a("_session_id", 0L);
        Class cls = this.b;
        ngz ngzVar2 = this.c;
        boe j = ipt.j();
        j.B(ipbVar.b, this.d);
        return ixg.a(a, a2, cls, ngzVar2, bArr2, j.A());
    }
}
