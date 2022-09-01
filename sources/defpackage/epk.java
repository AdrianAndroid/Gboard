package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SlidePageCancelableViewPager;

/* compiled from: PG */
/* renamed from: epk  reason: default package */
/* loaded from: classes.dex */
public abstract class epk extends cx implements eps, hah {
    SlidePageCancelableViewPager k;
    public int l;
    private ept m = null;
    private final Configuration n = new Configuration();

    private final void t(int i) {
        ept eptVar = this.m;
        if (eptVar == null) {
            return;
        }
        if (i >= 2) {
            r();
        } else if (i < 0) {
            q();
        } else {
            this.k.l(i);
            eptVar.b[i].a();
        }
    }

    private final void u() {
        setContentView(R.layout.f146650_resource_name_obfuscated_res_0x7f0e05da);
        SlidePageCancelableViewPager slidePageCancelableViewPager = (SlidePageCancelableViewPager) findViewById(R.id.f129710_resource_name_obfuscated_res_0x7f0b218a);
        this.k = slidePageCancelableViewPager;
        slidePageCancelableViewPager.h = false;
        s(m());
    }

    @Override // defpackage.hah
    public final /* synthetic */ void gb() {
    }

    protected abstract ept l(epw epwVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final epw m() {
        ept eptVar = this.m;
        if (eptVar == null) {
            return null;
        }
        return eptVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        setRequestedOrientation(14);
    }

    @Override // defpackage.ow, android.app.Activity
    public final void onBackPressed() {
        if (isFinishing()) {
            return;
        }
        t(this.k.a() - 1);
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int diff = configuration.diff(this.n);
        this.n.setTo(configuration);
        if (diff == 512) {
            return;
        }
        u();
    }

    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n.setTo(getResources().getConfiguration());
        u();
        this.l = getRequestedOrientation();
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onStop() {
        t(0);
        super.onStop();
    }

    @Override // defpackage.eps
    public final void p() {
        if (isFinishing()) {
            return;
        }
        t(this.k.a() + 1);
    }

    protected abstract void q();

    protected abstract void r();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(epw epwVar) {
        ept l = epwVar == null ? null : l(epwVar);
        this.m = l;
        this.k.k(l);
    }
}
