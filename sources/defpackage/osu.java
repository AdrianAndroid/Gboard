package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osu  reason: default package */
/* loaded from: classes2.dex */
public final class osu extends oqq {
    final int a;
    final int c;
    final /* synthetic */ osz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osu(osz oszVar, int i, int i2) {
        super("OkHttp %s ping %08x%08x", oszVar.e, Integer.valueOf(i), Integer.valueOf(i2));
        this.d = oszVar;
        this.a = i;
        this.c = i2;
    }

    @Override // defpackage.oqq
    public final void b() {
        osz oszVar = this.d;
        try {
            oszVar.p.k(this.a, this.c);
        } catch (IOException unused) {
            oszVar.d();
        }
    }
}
