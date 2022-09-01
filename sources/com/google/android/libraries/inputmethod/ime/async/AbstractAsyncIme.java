package com.google.android.libraries.inputmethod.ime.async;

import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractAsyncIme extends AbstractIme {
    public static final ltg b = ltg.j("com/google/android/libraries/inputmethod/ime/async/AbstractAsyncIme");
    private final hmz a;
    public final hmj c;
    long d;
    long e;
    boolean f;
    private final hmi g;
    private int h;
    private int i;
    private int j;
    private int k = -1;
    private int l;
    private int m;
    private int n;

    public AbstractAsyncIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        hmi hmiVar = new hmi(this);
        this.g = hmiVar;
        hmj hmjVar = new hmj();
        this.c = hmjVar;
        hmjVar.a = new WeakReference(this);
        this.a = new hmz(hmiVar, V(), hlsVar);
        hmiVar.c();
    }

    private final void m(boolean z) {
        this.a.m();
        n(6, null);
        if (z) {
            n(4, null);
        }
        int i = this.h;
        this.j = i;
        this.i = i;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.f = false;
    }

    private final void n(int i, Object obj) {
        int i2 = this.h + 1;
        this.h = i2;
        this.a.p(i, i2, obj);
    }

    @Override // defpackage.hlp
    public final boolean B(hfd hfdVar) {
        hna c = c();
        if (c == null) {
            return false;
        }
        boolean m = c.m();
        boolean o = c.o(hfdVar);
        iay f = hfdVar.f();
        if (!o && f != null && f.c == -10042) {
            return false;
        }
        if (f != null && f.c == -10141) {
            Object obj = f.e;
            if (!(obj instanceof icn)) {
                return false;
            }
            n(107, obj);
            return true;
        } else if (!g() && !m && !o && (f == null || f.c != -300007)) {
            return false;
        } else {
            n(7, new hmo(hfdVar));
            return true;
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void W(int i) {
        n(16, Integer.valueOf(i));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public void a(long j, long j2) {
        hmq hmqVar = (hmq) hmq.a.a();
        if (hmqVar == null) {
            hmqVar = new hmq();
        }
        hmqVar.b = j;
        hmqVar.c = j2;
        n(12, hmqVar);
    }

    public abstract hlp b(Context context, iav iavVar, hls hlsVar);

    public abstract hna c();

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.g.close();
        int i = this.h;
        this.j = i;
        this.i = i;
        this.k = -1;
    }

    public final void d(Message message) {
        idv idvVar;
        idv idvVar2;
        switch (message.what) {
            case 101:
                int i = message.arg2;
                CharSequence charSequence = (CharSequence) message.obj;
                this.E.g(charSequence, i);
                this.f = !TextUtils.isEmpty(charSequence);
                return;
            case 102:
                this.m = message.arg2;
                hmx hmxVar = (hmx) message.obj;
                this.E.hY(hmxVar.a);
                if (hmxVar.b > 0) {
                    this.d = SystemClock.uptimeMillis() - hmxVar.b;
                }
                if (hmxVar.c <= 0) {
                    return;
                }
                this.e = SystemClock.uptimeMillis() - hmxVar.c;
                return;
            case 103:
                this.l = message.arg2;
                hmk hmkVar = (hmk) message.obj;
                this.E.l(hmkVar.b, hmkVar.c, hmkVar.d);
                return;
            case 104:
                this.n = message.arg2;
                this.E.T((List) message.obj);
                return;
            case 105:
                this.E.O((hfd) message.obj);
                return;
            case 106:
                hmm hmmVar = (hmm) message.obj;
                this.E.hV(hmmVar.b, hmmVar.c, hmmVar.d);
                return;
            case 107:
                hmt hmtVar = (hmt) message.obj;
                this.E.hX(hmtVar.b, hmtVar.c, hmtVar.d, hmtVar.e);
                return;
            case 108:
                hml hmlVar = (hml) message.obj;
                this.E.y(hmlVar.b, hmlVar.c);
                return;
            case 109:
                int i2 = message.arg1;
                this.i = i2;
                if (i2 == this.k) {
                    this.k = -1;
                }
                long j = this.d;
                if (j > 0 || this.e > 0) {
                    if (j > 0) {
                        idk V = V();
                        if (this.f) {
                            idvVar2 = idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED;
                        } else {
                            idvVar2 = idv.USER_ACTION_TO_NEXT_WORD_PREDICTION_UPDATED;
                        }
                        V.g(idvVar2, this.d);
                        this.C.c(this.d);
                    }
                    if (this.e > 0) {
                        idk V2 = V();
                        if (this.f) {
                            idvVar = idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED;
                        } else {
                            idvVar = idv.USER_ACTION_TO_NEXT_WORD_PREDICTION_UPDATED_IGNORED;
                        }
                        V2.g(idvVar, this.e);
                    }
                    this.d = 0L;
                    this.e = 0L;
                }
                this.E.Z();
                return;
            case 110:
                this.E.hW();
                this.f = false;
                return;
            case 111:
                hmw hmwVar = (hmw) message.obj;
                this.E.f(hmwVar.b, hmwVar.c, hmwVar.d);
                this.f = true;
                return;
            case 112:
                this.E.x();
                return;
            case 113:
                this.E.D();
                return;
            case 114:
                hmy hmyVar = (hmy) message.obj;
                this.E.hu(hmyVar.b, hmyVar.c, hmyVar.d, hmyVar.e, hmyVar.f, hmyVar.g, hmyVar.h);
                return;
            case 115:
                hms hmsVar = (hms) message.obj;
                this.E.M(hmsVar.b, hmsVar.c);
                return;
            case 116:
                this.E.G();
                return;
            case 117:
                this.E.hU((CompletionInfo) message.obj);
                return;
            case 118:
                this.E.R((String) message.obj);
                return;
            case 119:
                this.E.C(message.arg1, message.arg2);
                return;
            case 120:
                this.E.B();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return (this.k == -1 && this.i == this.h) ? false : true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gS(hln hlnVar) {
        n(13, hlnVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gT(CompletionInfo[] completionInfoArr) {
        n(15, completionInfoArr);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gV(hln hlnVar, boolean z) {
        n(9, hmu.b(hlnVar, this.n, z));
    }

    @Override // defpackage.hlp
    public final void gX() {
        m(false);
        this.E.Z();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gY(hln hlnVar, boolean z) {
        n(10, hmu.b(hlnVar, this.l, z));
    }

    @Override // defpackage.hlp
    public final void h(hfd hfdVar) {
        n(5, hfdVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void i(EditorInfo editorInfo, boolean z) {
        super.i(editorInfo, z);
        n(3, new nsx(editorInfo, z));
        this.k = this.h;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void j() {
        super.j();
        m(true);
        this.E.Z();
    }

    public final boolean k(int i) {
        return i != this.k && i <= this.j;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void l(ibz ibzVar, boolean z) {
        hmp hmpVar = (hmp) hmp.a.a();
        if (hmpVar == null) {
            hmpVar = new hmp();
        }
        hmpVar.b = ibzVar;
        hmpVar.c = z;
        n(14, hmpVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        hmv hmvVar = (hmv) hmv.a.a();
        if (hmvVar == null) {
            hmvVar = new hmv();
        }
        hmvVar.b = hqeVar;
        hmvVar.c = i;
        hmvVar.d = i2;
        hmvVar.e = i3;
        n(11, hmvVar);
    }

    @Override // defpackage.hlp
    public final void w(int i) {
        int i2 = this.m;
        hmn hmnVar = (hmn) hmn.a.a();
        if (hmnVar == null) {
            hmnVar = new hmn();
        }
        hmnVar.b = i;
        hmnVar.c = i2;
        n(8, hmnVar);
    }
}
