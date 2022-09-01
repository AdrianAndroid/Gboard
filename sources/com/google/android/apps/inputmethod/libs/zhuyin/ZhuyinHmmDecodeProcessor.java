package com.google.android.apps.inputmethod.libs.zhuyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ZhuyinHmmDecodeProcessor extends AbstractHmmChineseDecodeProcessor {
    private static final iay n = new iay(62, iax.DECODE, "ˉ");
    private static final llw v;
    protected dkk m;

    static {
        lls i = llw.i(42);
        i.a((char) 12549, "玻");
        i.a((char) 12550, "坡");
        i.a((char) 12551, "摸");
        i.a((char) 12552, "佛");
        i.a((char) 12553, "得");
        i.a((char) 12554, "特");
        i.a((char) 12555, "讷");
        i.a((char) 12556, "勒");
        i.a((char) 12557, "哥");
        i.a((char) 12558, "科");
        i.a((char) 12559, "喝");
        i.a((char) 12560, "基");
        i.a((char) 12561, "欺");
        i.a((char) 12562, "希");
        i.a((char) 12563, "知");
        i.a((char) 12564, "蚩");
        i.a((char) 12565, "诗");
        i.a((char) 12566, "日");
        i.a((char) 12567, "资");
        i.a((char) 12568, "雌");
        i.a((char) 12569, "思");
        i.a((char) 12583, "衣");
        i.a((char) 12584, "屋");
        i.a((char) 12585, "迂");
        i.a((char) 12570, "啊");
        i.a((char) 12571, "喔");
        i.a((char) 12572, "鹅");
        i.a((char) 12573, "耶");
        i.a((char) 12574, "哀");
        i.a((char) 12575, "紏");
        i.a((char) 12576, "熬");
        i.a((char) 12577, "欧");
        i.a((char) 12578, "安");
        i.a((char) 12579, "恩");
        i.a((char) 12580, "昂");
        i.a((char) 12581, "亨");
        i.a((char) 12582, "儿");
        i.a((char) 713, "阴平");
        i.a((char) 714, "阳平");
        i.a((char) 711, "上声");
        i.a((char) 715, "去声");
        i.a((char) 729, "轻声");
        v = i.l();
    }

    private final boolean ax() {
        return this.a > 60;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r0.n(r0.l(r4, r2 - 1)) == defpackage.djj.SOURCE_TOKEN) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            r6 = this;
            boolean r0 = r6.ao()
            r1 = 0
            if (r0 == 0) goto L41
            boolean r0 = r6.ay()
            if (r0 == 0) goto L41
            djh r0 = r6.i
            dik r0 = (defpackage.dik) r0
            boolean r2 = r0.i
            r3 = 1
            if (r2 != 0) goto L18
        L16:
            r1 = 1
            goto L41
        L18:
            com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl r2 = r0.m
            int r2 = r2.e()
            if (r2 != 0) goto L21
            goto L16
        L21:
            com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl r4 = r0.m
            int r2 = r2 + (-1)
            long r4 = r4.k(r2)
            com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl r2 = r0.m
            int r2 = r2.f(r4)
            if (r2 == 0) goto L16
            com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl r0 = r0.m
            int r2 = r2 + (-1)
            long r4 = r0.l(r4, r2)
            djj r0 = r0.n(r4)
            djj r2 = defpackage.djj.SOURCE_TOKEN
            if (r0 != r2) goto L16
        L41:
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6.au(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.zhuyin.ZhuyinHmmDecodeProcessor.b():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void L() {
        super.L();
        this.m.f();
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, defpackage.hlu
    public final boolean O() {
        return !ax();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    public final boolean S(iay iayVar, float f, List list, List list2, boolean z) {
        if (list.size() >= 8) {
            return false;
        }
        iay[] a = fgl.a(iayVar.c);
        if (a == null) {
            return true;
        }
        for (iay iayVar2 : a) {
            list.add(iayVar2);
            list2.add(Float.valueOf(f));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final boolean V(hln hlnVar, boolean z) {
        boolean V = super.V(hlnVar, z);
        b();
        return V;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        this.m = new fgi(context, this, this.r);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final String ag(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String str2 = (String) v.get(Character.valueOf(str.charAt(i)));
            if (str2 != null) {
                sb.append(str2);
                sb.append(" ");
            }
        }
        return this.o.getString(R.string.f163300_resource_name_obfuscated_res_0x7f140784, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return fgj.l(this.o);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(fgj.l(this.o).m());
        diyVar.i(fgj.l(this.o).H(3));
        return diyVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void k() {
        super.k();
        this.m.c();
        this.m.b = this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void m() {
        super.m();
        this.m.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void n() {
        super.n();
        this.m.b();
    }

    @Override // defpackage.hlu
    public final boolean o(iay iayVar) {
        return btp.c(iayVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean p(hfd hfdVar) {
        boolean z = true;
        if (this.m.h(hfdVar)) {
            b();
            return true;
        } else if (hfdVar.a == iah.DOWN || hfdVar.a == iah.UP) {
            return false;
        } else {
            iay iayVar = hfdVar.b[0];
            if (iayVar.c == 67) {
                z = W();
            } else {
                B();
                int i = iayVar.c;
                if (i != 62) {
                    if (i != 66) {
                        if (btp.c(iayVar)) {
                        }
                    } else if (ao()) {
                        X("ENTER");
                    } else {
                        as(null, 1, true);
                        z = false;
                    }
                } else if (ao()) {
                    if (!ay()) {
                        X("SPACE");
                    } else if (!ax()) {
                        hfdVar.b[0] = n;
                        z = R(hfdVar);
                    }
                } else {
                    as(null, 1, true);
                    z = false;
                }
            }
            b();
            return z;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl s(Context context) {
        return null;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl t(Context context) {
        return fgj.l(context).M(3);
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int u() {
        return a() ? 1 : 2;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int v() {
        return 2;
    }

    private final boolean ay() {
        int e;
        int f;
        long l;
        int h;
        dik dikVar = (dik) this.i;
        String str = null;
        if (dikVar.i && (e = dikVar.m.e()) != 0) {
            long k = dikVar.m.k(e - 1);
            if (!dikVar.m.x(k) && (f = dikVar.m.f(k)) > 0 && (h = dikVar.m.h((l = dikVar.m.l(k, f - 1)))) > 0) {
                HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar.m;
                str = hmmEngineInterfaceImpl.u(hmmEngineInterfaceImpl.m(l, h - 1));
            }
        }
        return str != null && str.length() > 0 && str.codePointAt(0) >= 12549 && str.codePointAt(0) <= 12585;
    }
}
