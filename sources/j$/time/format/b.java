package j$.time.format;

import java.util.Locale;

/* loaded from: classes3.dex */
final class b extends t {
    final /* synthetic */ s c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(s sVar) {
        this.c = sVar;
    }

    @Override // j$.time.format.t
    public final String b(j$.time.chrono.g gVar, j$.time.temporal.n nVar, long j, x xVar, Locale locale) {
        return this.c.a(j, xVar);
    }

    @Override // j$.time.format.t
    public final String c(j$.time.temporal.n nVar, long j, x xVar, Locale locale) {
        return this.c.a(j, xVar);
    }
}
