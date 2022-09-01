package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kfp  reason: default package */
/* loaded from: classes.dex */
public final class kfp {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public Object e;

    public kfp() {
    }

    public kfp(elo eloVar) {
        this.e = eloVar.a;
        this.a = eloVar.b;
        this.b = eloVar.c;
        this.d = eloVar.d;
        this.c = (byte) 15;
    }

    public kfp(byte[] bArr) {
        this.e = ldu.a;
    }

    public final kfq a() {
        int i;
        if (this.c != 31 || (i = this.d) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.d == 0) {
                sb.append(" enablement");
            }
            if ((this.c & 1) == 0) {
                sb.append(" rateLimitPerSecond");
            }
            if ((this.c & 2) == 0) {
                sb.append(" recordMetricPerProcess");
            }
            if ((this.c & 4) == 0) {
                sb.append(" forceGcBeforeRecordMemory");
            }
            if ((this.c & 8) == 0) {
                sb.append(" captureDebugMetrics");
            }
            if ((this.c & 16) == 0) {
                sb.append(" captureMemoryInfo");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new kfq(i, this.a, (lfb) this.e, this.b);
    }

    public final void b(boolean z) {
        this.d = true != z ? 2 : 3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final icn c() {
        ?? r0;
        if (this.c != 15 || (r0 = this.e) == 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" beforeLength");
            }
            if ((this.c & 2) == 0) {
                sb.append(" afterLength");
            }
            if (this.e == null) {
                sb.append(" newText");
            }
            if ((this.c & 4) == 0) {
                sb.append(" composing");
            }
            if ((this.c & 8) == 0) {
                sb.append(" forwardToDecoder");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new icn(this.a, this.d, r0, this.b);
    }

    public final void d(int i) {
        this.d = i;
        this.c = (byte) (this.c | 2);
    }

    public final void e(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void f() {
        this.c = (byte) (this.c | 4);
    }

    public final void g(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 8);
    }

    public final void h(CharSequence charSequence) {
        if (charSequence != null) {
            this.e = charSequence;
            return;
        }
        throw new NullPointerException("Null newText");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, hhl] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, hhl] */
    public final elo i() {
        ?? r3;
        Context a = guw.a();
        cuz cuzVar = cuz.a;
        ?? r2 = this.e;
        if (r2 == 0) {
            throw new IllegalStateException("Property \"enableFlag\" has not been set");
        }
        this.b = cuzVar.j(a, r2);
        this.c = (byte) (this.c | 2);
        this.d = a.getResources().getDimensionPixelSize(R.dimen.f33950_resource_name_obfuscated_res_0x7f070174);
        this.c = (byte) (this.c | 4);
        int dimensionPixelSize = a.getResources().getDimensionPixelSize(R.dimen.f33060_resource_name_obfuscated_res_0x7f070109);
        int i = this.c | 8;
        this.c = (byte) i;
        if (i != 15 || (r3 = this.e) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.e == null) {
                sb.append(" enableFlag");
            }
            if ((this.c & 1) == 0) {
                sb.append(" strategy");
            }
            if ((this.c & 2) == 0) {
                sb.append(" isTallViewEnabled");
            }
            if ((this.c & 4) == 0) {
                sb.append(" expressionTallViewExtraHeight");
            }
            if ((this.c & 8) == 0) {
                sb.append(" contentSuggestionStripHeight");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new elo(r3, this.a, this.b, this.d, dimensionPixelSize);
    }
}
