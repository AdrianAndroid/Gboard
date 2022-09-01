package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: ksz  reason: default package */
/* loaded from: classes.dex */
final class ksz extends ksu {
    final /* synthetic */ ktb a;

    public ksz(ktb ktbVar) {
        this.a = ktbVar;
    }

    @Override // defpackage.ksu
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // defpackage.ksu
    public final void c(View view) {
    }
}
