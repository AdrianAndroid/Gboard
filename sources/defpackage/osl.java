package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osl  reason: default package */
/* loaded from: classes2.dex */
public final class osl extends oqq {
    final /* synthetic */ int a;
    final /* synthetic */ osz c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osl(osz oszVar, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.c = oszVar;
        this.a = i;
        this.d = i2;
    }

    @Override // defpackage.oqq
    public final void b() {
        try {
            this.c.m(this.a, this.d);
        } catch (IOException unused) {
            this.c.d();
        }
    }
}
