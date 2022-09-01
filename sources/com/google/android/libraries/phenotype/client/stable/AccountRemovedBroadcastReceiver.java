package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("accountType");
        if (!"com.google".equals(stringExtra) && !"com.google.work".equals(stringExtra) && !"cn.google".equals(stringExtra) && !"__logged_out_type".equals(stringExtra)) {
            return;
        }
        String string = intent.getExtras().getString("authAccount");
        kjj b = kjj.b(context);
        kcu.X(mhu.g(mio.h(mkh.q(kko.b(b).b(new kdw(string, 4), b.e())), new jmg(b, string, 5), b.e()), IOException.class, jky.q, mjl.a), b.e().hP(new kht(context, string, 2))).a(new jiz(goAsync(), 6), mjl.a);
    }
}
