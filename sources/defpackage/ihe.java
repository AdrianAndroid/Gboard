package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* renamed from: ihe  reason: default package */
/* loaded from: classes.dex */
final class ihe extends irm {
    final /* synthetic */ ihh a;

    public ihe(ihh ihhVar) {
        this.a = ihhVar;
    }

    @Override // defpackage.irm
    protected final void b(Configuration configuration, Configuration configuration2) {
        if (configuration2 == null || configuration.orientation != configuration2.orientation) {
            this.a.o();
        }
    }
}
