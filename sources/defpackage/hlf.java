package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: hlf  reason: default package */
/* loaded from: classes.dex */
public final class hlf {
    public final String a;
    public final int b;
    public final boolean c;
    public final hle d;
    public final hle e;
    public final View f;
    public final int g;
    public final hld h;
    public final int i;
    public final hla j;
    public final int k;
    public final hla l;
    public final long m;
    public final boolean n;
    public final CharSequence o;
    public final CharSequence p;
    public final boolean q;
    public final boolean r;
    public final long s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final hiu w;
    public final Runnable x;
    public final hlb y;
    public final int z;

    public hlf() {
    }

    public hlf(String str, int i, int i2, boolean z, hle hleVar, hle hleVar2, View view, int i3, hld hldVar, int i4, hla hlaVar, int i5, hla hlaVar2, long j, boolean z2, CharSequence charSequence, CharSequence charSequence2, boolean z3, boolean z4, long j2, boolean z5, boolean z6, boolean z7, hiu hiuVar, Runnable runnable, hlb hlbVar) {
        this.a = str;
        this.z = i;
        this.b = i2;
        this.c = z;
        this.d = hleVar;
        this.e = hleVar2;
        this.f = view;
        this.g = i3;
        this.h = hldVar;
        this.i = i4;
        this.j = hlaVar;
        this.k = i5;
        this.l = hlaVar2;
        this.m = j;
        this.n = z2;
        this.o = charSequence;
        this.p = charSequence2;
        this.q = z3;
        this.r = z4;
        this.s = j2;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = hiuVar;
        this.x = runnable;
        this.y = hlbVar;
    }

    public static hky a() {
        hky hkyVar = new hky();
        hkyVar.o(false);
        hkyVar.n();
        hkyVar.k(false);
        hkyVar.l = (short) (hkyVar.l | 64);
        hkyVar.t(false);
        hkyVar.h = 10L;
        hkyVar.l = (short) (hkyVar.l | 2048);
        hkyVar.q();
        hkyVar.f(0);
        hkyVar.l(0);
        hkyVar.h(0);
        hkyVar.c = null;
        hkyVar.i(false);
        hkyVar.j(false);
        hkyVar.r(false);
        return hkyVar;
    }

