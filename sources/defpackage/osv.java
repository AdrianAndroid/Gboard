package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osv  reason: default package */
/* loaded from: classes2.dex */
public final class osv extends oqq {
    final /* synthetic */ otf a;
    final /* synthetic */ osy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osv(osy osyVar, Object[] objArr, otf otfVar) {
        super("OkHttp %s stream %d", objArr);
        this.c = osyVar;
        this.a = otfVar;
    }

    @Override // defpackage.oqq
    public final void b() {
        try {
            this.c.c.c.d(this.a);
        } catch (IOException e) {
            otu.c.h(4, "Http2Connection.Listener failure for ".concat(String.valueOf(this.c.c.e)), e);
            try {
                this.a.j(2);
            } catch (IOException unused) {
            }
        }
    }
}
