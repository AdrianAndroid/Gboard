package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iqs  reason: default package */
/* loaded from: classes.dex */
public final class iqs implements iqq {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension");
    public final idk c;
    private FrameLayout d;
    private hqt e;
    private iou f;
    private hfy g;
    public final hso b = new hso();
    private boolean h = true;

    public iqs() {
        ieh j = ieh.j();
        this.c = j;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        int i;
        iay f = hfdVar.f();
        boolean z = false;
        if (f == null || f.c != -400000) {
            return false;
        }
        Object obj = f.e;
        if (!(obj instanceof iqv)) {
            if (obj != null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension", "consumeEvent", 143, "SpellCheckerExtension.java")).t("SPELL_CHECK_SUGGESTIONS received with bad key data.");
            }
            ker.r();
            f();
            return true;
        }
        iqv iqvVar = (iqv) obj;
        final boolean booleanValue = iqvVar.a.booleanValue();
        llp llpVar = iqvVar.b;
        hqt hqtVar = this.e;
        final Context a2 = hqtVar != null ? hqtVar.a() : null;
        if (a2 == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension", "showSuggestions", 168, "SpellCheckerExtension.java")).t("Doesn't show spell check suggestions for null keyboard context.");
            return true;
        }
        llk e = llp.e();
        final int i2 = 0;
        while (i2 < ((lrl) llpVar).c) {
            final String str = (String) llpVar.get(i2);
            if (!TextUtils.isEmpty(str)) {
                View inflate = LayoutInflater.from(a2).inflate(i2 == 0 ? R.layout.f146480_resource_name_obfuscated_res_0x7f0e05c2 : R.layout.f146460_resource_name_obfuscated_res_0x7f0e05c0, this.d, z);
                ((AppCompatTextView) inflate.findViewById(R.id.f128910_resource_name_obfuscated_res_0x7f0b2114)).setText(str);
                i = i2;
                inflate.setOnClickListener(new View.OnClickListener() { // from class: iqr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        meb mebVar;
                        iqs iqsVar = iqs.this;
                        Context context = a2;
                        String str2 = str;
                        boolean z2 = booleanValue;
                        int i3 = i2;
                        hxk.a(context).b(view, 0);
                        ((ltd) ((ltd) iqs.a.b()).k("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension", "lambda$createSuggestionChip$0", 218, "SpellCheckerExtension.java")).w("click to submit spell checker suggestion:%s", str2);
                        iqsVar.d().z(hfd.d(new iay(-400001, null, str2)));
                        idk idkVar = iqsVar.c;
                        iqu iquVar = iqu.SC_SELECT_SUGGESTION;
                        Object[] objArr = new Object[2];
                        if (z2) {
                            mebVar = meb.SPELL_CORRECTION;
                        } else {
                            mebVar = meb.GRAMMAR_CORRECTION;
                        }
                        objArr[0] = mebVar;
                        objArr[1] = Integer.valueOf(i3);
                        idkVar.e(iquVar, objArr);
                        iqsVar.f();
                    }
                });
                e.h(inflate);
            } else {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension", "showSuggestions", 175, "SpellCheckerExtension.java")).u("Ignore empty suggestion on index %d.", i2);
                i = i2;
            }
            i2 = i + 1;
            z = false;
        }
        if (booleanValue && irs.d()) {
            View inflate2 = LayoutInflater.from(a2).inflate(R.layout.f146470_resource_name_obfuscated_res_0x7f0e05c1, (ViewGroup) this.d, false);
            inflate2.setOnClickListener(new ikq(this, a2, 3));
            e.h(inflate2);
        }
        llp g = e.g();
        idk idkVar = this.c;
        ios a3 = iou.a();
        a3.b(iot.SPELL_CHECKER);
        a3.a = "spell_checker";
        a3.c(true);
        a3.b = g;
        a3.d = new bdx(idkVar, booleanValue, 8);
        a3.e = bsd.p;
        a3.g = cqg.t;
        a3.f = cqg.u;
        iou a4 = a3.a();
        this.f = a4;
        ior.b(a4, hwv.PREEMPTIVE_WITH_SUPPRESSION);
        return true;
    }

    public final hfy d() {
        hfy hfyVar = this.g;
        if (hfyVar != null) {
            return hfyVar;
        }
        throw new IllegalStateException("Delegate is null! Extensions must not be interacted with unless they have a non-null delegate.");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentProactiveSuggestions: ".concat(String.valueOf(String.valueOf(this.f))));
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    public final void f() {
        iou iouVar = this.f;
        if (iouVar != null) {
            ioq.b(iouVar, true);
            this.f = null;
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SpellCheckerExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
        f();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        this.d = null;
        this.e = null;
        ker.r();
        f();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final void k(hfy hfyVar) {
        this.g = hfyVar;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        boolean z2;
        this.d = new FrameLayout(hqtVar.a());
        if (!kez.s(hqtVar)) {
            this.e = hqtVar;
            if (this.h) {
                d().G();
            }
            z2 = false;
        } else {
            this.e = hqtVar;
            z2 = true;
        }
        this.h = z2;
        return z2;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final boolean p() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
