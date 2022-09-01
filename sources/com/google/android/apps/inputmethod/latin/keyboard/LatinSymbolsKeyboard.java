package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.framework.keyboard.SymbolsKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.widget.FixedSizeEmojiListHolder;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinSymbolsKeyboard extends SymbolsKeyboard implements ddq, heo {
    FixedSizeEmojiListHolder d;
    public hen e;
    private final cpu g;
    private final bpm h;
    private hdl i = hdl.a;
    private boolean j;
    private ddr k;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/LatinSymbolsKeyboard");
    private static final String[] f = {"😃", "😂", "😉", "😞", "😭", "😠", "😝"};
    static final hhl b = hhq.a("enable_variants_popup_in_symbols_keyboard", true);
    static final hhl c = hhq.a("enable_variants_indicator_in_symbols_keyboard", false);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatinSymbolsKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cpu cpuVar = cqh.a().b;
        this.g = cpuVar;
        this.h = new bpm(context, iavVar, hszVar, iavVar.e, iavVar.q.c(R.id.f55060_resource_name_obfuscated_res_0x7f0b01e3, null), iavVar.q.d(R.id.f55080_resource_name_obfuscated_res_0x7f0b01e5, true));
        bpf bpfVar = new bpf(this);
        this.k = bpfVar;
        bpfVar.c(context, ibmVar, iavVar);
    }

    @Override // defpackage.heo
    public final void A() {
    }

    public final void D(hww hwwVar) {
        this.j = hwwVar.i(ice.HEADER, R.id.f96380_resource_name_obfuscated_res_0x7f0b141d, false, hwv.DEFAULT, true);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.SymbolsKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f2 = hfdVar.f();
        if (f2 == null || f2.c != -10127 || !ice.HEADER.equals(f2.e) || !((Boolean) dcu.k.c()).booleanValue() || !ham.ap(this.u, this.D)) {
            if (!super.c(hfdVar)) {
                this.k.k(hfdVar);
                if (!this.h.c(hfdVar)) {
                    return false;
                }
            }
            return true;
        }
        this.v.P(this.s, ice.HEADER, hth.SHOW_MANDATORY);
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.SymbolsKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        hen henVar = this.e;
        if (henVar != null) {
            henVar.close();
            this.e = null;
        }
        this.d = null;
        this.k.h(icfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        if (iceVar == ice.HEADER) {
            return this.v.V(ibz.a, iceVar) && am(iceVar);
        }
        return am(iceVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.SymbolsKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b == ice.HEADER && jai.b.b()) {
            this.d = (FixedSizeEmojiListHolder) softKeyboardView.findViewById(R.id.f96380_resource_name_obfuscated_res_0x7f0b141d);
        }
        this.k.g(softKeyboardView, icfVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.SymbolsKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        KeyboardViewHolder keyboardViewHolder;
        super.g(editorInfo, obj);
        this.h.b(obj, X(ice.BODY));
        this.i = hdn.instance.h;
        if (this.d == null) {
            return;
        }
        if (m()) {
            FixedSizeEmojiListHolder fixedSizeEmojiListHolder = this.d;
            fixedSizeEmojiListHolder.j(fixedSizeEmojiListHolder.a);
            FixedSizeEmojiListHolder fixedSizeEmojiListHolder2 = this.d;
            if (fixedSizeEmojiListHolder2 != null) {
                for (ViewParent parent = fixedSizeEmojiListHolder2.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof KeyboardViewHolder) {
                        keyboardViewHolder = (KeyboardViewHolder) parent;
                        break;
                    }
                }
            }
            keyboardViewHolder = null;
            this.e = new hen(fixedSizeEmojiListHolder2, keyboardViewHolder, this, R.style.f199120_resource_name_obfuscated_res_0x7f15053e, ((Boolean) b.c()).booleanValue(), ((Boolean) c.c()).booleanValue());
            this.e.d(this.u.getResources().getDimensionPixelSize(R.dimen.f33840_resource_name_obfuscated_res_0x7f070167), this.u.getResources().getDimensionPixelSize(R.dimen.f33830_resource_name_obfuscated_res_0x7f070166));
            FixedSizeEmojiListHolder fixedSizeEmojiListHolder3 = this.d;
            if (fixedSizeEmojiListHolder3 == null) {
                return;
            }
            int i = fixedSizeEmojiListHolder3.b;
            hiz b2 = this.g.b(30L);
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new bps(this, i, 1));
            e2.h(new bps(this, i, 0));
            b2.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
            return;
        }
        this.k.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final hth gj(ice iceVar) {
        if (iceVar != ice.HEADER || !fB(iceVar)) {
            return super.gj(iceVar);
        }
        return hth.SHOW_OPTIONAL;
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.SymbolsKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        if (!m()) {
            this.k.e();
        }
        if (this.j) {
            hen henVar = this.e;
            if (henVar != null) {
                henVar.close();
                this.e = null;
            }
            hww o = o();
            o.c(ibz.c, ice.HEADER, R.id.f96380_resource_name_obfuscated_res_0x7f0b141d);
            o.e(ice.HEADER, R.id.f96380_resource_name_obfuscated_res_0x7f0b141d, true, false);
        }
        this.h.d();
        super.h();
    }

    @Override // defpackage.heo
    public final void l(hei heiVar) {
        String str = heiVar.b;
        hsz hszVar = this.v;
        if (hszVar != null) {
            hszVar.z(hfd.d(new iay(-10027, iax.COMMIT, heiVar.b)));
            idk hO = this.v.hO();
            ctd ctdVar = ctd.EMOJI_OR_TEXT_SHARE;
            Object[] objArr = new Object[2];
            objArr[0] = heiVar.b;
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 7;
            mbcVar.a |= 1;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 12;
            mbcVar2.a = 2 | mbcVar2.a;
            nfh t2 = mdl.h.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mdl mdlVar = (mdl) t2.b;
            mdlVar.b = 1;
            int i = mdlVar.a | 1;
            mdlVar.a = i;
            boolean z = heiVar.g;
            mdlVar.a = i | 4;
            mdlVar.d = z;
            mdl mdlVar2 = (mdl) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mdlVar2.getClass();
            mbcVar3.k = mdlVar2;
            mbcVar3.a |= 2048;
            objArr[1] = t.cz();
            hO.e(ctdVar, objArr);
            this.g.c(heiVar.b);
        }
    }

    protected final boolean m() {
        return this.d != null && htg.a(this) && this.t.aj(R.string.f162540_resource_name_obfuscated_res_0x7f14071f);
    }

    @Override // defpackage.ddq
    public final hww o() {
        return this.v.o();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        this.v.P(this.s, ice.HEADER, hth.SHOW_MANDATORY_WITH_ANIMATION);
        if (!m()) {
            this.k.b(list, hlnVar, z);
        }
    }

    @Override // defpackage.ddq
    public final void t(hfd hfdVar) {
        this.v.z(hfdVar);
    }

    public final String[] u(llp llpVar, int i) {
        ArrayList arrayList = new ArrayList(i);
        HashSet m = lvw.m(i);
        for (int i2 = 0; i2 < llpVar.size() && m.size() < i; i2++) {
            String str = (String) llpVar.get(i2);
            if (str != null && !m.contains(str) && hdz.a().g(str, this.i)) {
                arrayList.add(str);
                m.add(str);
            }
        }
        for (int i3 = 0; i3 < 7 && m.size() < i; i3++) {
            String str2 = f[i3];
            if (!m.contains(str2)) {
                arrayList.add(str2);
                m.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void v() {
        hww o = o();
        o.h(ibz.c, ice.HEADER, R.id.f96380_resource_name_obfuscated_res_0x7f0b141d, new bpt(this, o));
        D(o);
    }

    @Override // defpackage.ddq
    public final void w(int i) {
        this.v.J(i);
    }

    @Override // defpackage.ddq
    public final void x(hln hlnVar, boolean z) {
        this.v.K(hlnVar, z);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void z(boolean z) {
        if (!m()) {
            this.k.j(z);
        }
    }
}
