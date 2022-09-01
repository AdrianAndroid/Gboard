package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractDoubleSpaceProcessor implements hnj, hnh {
    private static final long b = ViewConfiguration.getDoubleTapTimeout();
    protected ino a;
    private hlr c;
    private CharSequence d;
    private CharSequence e;
    private volatile boolean f;
    private long g;
    private gwv h;

    private final boolean c(long j) {
        hlr hlrVar;
        CharSequence j2;
        boolean z = false;
        if (j - this.g <= b && (hlrVar = this.c) != null && this.h != null && (j2 = hlrVar.j(3)) != null && j2.length() >= 2) {
            int length = j2.length() - 1;
            if (j2.charAt(length) == ' ' && a(Character.codePointBefore(j2, length))) {
                this.h.b(hnl.l(1, 0, this.d, this));
                z = true;
            }
        }
        if (true == z) {
            j = 0;
        }
        this.g = j;
        return z;
    }

    protected abstract boolean a(int i);

    @Override // defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        this.h = gwvVar;
        this.a = ino.M(context);
        this.d = iavVar.q.c(R.id.f55010_resource_name_obfuscated_res_0x7f0b01de, null);
        this.e = iavVar.q.c(R.id.f54830_resource_name_obfuscated_res_0x7f0b01cb, null);
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        return this.f && hfdVar.b[0].c == 62;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(EditorInfo editorInfo) {
        if (ham.Y(editorInfo)) {
            CharSequence charSequence = this.e;
            if (charSequence == null) {
                return true;
            }
            ino inoVar = this.a;
            return inoVar != null && inoVar.al(charSequence.toString(), true, true);
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.hnh
    public final void fl(hlr hlrVar) {
        this.c = hlrVar;
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        int i = hnlVar.A;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                this.f = b(hnlVar.b);
                this.g = 0L;
                return false;
            } else if (i2 != 3) {
                if (i2 != 10) {
                    return false;
                }
                CharSequence charSequence = hnlVar.p;
                if (charSequence == null || !" ".equals(charSequence.toString())) {
                    this.g = 0L;
                    return false;
                }
                return c(SystemClock.uptimeMillis());
            } else {
                hfd hfdVar = hnlVar.j;
                if (hfdVar == null || !this.f || this.d == null) {
                    return false;
                }
                int i3 = hfdVar.b[0].c;
                if (i3 == 62) {
                    long j = hfdVar.i;
                    if (j == 0) {
                        j = SystemClock.uptimeMillis();
                    }
                    return c(j);
                } else if (i3 <= 0) {
                    return false;
                } else {
                    this.g = 0L;
                    return false;
                }
            }
        }
        throw null;
    }
}
