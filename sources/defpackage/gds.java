package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gds  reason: default package */
/* loaded from: classes.dex */
final class gds extends fgy {
    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fnw f(Context context, Looper looper, fqs fqsVar, Object obj, fob fobVar, foc focVar) {
        gdv gdvVar = (gdv) obj;
        gdv gdvVar2 = fqsVar.f;
        Integer num = fqsVar.g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", fqsVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new gea(context, looper, fqsVar, bundle, fobVar, focVar);
    }
}
