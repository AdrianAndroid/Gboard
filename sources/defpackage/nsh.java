package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* renamed from: nsh  reason: default package */
/* loaded from: classes2.dex */
public final class nsh implements nsi {
    public static final nsi a = new nsh(0);
    private final /* synthetic */ int b;

    public nsh(int i) {
        this.b = i;
    }

    @Override // defpackage.nsw
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.nsj, defpackage.nsw
    public final String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
