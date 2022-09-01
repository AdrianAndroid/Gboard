package com.google.android.libraries.inputmethod.keyboard.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Keyboard extends AbstractKeyboard {
    public static final ltg A = ltg.j("com/google/android/libraries/inputmethod/keyboard/impl/Keyboard");
    public boolean C;
    public EditorInfo D;
    protected huk E;
    private int d;
    private final htu[] eZ = new htu[ice.values().length];
    private final boolean[] fi = new boolean[ice.values().length];
    private final htt e = new hts(this);
    private final htt f = new hug(this, 1);
    public long B = 0;
    private long c = 0;

    public Keyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        if (ibmVar.k != ibl.NONE) {
            this.E = huk.a(context, ibmVar.l);
        }
    }

    private final htu gq(icf icfVar, htt httVar) {
        if (icfVar == null || this.w == null) {
            return null;
        }
        return new htu(httVar, icfVar, new hud(this.u, this.v, this.w, icfVar, this));
    }

    @Override // defpackage.hsy
    public boolean B(CharSequence charSequence) {
        return false;
    }

    public boolean M(int i) {
        if (!this.C) {
            return i == 10 || i == 15 || i == 60 || i == 80;
        }
        return false;
    }

    @Override // defpackage.hsy
    public final View X(ice iceVar) {
        htu ah = ah(iceVar, true);
        if (ah != null) {
            return ah.d(this.v.e(iceVar, ah.a.c));
        }
        return null;
    }

    @Override // defpackage.hsy
    public final View Y(ice iceVar) {
        htu gq;
        htu ah = ah(iceVar, true);
        ibm ibmVar = this.w;
        if (ibmVar == null || ah == null || ah.c() == R.id.f53790_resource_name_obfuscated_res_0x7f0b014b || (gq = gq(ibmVar.b(iceVar, R.id.f53790_resource_name_obfuscated_res_0x7f0b014b), this.f)) == null) {
            return X(iceVar);
        }
        gq.j(this.B);
        View d = gq.d(this.v.e(iceVar, gq.a.c));
        gq.close();
        return d;
    }

    @Override // defpackage.hsy
    public final void aa() {
        this.d++;
    }

    @Override // defpackage.hsy
    public final void ab(ice iceVar) {
        htu ah = ah(iceVar, false);
        if (ah != null) {
            ah.g();
        }
    }

    @Override // defpackage.hsy
    public final void ac() {
        int i = this.d;
        if (i > 0) {
            int i2 = i - 1;
            this.d = i2;
            if (i2 != 0) {
                return;
            }
            ak(this.B);
        }
    }

    @Override // defpackage.hsy
    public final boolean af(long j) {
        htu[] htuVarArr;
        for (htu htuVar : this.eZ) {
            if (htuVar != null && (htuVar.b & j) == j) {
                return true;
            }
        }
        return false;
    }

    public final htu ah(ice iceVar, boolean z) {
        if (this.w != null && !this.fi[iceVar.ordinal()] && z) {
            htu gq = gq(this.w.b(iceVar, fv(iceVar)), this.e);
            this.eZ[iceVar.ordinal()] = gq;
            this.fi[iceVar.ordinal()] = true;
            if (gq != null) {
                gq.j(this.B);
            }
        }
        htu htuVar = this.eZ[iceVar.ordinal()];
        if (htuVar != null || !z) {
            return htuVar;
        }
        ((ltd) ((ltd) A.d()).k("com/google/android/libraries/inputmethod/keyboard/impl/Keyboard", "getKeyboardViewHelper", 612, "Keyboard.java")).J("null helper is returned: keyboardDef=%s, type=%s, helpersCreated=%s, ", this.w, iceVar, Arrays.toString(this.eZ));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String ai() {
        hqt m = this.v.m();
        if (m != null) {
            return m.n(0);
        }
        return null;
    }

    public final void aj(ice iceVar, int i) {
        htu ah = ah(iceVar, false);
        if (ah == null || ah.c() != i) {
            if (ah != null) {
                if (this.C) {
                    ah.f();
                }
                ah.close();
            }
            ibm ibmVar = this.w;
            htu gq = ibmVar != null ? gq(ibmVar.b(iceVar, i), this.e) : null;
            this.eZ[iceVar.ordinal()] = gq;
            this.fi[iceVar.ordinal()] = true;
            if (this.C) {
                if (gq != null) {
                    gq.e();
                }
                this.v.F(iceVar);
            }
            if (gq == null) {
                return;
            }
            gq.j(this.B);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ak(final long j) {
        htu[] htuVarArr;
        if (this.B != j) {
            lvw.e(new cae(this, 10));
            lvw.e(new lth() { // from class: htr
                @Override // defpackage.lth
                public final Object a() {
                    return iby.f(j);
                }
            });
            this.B = j;
        }
        if (this.d == 0 && this.C) {
            for (htu htuVar : this.eZ) {
                if (htuVar != null) {
                    htuVar.j(this.B);
                }
            }
        }
        long j2 = this.c;
        long j3 = this.B;
        if (j2 != j3) {
            this.c = j3;
            gl(j2, j3);
        }
    }

    public final void al(long j, long j2) {
        ak((j & (iby.o ^ (-1))) | j2);
    }

    public final boolean am(ice iceVar) {
        htu ah = ah(iceVar, true);
        return ah != null && ah.a.e;
    }

    protected final boolean an() {
        return fx().m() && this.z && !fx().n();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(defpackage.hfd r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.inputmethod.keyboard.impl.Keyboard.c(hfd):boolean");
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public void close() {
        int i = 0;
        while (true) {
            htu[] htuVarArr = this.eZ;
            if (i >= htuVarArr.length) {
                this.C = false;
                this.D = null;
                return;
            }
            htu htuVar = htuVarArr[i];
            if (htuVar != null) {
                htuVar.close();
                this.eZ[i] = null;
            }
            this.fi[i] = false;
            i++;
        }
    }

    public void fA(icf icfVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean fB(ice iceVar) {
        return am(iceVar);
    }

    @Override // defpackage.hsy
    public final void fp(long j, boolean z) {
        long j2 = this.B;
        ak(z ? j | j2 : (j ^ (-1)) & j2);
    }

    @Override // defpackage.hsy
    public final boolean fq() {
        return this.C;
    }

    @Override // defpackage.hsy
    public String fr() {
        String fs = fs();
        return fs == null ? "" : fs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String fs() {
        if (ibz.a.equals(this.s)) {
            iav iavVar = this.x;
            if (iavVar != null) {
                return iavVar.c(this.u);
            }
            return null;
        } else if (ibz.b.equals(this.s)) {
            return this.u.getString(R.string.f150320_resource_name_obfuscated_res_0x7f140191);
        } else {
            if (ibz.c.equals(this.s)) {
                return this.u.getString(R.string.f174870_resource_name_obfuscated_res_0x7f140c35);
            }
            if (ibz.d.equals(this.s)) {
                return this.u.getString(R.string.f166610_resource_name_obfuscated_res_0x7f1408ec);
            }
            if (ibz.e.equals(this.s)) {
                return this.u.getString(R.string.f151160_resource_name_obfuscated_res_0x7f1401ea);
            }
            if (!ibz.h.equals(this.s)) {
                return null;
            }
            return this.u.getString(R.string.f151640_resource_name_obfuscated_res_0x7f14021e);
        }
    }

    @Override // defpackage.hsy
    public boolean ft(hfd hfdVar) {
        return false;
    }

    protected int fv(ice iceVar) {
        return R.id.f53790_resource_name_obfuscated_res_0x7f0b014b;
    }

    @Override // defpackage.hsy
    public void fw(ice iceVar, View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r2 != 208) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long fy() {
        /*
            r7 = this;
            long r0 = r7.y
            hsz r2 = r7.v
            r3 = 0
            if (r2 == 0) goto Ld
            long r5 = r2.c()
            goto Le
        Ld:
            r5 = r3
        Le:
            long r0 = r0 | r5
            ibm r2 = r7.w
            if (r2 == 0) goto L15
            long r3 = r2.e
        L15:
            long r0 = r0 | r3
            android.view.inputmethod.EditorInfo r2 = r7.D
            if (r2 != 0) goto L1b
            return r0
        L1b:
            boolean r2 = defpackage.ham.E(r2)
            r3 = 32
            r4 = 16
            if (r2 == 0) goto L41
            android.view.inputmethod.EditorInfo r2 = r7.D
            int r2 = defpackage.ham.e(r2)
            if (r2 == r4) goto L3e
            if (r2 == r3) goto L3b
            r5 = 64
            if (r2 == r5) goto L38
            r5 = 208(0xd0, float:2.91E-43)
            if (r2 == r5) goto L3b
            goto L41
        L38:
            long r5 = defpackage.iby.e
            goto L40
        L3b:
            long r5 = defpackage.iby.b
            goto L40
        L3e:
            long r5 = defpackage.iby.a
        L40:
            long r0 = r0 | r5
        L41:
            android.view.inputmethod.EditorInfo r2 = r7.D
            boolean r2 = defpackage.ham.L(r2)
            if (r2 == 0) goto L4d
            r5 = 65536(0x10000, double:3.2379E-319)
            long r0 = r0 | r5
        L4d:
            android.view.inputmethod.EditorInfo r2 = r7.D
            boolean r2 = defpackage.ham.F(r2)
            if (r2 == 0) goto L66
            android.view.inputmethod.EditorInfo r2 = r7.D
            int r2 = defpackage.ham.e(r2)
            if (r2 == r4) goto L63
            if (r2 == r3) goto L60
            goto L66
        L60:
            long r2 = defpackage.iby.d
            goto L65
        L63:
            long r2 = defpackage.iby.c
        L65:
            long r0 = r0 | r2
        L66:
            android.view.inputmethod.EditorInfo r2 = r7.D
            boolean r2 = defpackage.ham.v(r2)
            if (r2 == 0) goto L8c
            android.view.inputmethod.EditorInfo r2 = r7.D
            int r2 = defpackage.ham.a(r2)
            switch(r2) {
                case 2: goto L89;
                case 3: goto L86;
                case 4: goto L83;
                case 5: goto L80;
                case 6: goto L7d;
                case 7: goto L7a;
                default: goto L77;
            }
        L77:
            long r2 = defpackage.iby.g
            goto L8e
        L7a:
            long r2 = defpackage.iby.m
            goto L8e
        L7d:
            long r2 = defpackage.iby.l
            goto L8e
        L80:
            long r2 = defpackage.iby.k
            goto L8e
        L83:
            long r2 = defpackage.iby.j
            goto L8e
        L86:
            long r2 = defpackage.iby.i
            goto L8e
        L89:
            long r2 = defpackage.iby.h
            goto L8e
        L8c:
            long r2 = defpackage.iby.g
        L8e:
            long r0 = r0 | r2
            android.view.inputmethod.EditorInfo r2 = r7.D
            boolean r2 = defpackage.ham.u(r2)
            if (r2 == 0) goto L9b
            r2 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 | r2
        L9b:
            android.view.inputmethod.EditorInfo r2 = r7.D
            boolean r2 = defpackage.ham.t(r2)
            if (r2 == 0) goto La7
            r2 = 262144(0x40000, double:1.295163E-318)
            long r0 = r0 | r2
        La7:
            hsz r2 = r7.v
            boolean r2 = r2.X()
            if (r2 == 0) goto Lb5
            r2 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r0 = r0 | r2
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.inputmethod.keyboard.impl.Keyboard.fy():long");
    }

    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
    }

    @Override // defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        htu[] htuVarArr;
        htu[] htuVarArr2;
        igx[] igxVarArr;
        this.C = true;
        this.D = editorInfo;
        long fy = fy();
        ibm ibmVar = this.w;
        if (ibmVar != null && ibmVar.h != 0) {
            String str = ibmVar.i;
            if (!TextUtils.isEmpty(str) && this.t.ai(str)) {
                long I = this.t.I(str);
                long j = this.w.h;
                fy = (fy & (j ^ (-1))) | (I & j);
            }
        }
        ak(fy | this.B);
        for (ice iceVar : ice.values()) {
            gk(iceVar);
        }
        if (an()) {
            fx().c(q());
        }
        for (htu htuVar : this.eZ) {
            if (htuVar != null) {
                htuVar.e();
            }
        }
        for (htu htuVar2 : this.eZ) {
            if (htuVar2 != null) {
                hud hudVar = htuVar2.c;
                EditorInfo editorInfo2 = this.D;
                EditorInfo editorInfo3 = hudVar.f;
                if (editorInfo3 == null || !editorInfo3.equals(editorInfo2)) {
                    for (igx igxVar : hudVar.g) {
                        if (igxVar != null) {
                            igxVar.gQ(editorInfo2);
                        }
                    }
                    hudVar.f = editorInfo2;
                }
            }
        }
    }

    @Override // defpackage.hsy
    public final long gi() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public hth gj(ice iceVar) {
        if (fB(iceVar)) {
            return hth.SHOW_MANDATORY;
        }
        return hth.HIDE;
    }

    public final void gk(ice iceVar) {
        if (this.C) {
            this.v.P(this.s, iceVar, gj(iceVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gl(long j, long j2) {
        hsz hszVar = this.v;
        if (hszVar != null) {
            hszVar.E(j, j2);
        }
    }

    @Override // defpackage.hsy
    public void h() {
        htu[] htuVarArr;
        if (!this.C) {
            return;
        }
        this.C = false;
        this.d = 0;
        z(false);
        y(null);
        ibm ibmVar = this.w;
        if (ibmVar != null && ibmVar.h != 0) {
            if (TextUtils.isEmpty(ibmVar.i)) {
                ((ltd) ((ltd) A.c()).k("com/google/android/libraries/inputmethod/keyboard/impl/Keyboard", "savePersistentStates", 735, "Keyboard.java")).w("PersistentStatesPrefKey is not specified for keyboard: %s", jbi.h(this.w.b));
            } else {
                ino inoVar = this.t;
                ibm ibmVar2 = this.w;
                inoVar.i(ibmVar2.i, ibmVar2.h & this.B);
            }
        }
        ibm ibmVar3 = this.w;
        if (ibmVar3 != null) {
            ak(this.B & ibmVar3.j);
        }
        this.c = 0L;
        for (htu htuVar : this.eZ) {
            if (htuVar != null) {
                htuVar.f();
            }
        }
        huk hukVar = this.E;
        if (hukVar != null) {
            hukVar.d();
        }
        if (!an()) {
            return;
        }
        fx().h(p());
    }

    protected String p() {
        String fs = fs();
        return !TextUtils.isEmpty(fs) ? this.u.getString(R.string.f154900_resource_name_obfuscated_res_0x7f14039c, fs) : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String q() {
        String fs = fs();
        return !TextUtils.isEmpty(fs) ? this.u.getString(R.string.f166330_resource_name_obfuscated_res_0x7f1408cf, fs) : "";
    }

    @Override // defpackage.hsy
    public void r(List list, hln hlnVar, boolean z) {
    }

    @Override // defpackage.hsy
    public void y(List list) {
    }

    @Override // defpackage.hsy
    public void z(boolean z) {
    }

    public final int gh() {
        iav iavVar = this.x;
        jav javVar = iavVar != null ? iavVar.e : jav.d;
        if (javVar.D()) {
            hqt m = this.v.m();
            javVar = m != null ? m.i() : null;
            if (javVar == null) {
                javVar = jav.d;
            }
        }
        return javVar.a();
    }
}
