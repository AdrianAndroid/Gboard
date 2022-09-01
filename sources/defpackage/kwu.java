package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwu  reason: default package */
/* loaded from: classes.dex */
public final class kwu extends vj {
    final /* synthetic */ kwv a;
    final /* synthetic */ bdz b;

    public kwu(kwv kwvVar, bdz bdzVar, byte[] bArr) {
        this.a = kwvVar;
        this.b = bdzVar;
    }

    @Override // defpackage.vj
    public final void a(Typeface typeface) {
        kwv kwvVar = this.a;
        kwvVar.k = Typeface.create(typeface, kwvVar.c);
        this.a.m = true;
        this.b.i(this.a.k);
    }

    @Override // defpackage.vj
    public final void b() {
        this.a.m = true;
        this.b.j();
    }
}
