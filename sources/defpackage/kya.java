package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kya  reason: default package */
/* loaded from: classes.dex */
public final class kya extends yd {
    final /* synthetic */ kye a;

    public kya(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        super.b(view, abjVar);
        abjVar.d(1048576);
        abjVar.k(true);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.a.d();
            return true;
        }
        return super.h(view, i, bundle);
    }
}
