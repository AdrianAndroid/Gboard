package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: hgf  reason: default package */
/* loaded from: classes.dex */
public abstract class hgf implements ifw {
    private final hgj a;

    public hgf(Context context) {
        oll.e(context, "applicationContext");
        ifw b = igr.d(context).b(hgj.class);
        oll.b(b);
        this.a = (hgj) b;
    }

    protected abstract iiy c();

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        oll.e(context, "applicationContext");
        hgj hgjVar = this.a;
        iiy c = c();
        if (hgjVar.f(c)) {
            return;
        }
        try {
            gen a = hgjVar.b.a(nxp.n("tenoranimation_feature_split"));
            a.k(new hgq(hgjVar, c, 1));
            a.j(new hgh(hgjVar, c));
        } catch (Exception e) {
            ((ltd) ((ltd) hgj.a.d()).i(e)).j(ltp.e("com/google/android/libraries/inputmethod/featuresplit/FeatureSplitObservationModule", "requestDeferredInstall", 109, "FeatureSplitObservationModule.kt")).w("Failed in installing %s.", "tenoranimation_feature_split");
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
