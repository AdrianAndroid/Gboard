package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* renamed from: hpr  reason: default package */
/* loaded from: classes.dex */
public final class hpr {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputconnection/InputConnectionAction");
    public static final hhl b = hhq.a("use_set_ime_consumes_input_api", false);
    public static final ExtractedTextRequest c = new ExtractedTextRequest();
    public hpu d;
    public final hqg e;
    public final idk f;
    public final mkr g;
    public int h = 0;
    public final opu i;

    public hpr(hpu hpuVar, opu opuVar, hqg hqgVar, idk idkVar, mkr mkrVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = hpuVar;
        this.i = opuVar;
        this.e = hqgVar;
        this.f = idkVar;
        this.g = mkrVar;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    private final void q(mko mkoVar) {
        kcu.U(mkoVar, new fkb(this, 3), gyc.a);
    }

    public final InputConnection a() {
        hpu hpuVar = this.d;
        if (hpuVar != null) {
            return hpuVar.b();
        }
        return null;
    }

    public final void c(String str) {
        InputConnection a2;
        int i = this.h + 1;
        this.h = i;
        if (i <= 1 && (a2 = a()) != null) {
            hqg hqgVar = this.e;
            if (hqgVar.u == 0) {
                hqgVar.w(hqe.IME, hqgVar.c(), hqgVar.d(), hqgVar.a(), hqgVar.b());
                if (hqgVar.v) {
                    hqa hqaVar = hqgVar.k;
                    hqaVar.c = true;
                    hqaVar.d = false;
                }
            }
            hqgVar.u++;
            this.g.execute(new gxi(a2, str, 16));
        }
    }

    public final void d(CorrectionInfo correctionInfo) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        this.g.execute(new gxi(a2, correctionInfo, 15));
    }

    public final void e(CharSequence charSequence, int i) {
        if (a() == null) {
            return;
        }
        this.e.q(charSequence, i);
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        q(this.g.hP(new ov(a2, charSequence, i, 9)));
    }

    public final void f(int i, int i2) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        c("ICA.deleteRange");
        int i3 = i2 - i;
        this.e.t(i2, i2);
        this.e.r(i3, 0);
        this.g.execute(new esy(a2, i2, i3, 4));
        p(null, null, "ICA.deleteRange");
    }

    public final void g(int i, int i2) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        this.e.r(i, i2);
        this.g.execute(new esy(a2, i, i2, 6));
    }

    public final void h(String str) {
        p(null, null, str);
    }

    public final void i() {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        hqg hqgVar = this.e;
        int a3 = hqgVar.a();
        hqgVar.w(hqe.IME, hqgVar.c(), hqgVar.d(), 0, 0);
        if (hqgVar.v && a3 != 0) {
            hqgVar.o(hqe.IME);
        }
        this.g.execute(new hob(a2, 9));
    }

    public final void j(int i, int i2, int i3) {
        int i4;
        if (a() == null) {
            return;
        }
        hqg hqgVar = this.e;
        if (i == 67) {
            hqd g = hqgVar.g();
            if (!g.a()) {
                i4 = g.a;
            } else {
                int i5 = g.a;
                if (i5 != 0) {
                    i4 = i5 - 1;
                }
            }
            int i6 = i4;
            hqgVar.w(hqe.DELETE, i6, 0, hqgVar.a(), hqgVar.b());
            if (hqgVar.v) {
                hqgVar.u(i6, g.b, "");
                hqgVar.o(hqe.DELETE);
            }
        } else if (i >= 7 && i <= 16) {
            hqgVar.q(Integer.toString(i - 7), 1);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        k(new KeyEvent(uptimeMillis, uptimeMillis, 0, i, 0, i2, -1, 0, 6, 257));
        k(new KeyEvent(uptimeMillis, SystemClock.uptimeMillis(), 1, i, 0, i3, -1, 0, 6, 257));
    }

    public final void k(KeyEvent keyEvent) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        q(this.g.hP(new gxi(a2, keyEvent, 14)));
    }

    public final void l(int i, int i2) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        hqg hqgVar = this.e;
        int c2 = hqgVar.c();
        int d = hqgVar.d();
        hqgVar.w(hqe.IME, c2, d, i2 - i, (c2 - d) - i);
        if (hqgVar.v) {
            hqgVar.o(hqe.IME);
        }
        this.g.execute(new esy(a2, i, i2, 7));
    }

    public final void m(CharSequence charSequence, int i, Object obj) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        this.e.s(charSequence, i);
        q(this.g.hP(new hpq(a2, charSequence, i, obj, 0)));
    }

    public final void n(CharSequence charSequence, CharSequence charSequence2, int i) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            m(charSequence, 1, null);
            return;
        }
        c("ICA.setComposingTextBeforeAndAfter");
        CharSequence concat = TextUtils.concat(charSequence, charSequence2);
        int length = i + charSequence.length();
        this.e.s(concat, 1);
        this.e.t(length, length);
        this.g.execute(new ov(a2, concat, length, 10));
        h("ICA.setComposingTextBeforeAndAfter");
    }

    public final void o(int i, int i2) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        this.e.t(i, i2);
        this.g.execute(new esy(a2, i, i2, 5));
    }

    public final void p(idn idnVar, ids idsVar, String str) {
        InputConnection a2 = a();
        if (a2 == null) {
            return;
        }
        try {
            int i = this.h - 1;
            this.h = i;
            if (i > 0) {
                if (idnVar == null) {
                    return;
                }
                idnVar.a();
                return;
            }
            boolean z = false;
            if (i < 0) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputconnection/InputConnectionAction", "endBatchEdit", 295, "InputConnectionAction.java")).u("Ignore unmatched endBatchEdit(): %s", this.h);
                this.h = 0;
                if (idnVar == null) {
                    return;
                }
                idnVar.a();
                return;
            }
            hqg hqgVar = this.e;
            int i2 = hqgVar.u - 1;
            hqgVar.u = i2;
            if (i2 < 0) {
                hqgVar.u = 0;
            } else if (i2 <= 0) {
                hqc hqcVar = (hqc) hqgVar.o.pollLast();
                if (hqcVar != null) {
                    if (hqcVar.c == hqgVar.c() && hqcVar.d == hqgVar.d() && hqcVar.e == hqgVar.a() && hqcVar.f == hqgVar.b()) {
                        hqcVar.a();
                    } else {
                        hqgVar.o.offer(hqcVar);
                        z = true;
                    }
                }
                if (hqgVar.v && (hqgVar.k.g() || z)) {
                    hqgVar.o(hqe.IME);
                }
            }
            this.g.execute(new hpm(this, a2, idnVar, idsVar, str, 0));
            if (idnVar == null) {
                return;
            }
            idnVar.a();
        } catch (Throwable th) {
            if (idnVar != null) {
                idnVar.a();
            }
            throw th;
        }
    }
}
