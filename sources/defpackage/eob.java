package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.SuggestionSpan;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: eob  reason: default package */
/* loaded from: classes.dex */
public final class eob {
    public env a;
    private final hls b;

    public eob(hls hlsVar) {
        this.b = hlsVar;
    }

    private final void j(int i) {
        enk[] enkVarArr;
        int i2;
        int i3;
        int i4;
        int length;
        this.a = env.a;
        hqk hT = this.b.hT(i, i, 1);
        if (hT.c < 0 || hT.d < 0 || TextUtils.isEmpty(hT.b) || hT.e()) {
            return;
        }
        CharSequence charSequence = hT.b;
        if (!(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int i5 = hT.c;
        if (i5 > 0) {
            i5--;
        }
        int i6 = hT.d;
        if (i6 < charSequence.length()) {
            i6++;
        }
        boolean z = hT.f;
        SuggestionSpan[] suggestionSpanArr = (SuggestionSpan[]) spanned.getSpans(i5, i6, SuggestionSpan.class);
        boolean z2 = false;
        if (suggestionSpanArr == null || (length = suggestionSpanArr.length) == 0) {
            enkVarArr = enk.a;
        } else {
            enkVarArr = new enk[length];
            for (int i7 = 0; i7 < suggestionSpanArr.length; i7++) {
                SuggestionSpan suggestionSpan = suggestionSpanArr[i7];
                enkVarArr[i7] = new enk(suggestionSpan, spanned.getSpanStart(suggestionSpan), spanned.getSpanEnd(suggestionSpan));
            }
            if (z) {
                Arrays.sort(enkVarArr, xr.m);
                ljm F = ljm.F();
                for (int i8 = 0; i8 < length; i8++) {
                    enk enkVar = enkVarArr[i8];
                    List b = F.b(Integer.valueOf(enkVar.c));
                    Iterator it = b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            enk enkVar2 = (enk) it.next();
                            if (enkVar2.d == enkVar.c) {
                                if (enkVar2.b.equals(enkVar.b)) {
                                    enkVar2.d = enkVar.d;
                                    b.remove(enkVar2);
                                    enkVar = enkVar2;
                                    break;
                                }
                            }
                        }
                    }
                    F.v(Integer.valueOf(enkVar.d), enkVar);
                }
                Collection y = F.y();
                enkVarArr = (enk[]) y.toArray(new enk[y.size()]);
            }
        }
        enk enkVar3 = null;
        int i9 = 0;
        for (enk enkVar4 : enkVarArr) {
            if ((enkVar4.a() & 10) != 0 && (i4 = (i3 = enkVar4.d) - (i2 = enkVar4.c)) != 0 && i4 >= i9 && i3 >= hT.c && i2 <= hT.d) {
                enkVar3 = enkVar4;
                i9 = i4;
            }
        }
        if (enkVar3 == null) {
            return;
        }
        int i10 = enkVar3.c;
        int i11 = enkVar3.d;
        int max = Math.max(0, hT.e);
        if (enkVar3.b() != null && enkVar3.b().length > 0) {
            z2 = true;
        }
        this.a = eot.j(z2, hT, hT.c - i10, i11 - hT.d, enkVar3.b(), i10 + max, max + i11, (enkVar3.a() & 2) != 0 ? 2 : 3);
    }

    public final int a() {
        if (!h()) {
            return -1;
        }
        return this.a.h;
    }

    public final int b() {
        if (!h()) {
            return -1;
        }
        return this.a.g;
    }

    public final int c() {
        if (!h()) {
            return 0;
        }
        return this.a.e;
    }

    public final int d() {
        if (!h()) {
            return 0;
        }
        return this.a.d;
    }

    public final CharSequence e() {
        if (!h()) {
            return null;
        }
        env envVar = this.a;
        hqk hqkVar = envVar.c;
        return hqkVar == null ? "" : hqkVar.b.subSequence(hqkVar.c - envVar.d, hqkVar.d + envVar.e);
    }

    public final void f() {
        j(59);
        env envVar = this.a;
        if (envVar != null) {
            if (envVar.d < 59 && envVar.e < 59) {
                return;
            }
            j(120);
        }
    }

    public final void g() {
        this.a = null;
    }

    public final boolean h() {
        if (this.a == null) {
            f();
        }
        env envVar = this.a;
        return envVar.d > 0 || envVar.e > 0;
    }

    public final int i() {
        return this.a.i;
    }
}
