package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsq  reason: default package */
/* loaded from: classes.dex */
public final class bsq implements hwu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bsq(bsn bsnVar, int i) {
        this.b = i;
        this.a = bsnVar;
    }

    public bsq(bsr bsrVar, int i) {
        this.b = i;
        this.a = bsrVar;
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void a(ibz ibzVar, ice iceVar, View view) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }

    @Override // defpackage.hwu
    public final void d(View view) {
        if (this.b == 0) {
            ((bsr) this.a).e();
            return;
        }
        hso hsoVar = ((bsn) this.a).a;
        hfd b = hfd.b();
        b.j(new iay(-10025, null, 49152L));
        hsoVar.at(b);
    }
}