    public final boolean equals(Object obj) {
        hle hleVar;
        hle hleVar2;
        View view;
        hld hldVar;
        hla hlaVar;
        hla hlaVar2;
        CharSequence charSequence;
        hiu hiuVar;
        Runnable runnable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hlf) {
            hlf hlfVar = (hlf) obj;
            if (this.a.equals(hlfVar.a)) {
                int i = this.z;
                int i2 = hlfVar.z;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b == hlfVar.b && this.c == hlfVar.c && ((hleVar = this.d) != null ? hleVar.equals(hlfVar.d) : hlfVar.d == null) && ((hleVar2 = this.e) != null ? hleVar2.equals(hlfVar.e) : hlfVar.e == null) && ((view = this.f) != null ? view.equals(hlfVar.f) : hlfVar.f == null) && this.g == hlfVar.g && ((hldVar = this.h) != null ? hldVar.equals(hlfVar.h) : hlfVar.h == null) && this.i == hlfVar.i && ((hlaVar = this.j) != null ? hlaVar.equals(hlfVar.j) : hlfVar.j == null) && this.k == hlfVar.k && ((hlaVar2 = this.l) != null ? hlaVar2.equals(hlfVar.l) : hlfVar.l == null) && this.m == hlfVar.m && this.n == hlfVar.n && this.o.equals(hlfVar.o) && ((charSequence = this.p) != null ? charSequence.equals(hlfVar.p) : hlfVar.p == null) && this.q == hlfVar.q && this.r == hlfVar.r && this.s == hlfVar.s && this.t == hlfVar.t && this.u == hlfVar.u && this.v == hlfVar.v && ((hiuVar = this.w) != null ? hiuVar.equals(hlfVar.w) : hlfVar.w == null) && ((runnable = this.x) != null ? runnable.equals(hlfVar.x) : hlfVar.x == null)) {
                    hlb hlbVar = this.y;
                    hlb hlbVar2 = hlfVar.y;
                    if (hlbVar != null ? hlbVar.equals(hlbVar2) : hlbVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.z;
        if (i != 0) {
            int i2 = 1231;
            int i3 = (((((hashCode ^ i) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
            hle hleVar = this.d;
            int i4 = 0;
            int hashCode2 = (i3 ^ (hleVar == null ? 0 : hleVar.hashCode())) * 1000003;
            hle hleVar2 = this.e;
            int hashCode3 = (hashCode2 ^ (hleVar2 == null ? 0 : hleVar2.hashCode())) * 1000003;
            View view = this.f;
            int hashCode4 = (((hashCode3 ^ (view == null ? 0 : view.hashCode())) * 1000003) ^ this.g) * 1000003;
            hld hldVar = this.h;
            int hashCode5 = (((hashCode4 ^ (hldVar == null ? 0 : hldVar.hashCode())) * 1000003) ^ this.i) * 1000003;
            hla hlaVar = this.j;
            int hashCode6 = (((hashCode5 ^ (hlaVar == null ? 0 : hlaVar.hashCode())) * 1000003) ^ this.k) * 1000003;
            hla hlaVar2 = this.l;
            int hashCode7 = hlaVar2 == null ? 0 : hlaVar2.hashCode();
            long j = this.m;
            int hashCode8 = (((((((((hashCode6 ^ hashCode7) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ 1237) * 1000003) ^ (true != this.n ? 1237 : 1231)) * (-721379959)) ^ this.o.hashCode()) * 1000003;
            CharSequence charSequence = this.p;
            int hashCode9 = (((((((((((hashCode8 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ ((int) this.s)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003;
            if (true != this.v) {
                i2 = 1237;
            }
            int i5 = (hashCode9 ^ i2) * 583896283;
            hiu hiuVar = this.w;
            int hashCode10 = (i5 ^ (hiuVar == null ? 0 : hiuVar.hashCode())) * 1000003;
            Runnable runnable = this.x;
            int hashCode11 = (hashCode10 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
            hlb hlbVar = this.y;
            if (hlbVar != null) {
                i4 = hlbVar.hashCode();
            }
            return hashCode11 ^ i4;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        int i = this.z;
        int i2 = this.b;
        boolean z = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        int i3 = this.g;
        String valueOf4 = String.valueOf(this.h);
        int i4 = this.i;
        String valueOf5 = String.valueOf(this.j);
        int i5 = this.k;
        String valueOf6 = String.valueOf(this.l);
        long j = this.m;
        boolean z2 = this.n;
        String valueOf7 = String.valueOf(this.o);
        String valueOf8 = String.valueOf(this.p);
        boolean z3 = this.q;
        boolean z4 = this.r;
        long j2 = this.s;
        boolean z5 = this.t;
        boolean z6 = this.u;
        boolean z7 = this.v;
        String valueOf9 = String.valueOf(this.w);
        String valueOf10 = String.valueOf(this.x);
        String valueOf11 = String.valueOf(this.y);
        return "Tooltip{id=" + str + ", tooltipType=" + hqs.c(i) + ", tooltipViewResId=" + i2 + ", enableDynamicColor=" + z + ", onTooltipViewInflatedCallback=" + valueOf + ", beforeShowingTooltipViewCallback=" + valueOf2 + ", anchorView=" + valueOf3 + ", anchorViewResId=" + i3 + ", positionProvider=" + valueOf4 + ", displayAnimatorResId=" + i4 + ", onDisplayAnimatorInflatedCallback=" + valueOf5 + ", dismissAnimatorResId=" + i5 + ", onDismissAnimatorInflatedCallback=" + valueOf6 + ", displayDuration=" + j + ", shouldHideKeyboardHeaderView=false, touchToDismiss=" + z2 + ", minDisplayDuration=0, contentDescription=" + valueOf7 + ", touchToDismissContentDescription=" + valueOf8 + ", displayExclusively=" + z3 + ", displayAggressively=" + z4 + ", maxWaitTimeMillis=" + j2 + ", dismissOnFinishInputView=" + z5 + ", dismissOnInputMethodEntryChanged=" + z6 + ", supportBannerInLandscapeMode=" + z7 + ", pauseRunnable=null, resumeRunnable=null, dismissRunnable=" + valueOf9 + ", displayRunnable=" + valueOf10 + ", onIgnoredCallback=" + valueOf11 + "}";
    }
}
