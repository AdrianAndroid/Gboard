package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eos  reason: default package */
/* loaded from: classes.dex */
public final class eos implements eon {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/splitprompt/SplitPromptModule");
    public final Context b;
    public Runnable c;
    public eov d;
    public Context e;
    public EditorInfo f;
    public idk g;
    private eoo h;
    private hww i;
    private hwu j;

    public eos(Context context) {
        this.b = context;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        Runnable runnable;
        int i = hfdVar.p;
        if ((i == 1 || i == 4) && (runnable = this.c) != null) {
            kki.i(runnable, ((Long) eop.b.c()).longValue());
            return false;
        }
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.i = new hso().V();
        this.g = ieh.j();
        this.j = new eor(this);
        this.i.g(ibz.a, ice.BODY, this.j);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.i.k(ibz.a, ice.BODY, this.j);
    }

    @Override // defpackage.hfx
    public final void h(ibz ibzVar) {
        eov eovVar;
        if (ibzVar == ibz.a || (eovVar = this.d) == null) {
            return;
        }
        eovVar.a(null);
    }

    @Override // defpackage.hfx
    public final void i() {
        Runnable runnable = this.c;
        if (runnable != null) {
            kki.k(runnable);
            this.c = null;
        }
        if (this.h != null) {
            hkp.b("split_prompt_confirmation_toast", false);
            this.h = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        this.e = hqtVar.a();
        this.f = editorInfo;
        if (eot.d(this.b)) {
            hsk b = hsx.b();
            View G = b == null ? null : b.G();
            if (G != null) {
                eoo eooVar = new eoo(this.e);
                this.h = eooVar;
                hky f = jdg.f(G, "split_prompt_confirmation_toast", eooVar.b.getString(R.string.f167070_resource_name_obfuscated_res_0x7f140921), eooVar.b.getString(R.string.f167050_resource_name_obfuscated_res_0x7f14091f), eooVar.b.getString(R.string.f167060_resource_name_obfuscated_res_0x7f140920), new edc(eooVar, 13));
                f.j = bsd.f;
                f.i = new ehz(eooVar, 7);
                f.j(false);
                hkq.b(f.a());
                ino.M(eooVar.b).f("show_split_confirmation_toast", false);
                return true;
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/splitprompt/SplitPromptModule", "onActivate", 125, "SplitPromptModule.java")).t("Cannot show split prompt confirmation toast because anchor view is null.");
            return true;
        }
        return true;
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
