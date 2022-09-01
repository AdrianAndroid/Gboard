package com.google.android.libraries.inputmethod.featuresplit.debugactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FeatureSplitDebugActivity extends gut {
    private final oja k = oix.a(new hgp(this, 2));
    private final hgo s = new hgo(this);
    private final oja l = oix.a(new hgp(this, 0));
    private final oja p = oix.a(new hgp(this, 1));
    private final oja q = oix.a(new hgp(this, 3));
    private final oja r = oix.a(new hgp(this, 4));

    private final Button y() {
        Object a = this.r.a();
        oll.d(a, "<get-startButton>(...)");
        return (Button) a;
    }

    public final TextView m() {
        Object a = this.l.a();
        oll.d(a, "<get-logArea>(...)");
        return (TextView) a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TextView m = m();
        m.append("onActivityResult: " + i2 + "\n");
    }

    @Override // defpackage.gut, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f134600_resource_name_obfuscated_res_0x7f0e00ad);
        q().e(this.s);
        y().setOnClickListener(new fat(this, 16));
        r();
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    protected final void onDestroy() {
        q().f(this.s);
        super.onDestroy();
    }

    public final hgj p() {
        return (hgj) igr.d(this).b(hgj.class);
    }

    public final lay q() {
        return (lay) this.k.a();
    }

    public final void r() {
        Map d;
        Collection c;
        Object a = this.p.a();
        oll.d(a, "<get-installedModulesArea>(...)");
        ((TextView) a).setText(nxp.w(q().d(), "\n", null, null, null, 62));
        hgj p = p();
        Object a2 = this.q.a();
        oll.d(a2, "<get-pendingModulesArea>(...)");
        ((TextView) a2).setText((p == null || (c = p.c()) == null) ? "" : nxp.w(c, "\n", null, null, null, 62));
        Button y = y();
        boolean z = false;
        if (p != null && (d = p.d()) != null && !d.isEmpty()) {
            z = true;
        }
        y.setEnabled(z);
    }
}
