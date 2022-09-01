package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* renamed from: ksy  reason: default package */
/* loaded from: classes.dex */
final class ksy extends yd {
    final /* synthetic */ ktb a;

    public ksy(ktb ktbVar) {
        this.a = ktbVar;
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        super.b(view, abjVar);
        if (this.a.c) {
            abjVar.d(1048576);
            abjVar.k(true);
            return;
        }
        abjVar.k(false);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ktb ktbVar = this.a;
            if (ktbVar.c) {
                ktbVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.h(view, i, bundle);
    }
}
