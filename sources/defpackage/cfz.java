package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.util.Printer;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cfz  reason: default package */
/* loaded from: classes.dex */
public final class cfz implements cfr, hsl, hfh, idp {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension");
    public static final hhl b = hhq.a("enable_device_intelligence_source_platform", false);
    public static final hhl c = hhq.a("enable_auto_fill_action_suggestion_only_category", false);
    public static final hhl d = hhq.f("device_intelligence_min_gms_version_supported", -1);
    public static final hhl e = hhq.a("disable_device_intelligence_when_talkback_on", true);
    public final Context f;
    public final idk g;
    public boolean h;
    public hsk i;
    public boolean j;
    public cge k;
    public iou l;
    public View m;
    public int n;
    private hwv q;
    private final hsw o = new cfv(this);
    private final hst p = new cfw(this);
    private final hwu r = new cgi(this, 1);
    private final hqi s = new cfx(this);

    public cfz(Context context) {
        ieh j = ieh.j();
        this.f = context;
        this.g = j;
    }

    public static int f(Context context) {
        return jbt.e(context, R.attr.f4910_resource_name_obfuscated_res_0x7f04011d) - jbt.e(context, R.attr.f4920_resource_name_obfuscated_res_0x7f04011e);
    }

    public static int g(Context context) {
        return jbt.e(context, R.attr.f6750_resource_name_obfuscated_res_0x7f0401d8);
    }

    public static cge l(boolean z) {
        return z ? new cgg() : new cgn();
    }

    public static String r() {
        EditorInfo b2 = hsu.b();
        if (b2 == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension", "getCurrentAppPackageName", 219, "DeviceIntelligenceExtension.java")).t("Current EditorInfo is null");
            return "";
        }
        return ham.m(b2);
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iou iouVar;
        hwv hwvVar;
        iay f = hfdVar.f();
        if (f != null && (iouVar = this.l) != null && f.c == -10028 && (hwvVar = this.q) != null && hwvVar == hwv.PREEMPTIVE_WITH_SUPPRESSION) {
            ioq.b(iouVar, false);
            this.l = null;
            this.q = null;
        }
        return false;
    }

    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new cgb(idiVar));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DeviceIntelligenceExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.o.e(gyc.b);
        this.s.f(mjl.a);
        hsx.c().a(ice.HEADER, this.r);
        this.p.f(mjl.a);
        boolean booleanValue = ((Boolean) gqj.d.c()).booleanValue();
        this.j = booleanValue;
        this.k = l(booleanValue);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.o.f();
        this.s.h();
        hsx.c().l(ice.HEADER, this.r);
        this.p.h();
        cge cgeVar = this.k;
        if (cgeVar != null) {
            cgeVar.a();
            this.k = null;
        }
        hsk hskVar = this.i;
        if (hskVar != null) {
            hskVar.bh(null);
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
    }

    @Override // defpackage.hfx
    public final void j(EditorInfo editorInfo, boolean z) {
        if (ham.m(editorInfo).equals(this.f.getPackageName())) {
            w();
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    public final String m() {
        AutofillManager autofillManager = (AutofillManager) this.f.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension", "getAutofillServicePackageName", 759, "DeviceIntelligenceExtension.java")).t("Failed to get autofill manager service");
            return "";
        }
        ComponentName autofillServiceComponentName = autofillManager.getAutofillServiceComponentName();
        if (autofillServiceComponentName == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension", "getAutofillServicePackageName", 764, "DeviceIntelligenceExtension.java")).t("Autofill ComponentName is null");
            return "";
        }
        return autofillServiceComponentName.getPackageName();
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }

    public final void s(View[] viewArr, ios iosVar, String str) {
        Runnable runnable;
        if (x()) {
            return;
        }
        llk e2 = llp.e();
        int i = 0;
        for (View view : viewArr) {
            if (view != null) {
                e2.h(view);
                i++;
            }
        }
        boolean z = this.l == null;
        boolean equals = "android:autofill".equals(str);
        iosVar.d = new dbz(this, z, equals, 1);
        iosVar.b = llp.o(e2.g());
        iosVar.c(true);
        iosVar.e = new cbq(this, 6);
        iou a2 = iosVar.a();
        if (a2.c == null) {
            v();
        }
        boolean equals2 = "android:platform".equals(str);
        if (i == 0) {
            t();
            if (equals2 || (runnable = a2.c) == null) {
                return;
            }
            runnable.run();
            return;
        }
        iou iouVar = this.l;
        if (iouVar != null && a2.a != iouVar.a) {
            t();
        }
        this.l = a2;
        hwv hwvVar = equals2 ? hwv.DEFAULT : hwv.PREEMPTIVE_WITH_SUPPRESSION;
        this.q = hwvVar;
        ior.b(a2, hwvVar);
        idk idkVar = this.g;
        cgd cgdVar = cgd.SUGGESTION_DISPLAYED;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = equals ? m() : null;
        objArr[2] = r();
        idkVar.e(cgdVar, objArr);
    }

    public final void t() {
        u();
        iou iouVar = this.l;
        if (iouVar != null) {
            ijl.b().g(new ioq(iouVar, true));
            this.l = null;
            this.q = null;
        }
    }

    public final void u() {
        if (this.h) {
            hkp.b("device_intelligence_onboarding_banner", false);
        }
    }

    public final void v() {
        cge cgeVar = this.k;
        if (cgeVar != null) {
            cgeVar.c();
        }
    }

    public final void w() {
        t();
        v();
    }

    public final boolean x() {
        return this.m != null && this.n > 0;
    }
}
