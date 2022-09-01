package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmmgesture.HmmGestureDecoder;
import com.google.android.apps.inputmethod.libs.hmmgesture.JniUtil;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractHmmPinyinDecodeProcessor extends AbstractHmmChineseDecodeProcessor {
    protected dkk m;
    private boolean n;
    private hln v;
    private boolean w;
    private boolean x;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void J(ibz ibzVar, boolean z) {
        super.J(ibzVar, z);
        Context context = this.o;
        String y = this.r.y(R.string.f162290_resource_name_obfuscated_res_0x7f140706);
        boolean z2 = false;
        if (y != null && (y.equals(context.getString(R.string.f160210_resource_name_obfuscated_res_0x7f140632)) || y.equals(context.getString(R.string.f160220_resource_name_obfuscated_res_0x7f140633)))) {
            z2 = true;
        }
        this.n = z2;
        au(288230376151711744L, z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void L() {
        super.L();
        dkk dkkVar = this.m;
        if (dkkVar != null) {
            dkkVar.f();
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, defpackage.hlu
    public final void N(long j) {
        this.w = false;
        this.v = null;
        super.N(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final boolean V(hln hlnVar, boolean z) {
        boolean V = super.V(hlnVar, z);
        if (z) {
            this.w = false;
            this.v = null;
        } else {
            hln hlnVar2 = this.v;
            if (hlnVar2 == null || Objects.equals(hlnVar, hlnVar2)) {
                this.w = false;
            } else {
                this.w = true;
            }
            this.v = hlnVar;
        }
        return V;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        this.m = b(context, this, this.r);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final long ae(String[] strArr) {
        HmmGestureDecoder hmmGestureDecoder = this.m.a;
        if (JniUtil.a) {
            return hmmGestureDecoder.nativeGetFilteredResults(hmmGestureDecoder.a, strArr);
        }
        return 0L;
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final String ag(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            sb.append(" ");
            sb.append(charAt);
        }
        return this.o.getString(R.string.f163290_resource_name_obfuscated_res_0x7f140783, sb.toString());
    }

    protected abstract dkk b(Context context, hlu hluVar, ino inoVar);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return dxu.l(this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h() {
        if (X("SPACE")) {
            return true;
        }
        as(null, 1, true);
        return false;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void k() {
        super.k();
        dkk dkkVar = this.m;
        if (dkkVar != null) {
            dkkVar.c();
            this.m.b = this.i;
        }
        this.x = this.r.aj(R.string.f160480_resource_name_obfuscated_res_0x7f14064d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void m() {
        super.m();
        dkk dkkVar = this.m;
        if (dkkVar != null) {
            dkkVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void n() {
        super.n();
        dkk dkkVar = this.m;
        if (dkkVar != null) {
            dkkVar.b();
        }
    }

    @Override // defpackage.hlu
    public final boolean o(iay iayVar) {
        if (!btp.a(iayVar) || (!this.x && Character.isUpperCase(((String) iayVar.e).charAt(0)))) {
            return this.n && this.j && btp.b(iayVar) && ";".equals(iayVar.e);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (P(r3) == false) goto L33;
     */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p(defpackage.hfd r7) {
        /*
            r6 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            dkk r3 = r6.m     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L22
            boolean r3 = r3.h(r7)     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto Le
            goto L22
        Le:
            idk r3 = r6.af()
            dja r4 = defpackage.dja.EVENT_HANDLED_BY_ENGINE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r0[r2] = r7
            r3.e(r4, r0)
            return r2
        L22:
            iah r3 = r7.a     // Catch: java.lang.Throwable -> Lbd
            iah r4 = defpackage.iah.DOWN     // Catch: java.lang.Throwable -> Lbd
            if (r3 == r4) goto La9
            iah r3 = r7.a     // Catch: java.lang.Throwable -> Lbd
            iah r4 = defpackage.iah.UP     // Catch: java.lang.Throwable -> Lbd
            if (r3 != r4) goto L30
            goto La9
        L30:
            iay[] r3 = r7.b     // Catch: java.lang.Throwable -> Lbd
            r3 = r3[r1]     // Catch: java.lang.Throwable -> Lbd
            boolean r4 = r6.o(r3)     // Catch: java.lang.Throwable -> Lbd
            if (r4 == 0) goto L3f
            boolean r3 = r6.R(r7)     // Catch: java.lang.Throwable -> Lbd
            goto L95
        L3f:
            int r4 = r7.g     // Catch: java.lang.Throwable -> Lbd
            int r4 = r3.c     // Catch: java.lang.Throwable -> Lbd
            r5 = 67
            if (r4 != r5) goto L4c
            boolean r3 = r6.W()     // Catch: java.lang.Throwable -> Lbd
            goto L95
        L4c:
            r6.B()     // Catch: java.lang.Throwable -> Lbd
            int r4 = r3.c     // Catch: java.lang.Throwable -> Lbd
            r5 = 62
            if (r4 == r5) goto L91
            r5 = 66
            if (r4 == r5) goto L6d
            boolean r4 = r6.ab(r3)     // Catch: java.lang.Throwable -> Lbd
            if (r4 != 0) goto L6b
            boolean r4 = r6.Q(r3)     // Catch: java.lang.Throwable -> Lbd
            if (r4 != 0) goto L6b
            boolean r3 = r6.P(r3)     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L8f
        L6b:
            r3 = 1
            goto L95
        L6d:
            boolean r3 = r6.w     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto L78
            boolean r3 = r6.Z()     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L78
            goto L6b
        L78:
            boolean r3 = r6.w     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L8b
            boolean r3 = r6.ao()     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L8b
            java.lang.String r3 = "ENTER"
            boolean r3 = r6.X(r3)     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L8b
            goto L6b
        L8b:
            r3 = 0
            r6.as(r3, r2, r2)     // Catch: java.lang.Throwable -> Lbd
        L8f:
            r3 = 0
            goto L95
        L91:
            boolean r3 = r6.h()     // Catch: java.lang.Throwable -> Lbd
        L95:
            idk r4 = r6.af()
            dja r5 = defpackage.dja.EVENT_HANDLED_BY_ENGINE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r0[r2] = r7
            r4.e(r5, r0)
            return r3
        La9:
            idk r3 = r6.af()
            dja r4 = defpackage.dja.EVENT_HANDLED_BY_ENGINE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r7
            r3.e(r4, r0)
            return r1
        Lbd:
            r3 = move-exception
            idk r4 = r6.af()
            dja r5 = defpackage.dja.EVENT_HANDLED_BY_ENGINE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r7
            r4.e(r5, r0)
            goto Ld3
        Ld2:
            throw r3
        Ld3:
            goto Ld2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.pinyin.AbstractHmmPinyinDecodeProcessor.p(hfd):boolean");
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl s(Context context) {
        return dxu.l(context).r.M(3);
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl t(Context context) {
        return dxu.l(context).P();
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int u() {
        return a() ? 2 : 1;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int v() {
        return 1;
    }
}
