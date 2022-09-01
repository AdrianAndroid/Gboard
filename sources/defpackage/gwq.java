package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: gwq  reason: default package */
/* loaded from: classes.dex */
public final class gwq implements gwl {
    private final nfh a;

    public gwq(nfh nfhVar) {
        this.a = nfhVar;
    }

    @Override // defpackage.gwl
    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream) {
        nfh nfhVar = this.a;
        nfhVar.b = (nfm) nfhVar.b.N(4);
        nfhVar.cu(inputStream, nfb.b());
        return nfhVar.cz();
    }

    @Override // defpackage.gwl
    public final /* synthetic */ void b(OutputStream outputStream, Object obj) {
        ((nfm) obj).p(outputStream);
    }
}
