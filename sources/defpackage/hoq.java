package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: hoq  reason: default package */
/* loaded from: classes.dex */
final class hoq extends hsh {
    final /* synthetic */ hor a;

    public hoq(hor horVar) {
        this.a = horVar;
    }

    @Override // defpackage.hsh
    public final void a(String str, Bundle bundle) {
        hor horVar = this.a;
        hfy hfyVar = horVar.c;
        if (hfyVar == null || !"SMART_COMPOSE_ACTION".equals(str)) {
            return;
        }
        Object obj = bundle.get("smart_compose_status");
        boolean z = true;
        if ("Show".equals(obj)) {
            horVar.a.e(hoj.APP_SMART_COMPOSE, horVar.f, 1);
        } else {
            if ("Hide_Accept".equals(obj)) {
                if (SystemClock.elapsedRealtime() - horVar.g < ((Long) hof.u.c()).longValue()) {
                    horVar.a.e(hoj.APP_SMART_COMPOSE, horVar.f, 2);
                }
            } else if ("Hide_Dismiss".equals(obj)) {
                horVar.a.e(hoj.APP_SMART_COMPOSE, horVar.f, 3);
            }
            z = false;
        }
        hfyVar.z(hfd.d(new iay(-500000, null, Boolean.valueOf(z))));
    }
}
