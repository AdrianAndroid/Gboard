package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;

/* compiled from: PG */
/* renamed from: ium  reason: default package */
/* loaded from: classes.dex */
public final class ium implements ifw, itw {
    public final Context a;

    public ium(Context context) {
        this.a = context;
    }

    @Override // defpackage.itw
    public final llp c() {
        itu a = itv.a();
        a.a = "NEBULAE_MATERIALIZER";
        a.b = "^/native/.*";
        a.d(hrx.d);
        a.b(new iul(this, 1));
        itv a2 = a.a();
        itu a3 = itv.a();
        a3.a = "NEBULAE_CENSUS_MATERIALIZER";
        a3.b = "^/nebulae/census$";
        a3.d(hrx.d);
        a3.b(new iul(this, 0));
        itv a4 = a3.a();
        itu a5 = itv.a();
        a5.a = "NEBULAE_METRICS_MATERIALIZER";
        a5.b = "^/nebulae/metrics$";
        a5.b(hwy.s);
        return llp.t(a2, a4, a5.a());
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        NativeLibHelper.a("native-materializer-jni", false);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
