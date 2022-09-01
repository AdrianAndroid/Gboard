package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiq  reason: default package */
/* loaded from: classes.dex */
public final class aiq extends yd {
    final /* synthetic */ air a;

    public aiq(air airVar) {
        this.a = airVar;
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        this.a.e.b(view, abjVar);
        int c = this.a.d.c(view);
        ls lsVar = this.a.d.l;
        if (!(lsVar instanceof aik)) {
            return;
        }
        ((aik) lsVar).x(c);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        return this.a.e.h(view, i, bundle);
    }
}
