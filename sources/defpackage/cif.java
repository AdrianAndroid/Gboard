package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cif  reason: default package */
/* loaded from: classes.dex */
class cif implements hfx, hfh {
    final hso a;
    final idk b;
    private final cpu c;
    private final cqa d;

    public cif(hso hsoVar, idk idkVar, cpu cpuVar, cqa cqaVar) {
        this.a = hsoVar;
        this.b = idkVar;
        this.c = cpuVar;
        this.d = cqaVar;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f;
        CharSequence charSequence;
        if (hfdVar.a == iah.PRESS && (f = hfdVar.f()) != null && f.c == -10002) {
            Object obj = f.e;
            if (!(obj instanceof hln)) {
                return false;
            }
            hln hlnVar = (hln) obj;
            if (hlnVar.e != hlm.EMOJI || (charSequence = hlnVar.a) == null) {
                if (hlnVar.e != hlm.EXPRESSION) {
                    return false;
                }
                int i = hlnVar.s;
                if (i != 1 && i != 5 && i != 4 && i != 10) {
                    if (i == 7) {
                        d(hfdVar, hlnVar);
                        return true;
                    }
                    dau.j(false, "Unhandled expression event %s", hfdVar);
                    return true;
                }
                lfb f2 = dau.f(ckj.class, hlnVar.j);
                if (f2.e()) {
                    if (((ckj) f2.a()).f() == 2) {
                        this.c.c(((ckj) f2.a()).c.d);
                    } else if (((ckj) f2.a()).f() == 3) {
                        this.d.c(((ckj) f2.a()).c.d);
                    }
                    this.b.e(ciu.SHARE, Integer.valueOf(eju.m(((ckj) f2.a()).c)));
                    if (((ckj) f2.a()).d) {
                        ieh.j().e(ctd.EXPRESSION_HEADER_EMOJI_CLICKED, new Object[0]);
                    }
                }
            } else {
                this.c.c(charSequence.toString());
                return false;
            }
        }
        return false;
    }

    public void d(hfd hfdVar, hln hlnVar) {
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
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.a.close();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
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
}
