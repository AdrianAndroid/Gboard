package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: be  reason: default package */
/* loaded from: classes.dex */
public final class be extends pi {
    @Override // defpackage.pi
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        return new pd(i, intent);
    }

    @Override // defpackage.pi
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        Bundle bundleExtra;
        ph phVar = (ph) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = phVar.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                phVar = new ph(phVar.a, phVar.c, phVar.d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", phVar);
        if (bi.S(2)) {
            new StringBuilder("CreateIntent created the following intent: ").append(intent);
        }
        return intent;
    }
}
