package defpackage;

import android.content.Context;
import android.icu.util.ULocale;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import android.view.translation.UiTranslationManager;
import android.view.translation.UiTranslationStateCallback;
import com.google.android.apps.inputmethod.libs.translate.ITranslateUIExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bsy  reason: default package */
/* loaded from: classes.dex */
public final class bsy implements hfx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/autotranslate/AutoTranslateModule");
    public final ino b;
    public hfy c;
    public String d;
    public String e;
    public final qq f = new qq();
    public boolean g;
    public boolean h;
    public EditorInfo i;
    private final ino j;
    private UiTranslationStateCallback k;
    private final UiTranslationManager l;

    public bsy(Context context) {
        this.b = ino.K(context, "_autoshowtranslate");
        this.j = ino.M(context);
        if (!li.e()) {
            this.l = null;
            return;
        }
        UiTranslationManager uiTranslationManager = (UiTranslationManager) context.getSystemService("ui_translation");
        this.l = uiTranslationManager;
        gyc gycVar = gyc.b;
        if (this.k != null || uiTranslationManager == null) {
            return;
        }
        UiTranslationStateCallback uiTranslationStateCallback = new UiTranslationStateCallback() { // from class: com.google.android.apps.inputmethod.libs.autotranslate.AutoTranslateModule$1
            @Override // android.view.translation.UiTranslationStateCallback
            public final void onFinished() {
                onFinished("");
            }

            @Override // android.view.translation.UiTranslationStateCallback
            public final void onPaused() {
                onPaused("");
            }

            @Override // android.view.translation.UiTranslationStateCallback
            public void onResumed(ULocale uLocale, ULocale uLocale2) {
            }

            @Override // android.view.translation.UiTranslationStateCallback
            public final void onStarted(ULocale uLocale, ULocale uLocale2) {
                onStarted(uLocale.toLanguageTag(), uLocale2.toLanguageTag(), "");
            }

            public void onFinished(String str) {
                bsy.this.f.remove(str);
                bsy bsyVar = bsy.this;
                bsyVar.d = null;
                bsyVar.e = null;
                hkp.b("auto_translate_banner", false);
                hfy hfyVar = bsy.this.c;
                if (hfyVar != null) {
                    hfyVar.z(hfd.d(new iay(-10060, null, ITranslateUIExtension.class)));
                }
                ieh.j().e(bsw.FULL_SCREEN_TRANSLATE_DISABLED, new Object[0]);
            }

            public void onPaused(String str) {
                bsy.this.f.remove(str);
            }

            public void onStarted(ULocale uLocale, ULocale uLocale2, String str) {
                onStarted(uLocale.toLanguageTag(), uLocale2.toLanguageTag(), str);
            }

            public void onStarted(String str, String str2, String str3) {
                EditorInfo b = hsu.b();
                if (!bsy.this.f.contains(str3) || bsy.this.i != b) {
                    if (!str3.isEmpty() && b != null && !str3.equals(ham.m(b))) {
                        return;
                    }
                    if (b == null || b.inputType == 0) {
                        bsy.this.i = null;
                    } else {
                        bsy.this.i = b;
                    }
                    bsy.this.f.add(str3);
                    if (str != null || str2 != null) {
                        bsy bsyVar = bsy.this;
                        bsyVar.d = str;
                        bsyVar.e = str2;
                    }
                    bsy bsyVar2 = bsy.this;
                    if (bsyVar2.d == null || bsyVar2.e == null) {
                        ((ltd) ((ltd) bsy.a.c()).k("com/google/android/apps/inputmethod/libs/autotranslate/AutoTranslateModule$1", "onStarted", 113, "AutoTranslateModule.java")).t("translate language should not be null!");
                        return;
                    }
                    bsyVar2.h = true;
                    if (bsyVar2.g && bsyVar2.i != null) {
                        bsyVar2.c();
                    }
                    ieh.j().e(bsw.FULL_SCREEN_TRANSLATE_ENABLED, new Object[0]);
                }
            }
        };
        this.k = uiTranslationStateCallback;
        uiTranslationManager.registerUiTranslationStateCallback(gycVar, uiTranslationStateCallback);
    }

    public final void c() {
        String str;
        if (this.j.aj(R.string.f162330_resource_name_obfuscated_res_0x7f14070a)) {
            this.j.v(R.string.f162330_resource_name_obfuscated_res_0x7f14070a);
            ino inoVar = this.b;
            inoVar.d.d().clear().apply();
            inoVar.e = lrq.b;
        }
        if (this.j.x(R.string.f160660_resource_name_obfuscated_res_0x7f140662, true) && (str = this.d) != null) {
            String concat = "showcount_".concat(str);
            if (this.j.ai(concat)) {
                if (!this.j.ak(concat)) {
                    return;
                }
                d();
            }
            int D = this.b.D(concat);
            if (D < 0) {
                d();
            } else if (D >= 3) {
            } else {
                hky a2 = hlf.a();
                a2.p("auto_translate_banner");
                a2.m = 2;
                a2.s(R.layout.f133560_resource_name_obfuscated_res_0x7f0e0034);
                a2.o(true);
                a2.m(0L);
                a2.k(true);
                a2.g("");
                a2.j = bsd.b;
                a2.a = new cfs(this, 1);
                hkq.b(a2.a());
            }
        }
    }

    public final void d() {
        hfy hfyVar = this.c;
        if (hfyVar != null) {
            lls h = llw.h();
            h.a("extension_interface", ITranslateUIExtension.class);
            h.a("activation_source", hfl.AUTO_TRANSLATE);
            h.a("source", this.e);
            h.a("target", this.d);
            h.a("force_language", Boolean.valueOf(this.h));
            hfyVar.z(hfd.d(new iay(-10059, null, h.l())));
            this.h = false;
        }
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "AutoTranslateModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
        UiTranslationManager uiTranslationManager;
        UiTranslationStateCallback uiTranslationStateCallback;
        if (!li.e() || (uiTranslationManager = this.l) == null || (uiTranslationStateCallback = this.k) == null) {
            return;
        }
        uiTranslationManager.unregisterUiTranslationStateCallback(uiTranslationStateCallback);
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        this.g = false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final void k(hfy hfyVar) {
        this.c = hfyVar;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        EditorInfo editorInfo2;
        this.g = true;
        if (!li.e() || this.l == null) {
            return false;
        }
        String m = ham.m(editorInfo);
        if ((this.f.contains("") || this.f.contains(m)) && ((editorInfo2 = this.i) == null || (TextUtils.equals(editorInfo2.packageName, editorInfo.packageName) && editorInfo2.fieldId == editorInfo.fieldId))) {
            this.i = editorInfo;
            c();
        }
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
}
