package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompletionsProcessor implements hnj {
    private final mks a = gyc.b;
    private final Runnable b = new gxd(this, 15);
    private mko c = mkk.a;
    private boolean d;
    private boolean e;
    private hln f;
    private hnf g;
    private ino h;
    private boolean i;
    private CharSequence j;
    private boolean k;
    private boolean l;
    private gwv m;

    private final void b() {
        this.e = false;
        this.f = null;
        this.c.cancel(false);
        this.d = false;
    }

    public final void a(hnf hnfVar) {
        gwv gwvVar;
        this.f = null;
        if (this.g == hnfVar || (gwvVar = this.m) == null) {
            return;
        }
        boolean z = false;
        if (hnfVar != null && hnfVar.hasNext()) {
            z = true;
        }
        this.e = z;
        this.g = hnfVar;
        gwvVar.b(hnl.h(z, this));
    }

    @Override // defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        this.h = ino.M(context);
        this.m = gwvVar;
        this.i = iavVar.q.d(R.id.f54870_resource_name_obfuscated_res_0x7f0b01cf, false);
        this.j = iavVar.q.c(R.id.f55050_resource_name_obfuscated_res_0x7f0b01e2, null);
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        ino inoVar;
        hnf hnfVar;
        gwv gwvVar;
        int i;
        hln hlnVar;
        gwv gwvVar2;
        hnf hnfVar2;
        gwv gwvVar3;
        int i2 = hnlVar.A;
        int i3 = i2 - 1;
        if (i2 != 0) {
            boolean z = true;
            if (i3 == 1) {
                EditorInfo editorInfo = hnlVar.b;
                b();
                CharSequence charSequence = this.j;
                if ((charSequence != null && ((inoVar = this.h) == null || !inoVar.al(charSequence.toString(), true, true))) || !ham.at(editorInfo)) {
                    z = false;
                }
                this.k = z;
                return false;
            } else if (i3 == 2) {
                if (hnlVar.e) {
                    b();
                } else if (this.e && (hnfVar = this.g) != null && (gwvVar = this.m) != null) {
                    hnfVar.a = 0;
                    gwvVar.b(hnl.h(true, this));
                }
                return false;
            } else if (i3 == 3) {
                hfd hfdVar = hnlVar.j;
                if (hfdVar != null) {
                    if (this.e) {
                        this.c.cancel(false);
                        this.c = this.a.a(this.b, 1000L, TimeUnit.MILLISECONDS);
                        this.d = true;
                    }
                    iay iayVar = hfdVar.b[0];
                    if (this.e && (((i = iayVar.c) == 66 || i == 62 || i == 23) && (hlnVar = this.f) != null && (gwvVar2 = this.m) != null)) {
                        gwvVar2.b(hnl.d(hlnVar.a, this));
                        this.f = null;
                    }
                }
                return false;
            } else if (i3 == 7) {
                int i4 = hnlVar.m;
                if (!this.e || (hnfVar2 = this.g) == null || this.m == null) {
                    return false;
                }
                ArrayList A = lre.A();
                while (A.size() < i4 && hnfVar2.hasNext()) {
                    hln next = hnfVar2.next();
                    if (next != null) {
                        A.add(next);
                    }
                }
                this.m.b(hnl.b(A, this.f, hnfVar2.hasNext(), this));
                return true;
            } else if (i3 == 12) {
                hln hlnVar2 = hnlVar.k;
                boolean z2 = hnlVar.l;
                if (hlnVar2 == null || hlnVar2.e != hlm.APP_COMPLETION) {
                    return false;
                }
                if (!z2 || (gwvVar3 = this.m) == null) {
                    this.f = hlnVar2;
                    return true;
                }
                gwvVar3.b(hnl.d(hlnVar2.a, this));
                this.f = null;
                return true;
            } else if (i3 == 15) {
                if ((hnlVar.n & 137438953472L) == 0) {
                    z = false;
                }
                this.l = z;
                return false;
            } else if (i3 != 21) {
                if (i3 != 24) {
                    return false;
                }
                b();
                return false;
            } else {
                CompletionInfo[] completionInfoArr = hnlVar.o;
                if ((!this.i || !this.k) && !this.l) {
                    return false;
                }
                if (completionInfoArr != null && completionInfoArr.length > 0) {
                    this.c.cancel(false);
                    this.d = false;
                    a(new hnf(completionInfoArr));
                    return true;
                } else if (this.d) {
                    return true;
                } else {
                    this.c = this.a.a(this.b, 1000L, TimeUnit.MILLISECONDS);
                    this.d = true;
                    return true;
                }
            }
        }
        throw null;
    }
}
