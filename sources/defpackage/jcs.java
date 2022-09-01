package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* renamed from: jcs  reason: default package */
/* loaded from: classes.dex */
final class jcs extends irm {
    final /* synthetic */ jct a;

    public jcs(jct jctVar) {
        this.a = jctVar;
    }

    @Override // defpackage.irm
    public final void b(Configuration configuration, Configuration configuration2) {
        if (!(this.a.i == configuration.orientation && this.a.j == configuration.uiMode) && this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
