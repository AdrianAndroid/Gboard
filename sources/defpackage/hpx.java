package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: hpx  reason: default package */
/* loaded from: classes.dex */
public final class hpx implements hpl, hpt {
    public final hqg e;
    public hpu f;
    public final hpr g;
    public final idk h;
    public long i;
    public final int[] j;
    private static final ltg k = ltg.j("com/google/android/libraries/inputmethod/inputconnection/InputConnectionWrapper");
    static final hhl a = hhq.f("wait_ic_call_timeout", 200);
    static final hhl b = hhq.f("wait_get_text_ic_call_timeout", 500);
    public static final hhl c = hhq.f("wait_long_ic_call_timeout", 1000);
    public static final hhl d = hhq.f("get_text_ic_timeout_tolerant_times", -1);

    public hpx(hqf hqfVar, hqb hqbVar, opu opuVar, idk idkVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        mkr hpkVar;
        if (z) {
            hpkVar = kcu.C();
        } else {
            hpkVar = new hpk();
        }
        this.i = -1L;
        this.j = new int[1];
        this.h = idkVar;
        hqg hqgVar = new hqg(hqfVar, hqbVar, new opu(this), idkVar, null, null);
        this.e = hqgVar;
        this.g = new hpr(this.f, opuVar, hqgVar, idkVar, hpkVar, null, null, null, null, null);
    }

    public static CharSequence f(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public static Object g(mko mkoVar, Object obj, boolean z, idk idkVar, int i) {
        return h(mkoVar, obj, z, idkVar, i, ((Long) a.c()).longValue(), null, null);
    }

    public static Object h(mko mkoVar, Object obj, boolean z, idk idkVar, int i, long j, Runnable runnable, Runnable runnable2) {
        try {
            Object obj2 = mkoVar.get(j, TimeUnit.MILLISECONDS);
            if (runnable != null) {
                runnable.run();
            }
            return obj2;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (z) {
                mkoVar.cancel(false);
            }
            if (idkVar != null) {
                idkVar.e(hps.IC_WAIT_FUTURE_TIMEOUT, Integer.valueOf(i));
            }
            ((ltd) ((ltd) ((ltd) k.c()).i(e)).k("com/google/android/libraries/inputmethod/inputconnection/InputConnectionWrapper", "waitForInputConnectionFutureInternal", (char) 1521, "InputConnectionWrapper.java")).t("Failed to get the input connection call's result.");
            if (runnable2 != null) {
                runnable2.run();
            }
            return obj;
        }
    }

    public static void l(idk idkVar, ids idsVar, long j) {
        if (idkVar != null) {
            idkVar.g(idsVar, j);
        }
        if (j > 100) {
            ((ltd) ((ltd) k.d()).k("com/google/android/libraries/inputmethod/inputconnection/InputConnectionWrapper", "recordDuration", 1442, "InputConnectionWrapper.java")).F("IPC %s took %d ms", idsVar, j);
        }
    }

    public static boolean t(int i, CharSequence charSequence) {
        return i >= 7 && i <= 16 && ((charSequence == null || charSequence.length() != 1) ? (char) 0 : charSequence.charAt(0)) + 65488 == i + (-7);
    }

    @Override // defpackage.hpl
    public final void a(String str, Bundle bundle) {
        hpr hprVar = this.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            return;
        }
        hprVar.g.execute(new epv(a2, str, bundle, 12));
    }

