package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.Range;
import com.google.android.apps.inputmethod.libs.hmmgesture.HmmGestureDecoder;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dmg  reason: default package */
/* loaded from: classes.dex */
public final class dmg extends dkk {
    private int g;
    private int h;

    public dmg(Context context, hlu hluVar, ino inoVar) {
        super(context, hluVar, inoVar);
        l();
    }

    private final void l() {
        this.g = 0;
        this.h = 0;
    }

    @Override // defpackage.dkk
    protected final HmmGestureDecoder a() {
        dmi h = dmi.h(this.d);
        if (h.a() == null) {
            div.c().i(h, "ko", "ko");
        }
        return h.c("ko");
    }

    @Override // defpackage.dkk
    protected final void d(boolean z) {
        if (z) {
            this.h = this.b.a();
        }
    }

    @Override // defpackage.dkk
    protected final void e() {
        k();
        this.g = this.b.a();
    }

    @Override // defpackage.dkk
    public final void f() {
        super.f();
        l();
    }

    @Override // defpackage.dkk
    protected final boolean i(ino inoVar) {
        return true;
    }

    @Override // defpackage.dkk
    protected final boolean j(ino inoVar) {
        return inoVar.aj(R.string.f160870_resource_name_obfuscated_res_0x7f140677);
    }

    public final void k() {
        int i;
        int i2 = this.g;
        int i3 = this.h;
        if (i2 >= i3 || i3 <= 0) {
            return;
        }
        dik dikVar = (dik) this.b;
        int size = dikVar.k.size();
        int e = dikVar.m.e();
        long[] jArr = new long[i3 - i2];
        int max = Math.max(i2, dikVar.h);
        int i4 = 0;
        int i5 = 0;
        while (i4 < e) {
            long k = dikVar.m.k(i4);
            Range q = dikVar.m.q(k);
            if (q.endVertexIndex <= max) {
                i = i4;
            } else if (q.startVertexIndex >= i3) {
                break;
            } else {
                long f = dikVar.m.f(k);
                i = i4;
                for (int i6 = 0; i6 < f; i6++) {
                    long l = dikVar.m.l(k, i6);
                    Range r = dikVar.m.r(l);
                    if (r.startVertexIndex >= max) {
                        if (r.endVertexIndex <= i3) {
                            if (!dikVar.m.A(l)) {
                                dikVar.k.add(r);
                                jArr[i5] = l;
                                i5++;
                            }
                        }
                    }
                }
            }
            i4 = i + 1;
        }
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar.m;
        int nativeSelectTokens = hmmEngineInterfaceImpl.nativeSelectTokens(hmmEngineInterfaceImpl.a, Arrays.copyOf(jArr, i5));
        int size2 = dikVar.k.size();
        int i7 = nativeSelectTokens + size;
        if (i7 < size2) {
            for (int i8 = size2 - 1; i8 >= i7; i8++) {
                dikVar.k.remove(i8);
            }
        }
        dikVar.y();
        if (dikVar.l != null) {
            while (size < i7) {
                dikVar.l.H(4, ((Range) dikVar.k.get(size)).startVertexIndex);
                size++;
            }
        }
        l();
    }
}
