package com.google.android.apps.inputmethod.libs.japanese.keyboard;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JapanesePrimeKeyboard extends Keyboard implements dku, dlb {
    private static final lug b = hin.a;
    private static final long c = TimeUnit.DAYS.toMillis(1);
    private static final hhk d = dkw.a;
    dkv a;

    public JapanesePrimeKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10127 || !ice.HEADER.equals(f.e) || !((Boolean) dcu.k.c()).booleanValue() || !ham.ap(this.u, this.D)) {
            if (hfdVar.k == this) {
                ((luc) ((luc) b.b()).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/JapanesePrimeKeyboard", "consumeEvent", 275, "JapanesePrimeKeyboard.java")).t("Skip consuming an event as sourceIndicator points itself");
                return super.c(hfdVar);
            } else if (hfdVar.a == iah.UP) {
                return super.c(hfdVar);
            } else {
                dkv dkvVar = this.a;
                if (dkvVar == null) {
                    ((luc) ((luc) b.b()).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/JapanesePrimeKeyboard", "consumeEvent", 284, "JapanesePrimeKeyboard.java")).t("Skip consuming an event as keyboardViewController is null");
                    return super.c(hfdVar);
                }
                iay f2 = hfdVar.f();
                if (f2 != null) {
                    int i = f2.c;
                    if (i == -60000) {
                        dkvVar.b.n(dkvVar.j);
                    } else if (i == -10016) {
                        dkvVar.c(true, !dkvVar.f.b());
                    }
                }
                return super.c(hfdVar);
            }
        }
        this.v.P(this.s, ice.HEADER, hth.SHOW_MANDATORY);
        return true;
    }

    @Override // defpackage.dku
    public final float e() {
        return this.v.a();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        dkn.a.g(d);
        if (icfVar.b == ice.BODY || icfVar.b == ice.FLOATING_CANDIDATES) {
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        dkv dkvVar = this.a;
        if (dkvVar != null) {
            dkt dktVar = dkt.UNINITIALIZED;
            ice iceVar2 = ice.HEADER;
            int ordinal = iceVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (dkvVar.c != iceVar || !dkvVar.f.c()) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (dkvVar.c != iceVar) {
                    return false;
                }
            } else if (dkvVar.f.c()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        if (dko.a.equals(this.s) || dko.b.equals(this.s)) {
            return this.u.getString(R.string.f148670_resource_name_obfuscated_res_0x7f1400c2);
        }
        if (dko.c.equals(this.s)) {
            return this.u.getString(R.string.f150320_resource_name_obfuscated_res_0x7f140191);
        }
        return ai();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.BODY || icfVar.b == ice.FLOATING_CANDIDATES) {
            dkv dkvVar = new dkv(this, icfVar.b, softKeyboardView);
            this.a = dkvVar;
            dlc dlcVar = dkvVar.e;
            ibm ibmVar = this.w;
            if (ibmVar != null) {
                dlcVar.w(ibmVar.f);
            }
            dlcVar.hd(this);
            dlcVar.v(this.x.i);
        }
        dkn.a.e(d);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        ibz ibzVar;
        super.g(editorInfo, obj);
        dkv dkvVar = this.a;
        if (dkvVar != null) {
            Context context = this.u;
            dkvVar.i = jdg.W(context.getPackageName(), editorInfo.packageName);
            dkvVar.k = ino.M(context);
            dkvVar.j = dko.a(context, dkvVar.b.l(), dkvVar.k);
            dkvVar.k.X(dkvVar.l, R.string.f161480_resource_name_obfuscated_res_0x7f1406b5);
            dkvVar.b();
        }
        if (this.s == ibz.a || this.s == dko.a || (ibzVar = this.s) == dko.b || ibzVar == dko.c) {
            ino inoVar = this.t;
            inoVar.f("japanese_first_time_user", !inoVar.ah(R.string.f161500_resource_name_obfuscated_res_0x7f1406b7));
            this.t.U(R.string.f161500_resource_name_obfuscated_res_0x7f1406b7, this.s.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final hth gj(ice iceVar) {
        if (iceVar != ice.HEADER || !fB(iceVar)) {
            return super.gj(iceVar);
        }
        return hth.SHOW_OPTIONAL;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j, long j2) {
        View view;
        super.gl(j, j2);
        dkv dkvVar = this.a;
        if (dkvVar != null) {
            if (((j ^ j2) & 512) != 0 && !icu.e(j2)) {
                dkvVar.b();
            }
            view = this.a.d.findViewById(R.id.key_pos_shift);
        } else {
            view = null;
        }
        if (view == null || icu.i(j) || !icu.i(j2) || (j2 & 2) == 2 || !af(3L) || af(17592186044419L) || this.t.b("ja_shift_lock_hint_show_count", 0) >= 3 || System.currentTimeMillis() - this.t.c("ja_shift_lock_hint_last_show_time", 0L) < c) {
            return;
        }
        hky a = hlf.a();
        a.m = 1;
        a.p("SHIFT_LOCK_TOOLTIP_ID");
        a.c = view;
        a.s(R.layout.f145120_resource_name_obfuscated_res_0x7f0e052a);
        a.o(true);
        a.g(this.u.getString(R.string.f176720_resource_name_obfuscated_res_0x7f140cf3));
        a.d = bwe.d;
        a.m(5000L);
        a.t(true);
        a.q();
        a.l(R.animator.f890_resource_name_obfuscated_res_0x7f020042);
        a.h(R.animator.f660_resource_name_obfuscated_res_0x7f020024);
        a.j = new dgd(this, 6);
        hkq.b(a.a());
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        dkv dkvVar = this.a;
        if (dkvVar != null) {
            dkvVar.b();
        }
        hkp.b("SHIFT_LOCK_TOOLTIP_ID", false);
        super.h();
    }

    @Override // defpackage.dku
    public final htc k() {
        return this.v.n();
    }

    @Override // defpackage.dku
    public final iav l() {
        return this.x;
    }

    @Override // defpackage.dku
    public final void m(ice iceVar) {
        if (this.a != null) {
            gk(iceVar);
        }
    }

    @Override // defpackage.dku
    public final void n(ibz ibzVar) {
        this.v.z(hfd.d(new iay(-10004, null, ibzVar.l)));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        dkv dkvVar = this.a;
        if (dkvVar != null) {
            hsz hszVar = this.v;
            if (dkvVar.h) {
                dkvVar.e.n();
                dkvVar.h = false;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            dkvVar.e.l(list);
            if (hlnVar != null && dkvVar.e.F(hlnVar)) {
                hszVar.K(hlnVar, false);
            }
            dlc dlcVar = dkvVar.e;
            dlcVar.q(dlcVar.c() != -1);
            if (dkvVar.g != null) {
                if (dkvVar.e.c() == -1) {
                    dkvVar.g.setVisibility(8);
                } else {
                    ((AppCompatTextView) dkvVar.g.findViewById(R.id.f67020_resource_name_obfuscated_res_0x7f0b082f)).setText(String.format(Locale.US, "%d / %d", Integer.valueOf(dkvVar.e.c() + 1), Integer.valueOf(dkvVar.e.b())));
                    dkvVar.g.setVisibility(0);
                }
            }
            dkvVar.e(true);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hsy
    public final void s(CursorAnchorInfo cursorAnchorInfo, int[] iArr) {
        Rect m = hjg.m(cursorAnchorInfo, 1);
        iArr[0] = m.left;
        iArr[1] = m.bottom;
    }

    @Override // defpackage.dlb
    public final void t(boolean z) {
        if (z != ((this.B & 4096) == 0)) {
            fp(4096L, !z);
        }
    }

    @Override // defpackage.dlb
    public final void u(int i) {
        this.v.J(i);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void z(boolean z) {
        dkv dkvVar = this.a;
        if (dkvVar != null) {
            hsz hszVar = this.v;
            if (z) {
                dkvVar.h = true;
                hszVar.J(dkvVar.e.a());
                return;
            }
            dkvVar.e.n();
            dkvVar.b();
        }
    }
}
