package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: bro  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bro implements ahw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bro(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    public /* synthetic */ bro(ini iniVar, int i) {
        this.b = i;
        this.a = iniVar;
    }

    @Override // defpackage.ahw
    public final void a() {
        if (this.b == 0) {
            ffg.a((Context) this.a);
            return;
        }
        ap B = ((aih) this.a).B();
        View decorView = B.getWindow().getDecorView();
        new els(B).h(decorView, decorView.getWindowToken(), "setting_sharing");
    }
}
