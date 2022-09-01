package defpackage;

import com.google.android.apps.inputmethod.libs.framework.core.AppBase;

/* compiled from: PG */
/* renamed from: boa  reason: default package */
/* loaded from: classes.dex */
class boa extends AppBase implements npa {
    private boolean a = false;
    private final noy b = new noy(new opu(this), null, null, null, null, null, null);

    @Override // defpackage.npa
    public final Object a() {
        return this.b.a();
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase, android.app.Application
    public final void onCreate() {
        if (!this.a) {
            this.a = true;
            a();
            boj bojVar = (boj) this;
        }
        super.onCreate();
    }
}
