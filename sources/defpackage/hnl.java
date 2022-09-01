package defpackage;

import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import java.util.List;

/* compiled from: PG */
/* renamed from: hnl  reason: default package */
/* loaded from: classes.dex */
public final class hnl implements gwb {
    private static final xx C = new xz(8);
    private static final Object D = new Object();
    public int A;
    public int B;
    public Object a;
    public EditorInfo b;
    public boolean c;
    public ibz d;
    public boolean e;
    public hqe f;
    public int g;
    public int h;
    public int i;
    public hfd j;
    public hln k;
    public boolean l;
    public int m;
    public long n;
    public CompletionInfo[] o;
    public CharSequence p;
    public int q;
    public boolean r;
    public List s;
    public hln t;
    public int u;
    public int v;
    public long w;
    public boolean x;
    public int y;
    public int z;

    private hnl() {
    }

    public static hnl b(List list, hln hlnVar, boolean z, Object obj) {
        hnl i = i(9, obj);
        i.s = list;
        i.t = hlnVar;
        i.r = z;
        return i;
    }

    public static hnl c(Object obj) {
        return i(29, obj);
    }

    public static hnl d(CharSequence charSequence, Object obj) {
        hnl i = i(26, obj);
        i.p = charSequence;
        return i;
    }

    public static hnl e(Object obj) {
        return i(30, obj);
    }

    public static hnl f(hfd hfdVar, Object obj) {
        hnl i = i(14, obj);
        i.j = hfdVar;
        return i;
    }

    public static hnl g(Object obj) {
        return i(18, obj);
    }

    public static hnl h(boolean z, Object obj) {
        hnl i = i(6, obj);
        i.r = z;
        return i;
    }

    public static hnl i(int i, Object obj) {
        hnl hnlVar = (hnl) C.a();
        if (hnlVar == null) {
            hnlVar = new hnl();
        }
        hnlVar.A = i;
        hnlVar.a = obj;
        return hnlVar;
    }

    public static hnl j(CharSequence charSequence, int i, Object obj) {
        hnl i2 = i(11, obj);
        i2.p = charSequence;
        i2.B = i;
        i2.q = 1;
        return i2;
    }

    public static hnl k(CharSequence charSequence, Object obj) {
        hnl i = i(5, obj);
        i.p = charSequence;
        i.q = 1;
        return i;
    }

    public static hnl l(int i, int i2, CharSequence charSequence, Object obj) {
        hnl i3 = i(23, obj);
        i3.u = i;
        i3.v = i2;
        i3.p = charSequence;
        i3.B = 1;
        return i3;
    }

    @Override // defpackage.gwb
    public final void a() {
        this.A = 1;
        this.a = D;
        this.b = null;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = 0;
        this.n = 0L;
        this.o = null;
        this.p = null;
        this.q = 0;
        this.B = 1;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = 0;
        this.v = 0;
        this.w = 0L;
        this.x = false;
        this.y = 0;
        this.z = 0;
        C.b(this);
    }
}
