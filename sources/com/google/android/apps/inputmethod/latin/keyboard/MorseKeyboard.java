package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import android.media.ToneGenerator;
import android.os.Handler;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MorseKeyboard extends LatinPrimeKeyboard implements bpw {
    private static final ltg j = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/MorseKeyboard");
    private boolean F;
    private int G;
    private boolean H;
    private int I;
    private boolean J;
    private int K;
    private ToneGenerator L;
    private SoftKeyView M;
    private bqa N;
    public int b;
    public int i;
    private final bpx k;
    private final hxk n;
    private final bpu o;
    private boolean p;
    private boolean q;
    private int r;
    public final Handler a = new Handler();
    private final bqb l = new bqb(this);
    private final bqb m = new bqb(this);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorseKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        hxk a = hxk.a(context);
        bpu bpuVar = new bpu(hszVar.h());
        this.o = bpuVar;
        ddr ddrVar = ((LatinPrimeKeyboard) this).f;
        if (ddrVar instanceof bpv) {
            bpuVar.b = (bpv) ddrVar;
        } else {
            ((ltd) ((ltd) j.d()).k("com/google/android/apps/inputmethod/latin/keyboard/MorseKeyboard", "<init>", 106, "MorseKeyboard.java")).t("CandidatesViewController should be MorseCandidatesViewController!");
        }
        this.k = new bpx(this);
        this.n = a;
        this.J = this.t.aj(R.string.f162040_resource_name_obfuscated_res_0x7f1406ed);
    }

    private final boolean H(hfd hfdVar, bqb bqbVar, int i) {
        ToneGenerator toneGenerator;
        if (hfdVar.a == iah.PRESS) {
            if (hfdVar.j == 0 || hfdVar.k == this) {
                if (this.q && (toneGenerator = this.L) != null) {
                    toneGenerator.startTone(i, 150);
                }
                this.n.b(X(ice.BODY), 0);
            }
            if (hfdVar.j > 0) {
                return hfdVar.k != this;
            }
            if (this.p) {
                bqbVar.a = hfd.c(hfdVar);
                if (!bqbVar.b) {
                    MorseKeyboard morseKeyboard = bqbVar.c;
                    morseKeyboard.a.postDelayed(bqbVar, morseKeyboard.b);
                    bqbVar.b = true;
                }
            }
            return false;
        } else if (hfdVar.a != iah.UP) {
            return false;
        } else {
            if (this.p) {
                bqbVar.a();
            }
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0232, code lost:
        if (r0 != false) goto L16;
     */
    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r13) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.latin.keyboard.MorseKeyboard.c(hfd):boolean");
    }

    @Override // defpackage.bpw
    public final void d() {
        bqa bqaVar = this.N;
        if (bqaVar != null) {
            bqaVar.b();
        }
    }

    @Override // defpackage.bpw
    public final void f() {
        bqa bqaVar = this.N;
        if (bqaVar != null) {
            bqaVar.d();
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    protected final int fv(ice iceVar) {
        return (iceVar != ice.BODY || !this.J) ? R.id.f53790_resource_name_obfuscated_res_0x7f0b014b : R.id.f65960_resource_name_obfuscated_res_0x7f0b07ac;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final long fy() {
        long fy;
        long j2;
        EditorInfo editorInfo = this.D;
        if (editorInfo == null || !ham.E(editorInfo) || ham.e(this.D) != 64) {
            fy = super.fy();
            j2 = -1116691496961L;
        } else {
            this.K = this.D.imeOptions;
            this.D.imeOptions &= -1073741825;
            fy = super.fy();
            j2 = -1116691562497L;
        }
        return fy & j2;
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        ino inoVar = this.t;
        if (inoVar != null) {
            this.p = inoVar.aj(R.string.f162030_resource_name_obfuscated_res_0x7f1406ec);
            this.b = this.t.F(R.string.f162070_resource_name_obfuscated_res_0x7f1406f0, 500);
            this.i = this.t.F(R.string.f162060_resource_name_obfuscated_res_0x7f1406ef, 200);
            this.q = this.t.aj(R.string.f161040_resource_name_obfuscated_res_0x7f140688);
            int m = (int) (this.t.m(R.string.f162560_resource_name_obfuscated_res_0x7f140721, -1.0f) * 100.0f);
            this.r = m;
            if (m < 0) {
                this.r = 50;
            }
            this.F = this.t.aj(R.string.f162020_resource_name_obfuscated_res_0x7f1406eb);
            this.G = this.t.E(R.string.f161930_resource_name_obfuscated_res_0x7f1406e2);
            this.H = this.t.aj(R.string.f162050_resource_name_obfuscated_res_0x7f1406ee);
            this.I = this.t.E(R.string.f161940_resource_name_obfuscated_res_0x7f1406e3);
            this.J = this.t.aj(R.string.f162040_resource_name_obfuscated_res_0x7f1406ed);
        }
        this.L = new ToneGenerator(1, this.r);
        bpx bpxVar = this.k;
        boolean z = this.F;
        int i = this.G;
        boolean z2 = this.H;
        int i2 = this.I;
        bpxVar.f = z;
        bpxVar.h = i;
        bpxVar.g = z2;
        bpxVar.i = i2;
        lmz b = dmt.b(this.u, R.string.f161990_resource_name_obfuscated_res_0x7f1406e8);
        lmz b2 = dmt.b(this.u, R.string.f161960_resource_name_obfuscated_res_0x7f1406e5);
        bpx bpxVar2 = this.k;
        bpxVar2.l = b;
        bpxVar2.m = b2;
        aj(ice.BODY, true != this.J ? R.id.f53790_resource_name_obfuscated_res_0x7f0b014b : R.id.f65960_resource_name_obfuscated_res_0x7f0b07ac);
        A(obj);
        if (this.N == null) {
            this.N = new bqa(this.u, this, this.v);
        }
        this.k.o = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j2, long j3) {
        super.gl(j2, j3);
        bpx bpxVar = this.k;
        if (bpxVar.b != j3) {
            bpxVar.b = j3;
            bpxVar.e = bpxVar.b();
            bpxVar.f();
        }
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        this.l.a();
        this.m.a();
        ToneGenerator toneGenerator = this.L;
        if (toneGenerator != null) {
            toneGenerator.release();
            this.L = null;
        }
        bpx bpxVar = this.k;
        bpxVar.j.removeCallbacks(bpxVar.k);
        bpxVar.c();
        if (bpxVar.c != 0) {
            bpxVar.n.fp(iby.n, false);
            bpxVar.n.fp(bpxVar.c, true);
            bpxVar.c = 0L;
        }
        int i = this.K;
        if (i > 0) {
            this.D.imeOptions = i;
            this.K = 0;
        }
        bqa bqaVar = this.N;
        if (bqaVar != null) {
            bqaVar.b();
        }
        super.h();
    }

    @Override // defpackage.bpw
    public final void i(int i, iax iaxVar, Object obj, iah iahVar) {
        hfd d = hfd.d(new iay(i, iaxVar, obj));
        if (iahVar != null) {
            d.a = iahVar;
        }
        this.v.z(d);
    }

    @Override // defpackage.bpw
    public final void j(int i, Object obj) {
        c(hfd.d(new iay(i, null, obj)));
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard
    protected final ddr m() {
        return new bpv(this);
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void r(List list, hln hlnVar, boolean z) {
        super.r(list, hlnVar, z);
        this.k.f();
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard
    protected final void u(SoftKeyboardView softKeyboardView) {
        this.o.a = (SoftKeyView) softKeyboardView.findViewById(R.id.key_pos_morse_buffer);
        this.M = (SoftKeyView) softKeyboardView.findViewById(R.id.key_pos_ime_action);
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard
    protected final void v() {
        this.o.a = null;
        this.M = null;
    }
}
