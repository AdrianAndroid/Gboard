package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osm  reason: default package */
/* loaded from: classes2.dex */
public final class osm extends oqq {
    final /* synthetic */ int a;
    final /* synthetic */ long c;
    final /* synthetic */ osz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osm(osz oszVar, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.d = oszVar;
        this.a = i;
        this.c = j;
    }

    @Override // defpackage.oqq
    public final void b() {
        try {
            this.d.p.g(this.a, this.c);
        } catch (IOException unused) {
            this.d.d();
        }
    }
}
