package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dtp  reason: default package */
/* loaded from: classes.dex */
public final class dtp {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaInputManager");
    public final Context b;
    public final idk c;
    public final dto d;
    public final jbw e;
    public final hbd f;
    public final dtu g;
    public final Executor h;
    public final dup i;
    public boolean j;
    public boolean k;
    public boolean l = false;
    public boolean m = false;
    public String n;
    private final dud o;
    private final hfy p;
    private final dtn q;
    private final EditorInfo r;
    private final dxe s;

    public dtp(Context context, dud dudVar, idk idkVar, dxe dxeVar, dtn dtnVar, hfy hfyVar, dto dtoVar, jbw jbwVar, EditorInfo editorInfo, dup dupVar, dtu dtuVar, Executor executor, hbd hbdVar, byte[] bArr) {
        this.o = dudVar;
        this.c = idkVar;
        this.s = dxeVar;
        this.q = dtnVar;
        this.p = hfyVar;
        this.b = context;
        this.d = dtoVar;
        this.e = jbwVar;
        this.r = editorInfo;
        this.i = dupVar;
        this.g = dtuVar;
        this.h = executor;
        this.f = hbdVar;
    }

    public static boolean l() {
        return dsz.b().c;
    }

    public final dvj a() {
        dvi a2 = dvj.a();
        hpy a3 = this.d.a();
        if (a3 == null) {
            a2.e("");
            a2.d("");
            a2.f("");
            a2.c(false);
        } else if (a3.f()) {
            a2.e(a3.d().toString());
            a2.f(a3.b().toString());
            a2.d(a3.c().toString());
            a2.c(false);
        } else {
            if (a3.e()) {
                int intValue = ((Long) dsu.l.c()).intValue();
                int i = a3.f;
                boolean z = i < a3.d && a3.g > a3.e;
                if (intValue == 1 || (intValue == 2 && z)) {
                    a2.e(a3.c.subSequence(0, i).toString());
                    a2.f(a3.c.subSequence(a3.f, a3.g).toString());
                    CharSequence charSequence = a3.c;
                    a2.d(charSequence.subSequence(a3.g, charSequence.length()).toString());
                    a2.c(true);
                }
            }
            a2.e(a3.c.subSequence(0, a3.e).toString());
            a2.f("");
            CharSequence charSequence2 = a3.c;
            a2.d(charSequence2.subSequence(a3.e, charSequence2.length()).toString());
            a2.c(false);
        }
        int i2 = 3;
        if (ham.a(this.r) != 3 && (this.r.inputType & 8192) == 0 && (this.r.inputType & 4096) == 0 && !((dtv) this.d).a.b().b && this.s.a()) {
            if (ham.G(this.r)) {
                i2 = 5;
            } else if (ham.H(this.r)) {
                i2 = 4;
            } else {
                i2 = han.GMAIL.a(this.r) ? 6 : 8;
            }
        }
        a2.a = i2;
        return a2.a();
    }

    public final void b(String str) {
        if (str.isEmpty()) {
            return;
        }
        this.c.e(dua.NGA_TEXT_COMMITTED, str);
        dud dudVar = this.o;
        hpy b = hqj.b();
        if (b == null) {
            ((ltd) ((ltd) dud.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/logging/PunctuationLogger", "onNgaTextCommitted", 173, "PunctuationLogger.java")).t("Input context unexpectedly null");
            return;
        }
        dudVar.e.set(duc.a(b));
        dudVar.c.f(dudVar.d);
    }

    public final void c(boolean z) {
        if (z) {
            i();
        } else {
            j();
        }
    }

    public final void d(String str) {
        this.p.z(hfd.d(new iay(-10018, null, str)));
    }

    public final void e() {
        if (this.k) {
            this.q.b(this.b, this.r);
            this.e.r();
        }
        this.k = false;
    }

    public final void f() {
        if (!this.k) {
            this.k = true;
            dtn dtnVar = this.q;
            Context context = this.b;
            EditorInfo editorInfo = this.r;
            if (!dtnVar.a) {
                dtn.a("com.google.android.apps.inputmethod.DICTATION_ACTIVE", context, editorInfo);
            }
            dtnVar.a = true;
            this.e.s();
        }
    }

    public final void g(KeyEvent keyEvent) {
        this.p.z(hfd.d(new iay(-10140, null, keyEvent)));
    }

    public final void h(int i) {
        hfy hfyVar = this.p;
        hfd b = hfd.b();
        b.a = iah.PRESS;
        b.p = 7;
        b.j(new iay(i, null, null));
        hfyVar.z(b);
    }

    public final void i() {
        if (this.j) {
            return;
        }
        f();
        this.j = true;
    }

    public final void j() {
        if (!this.j) {
            return;
        }
        if (!TextUtils.isEmpty(this.n)) {
            b(this.n);
            this.n = "";
        }
        this.l = false;
        if (this.k) {
            this.q.b(this.b, this.r);
        }
        this.e.t();
        this.k = false;
        this.j = false;
    }

    public final boolean k() {
        return !this.d.a().g();
    }
}