    @Override // defpackage.hpt
    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        hqe hqeVar;
        boolean z;
        hqg hqgVar = this.e;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int min2 = Math.min(i3, i4);
        int max2 = Math.max(i3, i4);
        int min3 = Math.min(i5, i6);
        int max3 = Math.max(i5, i6);
        int i7 = max2 - min2;
        int i8 = (min3 < 0 || max3 < 0) ? 0 : max3 - min3;
        int i9 = (min3 < 0 || max3 < 0) ? 0 : min2 - min3;
        if (min3 != max3 || max3 <= 0) {
            hqe hqeVar2 = hqe.OTHER;
            if (min == -1 && max == -1) {
                hqgVar.o.clear();
                hqeVar = hqe.IME;
                min = -1;
                max = -1;
            } else {
                while (true) {
                    if (hqgVar.o.isEmpty() || (hqgVar.u != 0 && hqgVar.o.size() == 1)) {
                        break;
                    }
                    hqc hqcVar = (hqc) hqgVar.o.poll();
                    if (hqcVar != null) {
                        if (hqcVar.c != max2 || hqcVar.d != i7 || hqcVar.e != i8) {
                            hqcVar.a();
                        } else {
                            hqeVar2 = hqcVar.b;
                            hqcVar.a();
                            break;
                        }
                    }
                }
                hqeVar = hqeVar2;
            }
            hqgVar.r = min2;
            hqgVar.s = max2;
            hqgVar.p = i8;
            hqgVar.q = i9;
            hqgVar.t = i7;
            if (min2 == 0) {
                z = max2 == 0 && min3 <= 0 && max3 <= 0;
                min2 = 0;
            } else {
                z = false;
            }
            hqgVar.p(hqeVar, z, min, max, min2, max2, min3, max3);
            return;
        }
        hqgVar.o.clear();
        hqgVar.r = min2;
        hqgVar.s = max2;
        hqgVar.p = i8;
        hqgVar.q = i9;
        hqgVar.t = i7;
        hqgVar.p(hqe.IME, false, min, max, min2, max2, min3, max3);
    }

    public final EditorInfo c() {
        hpu hpuVar = this.f;
        if (hpuVar != null) {
            return hpuVar.a();
        }
        return null;
    }

    public final CharSequence d(int i, int i2) {
        return this.e.j(i, i2, 0);
    }

    public final CharSequence e(int i, int i2) {
        return this.e.k(i, i2, 0);
    }

    public final void i(CharSequence charSequence, int i) {
        this.g.e(charSequence, i);
    }

    public final void j() {
        this.g.i();
    }

    public final void k(Context context, EditorInfo editorInfo, boolean z) {
        this.i = ((Long) d.c()).longValue();
        hpr hprVar = this.g;
        if (hprVar != null) {
            hprVar.h = 0;
            if (editorInfo != null && (hprVar.g instanceof hpk)) {
                if (TextUtils.equals(editorInfo.packageName, context.getPackageName())) {
                    ((hpk) hprVar.g).b(true);
                } else {
                    ((hpk) hprVar.g).b(false);
                }
            }
        }
        hqg hqgVar = this.e;
        hqgVar.o.clear();
        hqgVar.p = 0;
        hqgVar.q = 0;
        hqgVar.r = editorInfo != null ? editorInfo.initialSelStart : 0;
        int i = editorInfo != null ? editorInfo.initialSelEnd : 0;
        hqgVar.s = i;
        hqgVar.t = i - hqgVar.r;
        hqgVar.u = 0;
        hqgVar.i = ((Long) hqg.b.c()).intValue();
        hqgVar.k.g = ham.U(editorInfo);
        if (editorInfo == null || Build.VERSION.SDK_INT < 30 || (z && (!li.e() || !((Boolean) hqg.d.c()).booleanValue()))) {
            hqgVar.v();
            return;
        }
        try {
            CharSequence initialTextBeforeCursor = editorInfo.getInitialTextBeforeCursor(hqgVar.i, 1);
            CharSequence initialSelectedText = editorInfo.getInitialSelectedText(1);
            CharSequence initialTextAfterCursor = editorInfo.getInitialTextAfterCursor(hqgVar.i, 1);
            if (initialTextBeforeCursor == null || initialTextAfterCursor == null) {
                hqgVar.v();
            } else {
                hqgVar.w = new hqk(initialTextBeforeCursor, initialTextAfterCursor, hqg.l(initialSelectedText), Math.max(editorInfo.initialSelStart - initialTextBeforeCursor.length(), -1));
            }
        } catch (RuntimeException e) {
            hqgVar.v();
            ((ltd) ((ltd) ((ltd) hqg.a.c()).i(e)).k("com/google/android/libraries/inputmethod/inputcontext/InputContextChangeTracker", "onStartInput", (char) 427, "InputContextChangeTracker.java")).t("Failed to get initial text info.");
            hqgVar.l.e(hqh.b, e);
        }
    }

    public final void m(KeyEvent keyEvent) {
        if (keyEvent != null) {
            this.g.k(keyEvent);
        }
    }

    public final void n(CharSequence charSequence, int i) {
        o(charSequence, i, null);
    }

    public final void o(CharSequence charSequence, int i, Object obj) {
        if (i == 0) {
            this.g.m(charSequence, 0, obj);
            return;
        }
        try {
            this.g.m(charSequence, i, obj);
        } catch (RuntimeException unused) {
            this.g.m(charSequence.toString(), 0, obj);
            this.h.e(hps.SET_COMPOSING_TEXT_CRASH, Integer.valueOf(i));
        }
    }

    public final void p(hpu hpuVar) {
        hpu hpuVar2 = this.f;
        if (hpuVar2 != null) {
            hpuVar2.d();
        }
        this.f = hpuVar;
        hpr hprVar = this.g;
        hprVar.d = hpuVar;
        hprVar.h = 0;
        if (hpuVar != null) {
            hpuVar.c(this);
        }
    }

    public final void q(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        this.g.o(i, i3);
    }

    public final void r() {
        hqg hqgVar = this.e;
        hqgVar.v = true;
        hqgVar.x = ((Boolean) hqg.f.c()).booleanValue();
        hqgVar.y = ((Boolean) hqg.g.c()).booleanValue();
        hqgVar.z = ((Boolean) hqg.h.c()).booleanValue();
        hqgVar.m();
        hqgVar.v();
        hqgVar.o.clear();
        hqgVar.w(hqe.OTHER, hqgVar.s, hqgVar.t, hqgVar.p, hqgVar.q);
        hqgVar.o(hqe.RELOAD);
    }

    public final void s() {
        hqg hqgVar = this.e;
        if (!hqgVar.v) {
            return;
        }
        hqgVar.v = false;
        hqgVar.m = 0;
        hqgVar.n = false;
        hqa hqaVar = hqgVar.k;
        if (hqaVar.b.length() > 0) {
            hqaVar.b.clear();
            hqaVar.e();
            hqaVar.f = false;
        }
        hqgVar.k.g();
        hqgVar.j.b();
    }

    public final ExtractedText u() {
        mko hQ;
        hpr hprVar = this.g;
        ExtractedTextRequest extractedTextRequest = new ExtractedTextRequest();
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            hQ = kcu.K(null);
        } else {
            hQ = hprVar.g.hQ(new gnq(a2, extractedTextRequest, 6));
        }
        return (ExtractedText) g(hQ, null, true, this.h, 7);
    }

    public final void v(boolean z, boolean z2) {
        mko hQ;
        int i = (true != z ? 0 : 2) | (z2 ? 1 : 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        hpr hprVar = this.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            hQ = kcu.K(false);
        } else {
            hQ = hprVar.g.hQ(new hmc(a2, i, 3));
        }
        Boolean bool = (Boolean) g(hQ, Boolean.FALSE, false, this.h, 8);
        l(this.h, hpv.IC_REQUEST_CURSOR_UPDATES, SystemClock.uptimeMillis() - uptimeMillis);
        if (bool != null) {
            bool.booleanValue();
        }
    }

    public final Object w(mko mkoVar, idk idkVar, int i) {
        if (this.i == 0) {
            ((ltd) ((ltd) k.c()).k("com/google/android/libraries/inputmethod/inputconnection/InputConnectionWrapper", "waitForGetTextInputConnectionFuture", 1472, "InputConnectionWrapper.java")).t("Timeout happens continuously, don't call get text APIs in this session");
            if (idkVar == null) {
                return null;
            }
            idkVar.e(hps.IC_STOP_CALL, Integer.valueOf(i));
            return null;
        }
        return h(mkoVar, null, true, idkVar, i, ((Long) b.c()).longValue(), new hob(this, 11), new hob(this, 12));
    }
}
