package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* renamed from: bub  reason: default package */
/* loaded from: classes.dex */
final class bub extends irm {
    final /* synthetic */ bud a;

    public bub(bud budVar) {
        this.a = budVar;
    }

    @Override // defpackage.irm
    public final void b(Configuration configuration, Configuration configuration2) {
        if (this.a.a != configuration.orientation) {
            bud budVar = this.a;
            if (!budVar.j()) {
                return;
            }
            budVar.f(true);
        }
    }
}
