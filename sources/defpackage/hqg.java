package defpackage;

import android.os.Build;
import java.util.LinkedList;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hqg  reason: default package */
/* loaded from: classes.dex */
public final class hqg {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inputcontext/InputContextChangeTracker");
    public static final hhl b = hhq.f("max_chars_to_read_before_and_after_cursor", 60);
    public static final hhl c = hhq.a("improve_get_surrounding_text", false);
    public static final hhl d = hhq.a("use_initial_surrounding_text_at_restart", false);
    static final hhl e = hhq.a("filter_content_with_whitelist_spans", true);
    public static final hhl f = hhq.a("fix_lying_selection_range", true);
    public static final hhl g = hhq.a("fix_lying_selection_range_only_once", true);
    public static final hhl h = hhq.a("fix_lying_selection_range_update_predictions", false);
    public final opu A;
    private final hqf B;
    public int i;
    public final hqb j;
    public final idk l;
    public int m;
    public boolean n;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean x;
    public boolean y;
    public boolean z;
    public final LinkedList o = new LinkedList();
    public hqk w = null;
    public final hqa k = new hqa();

    public hqg(hqf hqfVar, hqb hqbVar, opu opuVar, idk idkVar, byte[] bArr, byte[] bArr2) {
        this.B = hqfVar;
        this.j = hqbVar;
        this.A = opuVar;
        this.l = idkVar;
    }

    public static CharSequence l(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    private final void z(int i, int i2) {
        hqk hqkVar = this.w;
        boolean z = true;
        if (hqkVar == null) {
            hqkVar = this.A.n(i, i2, 1);
        }
        n(hqkVar, this.x);
        if (this.y) {
            this.x = false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            idk idkVar = this.l;
            hqh hqhVar = hqh.a;
            Object[] objArr = new Object[1];
            if (this.w == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            idkVar.e(hqhVar, objArr);
        }
        this.n = x(hqkVar, i2);
        v();
    }

    public final int a() {
        return this.o.isEmpty() ? this.p : ((hqc) this.o.getLast()).e;
    }

    public final int b() {
        return this.o.isEmpty() ? this.q : ((hqc) this.o.getLast()).f;
    }

    public final int c() {
        return this.o.isEmpty() ? this.s : ((hqc) this.o.getLast()).c;
    }

    public final int d() {
        return this.o.isEmpty() ? this.t : ((hqc) this.o.getLast()).d;
    }

    public final int e() {
        return c() - d();
    }

    public final hqd f() {
        int e2 = e() - b();
        return new hqd(e2, a() + e2);
    }

    public final hqd g() {
        int c2 = c();
        return new hqd(c2 - d(), c2);
    }

    public final hqk h(int i, int i2, int i3, int i4, int i5) {
        CharSequence c2 = this.k.c(i, i2, i5);
        int length = c2.length();
        int i6 = i3 - i;
        int i7 = i4 - i;
        int i8 = this.m + i;
        if (i6 < 0 || i7 < 0 || Math.max(i6, i7) > length) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/inputcontext/InputContextChangeTracker", "getSubSurroundText", 1333, "InputContextChangeTracker.java")).L("Invalid sub surrounding text: contentLength=%s, subStringInContent=[%d, %d], selectionInContent=[%d, %d]", Integer.valueOf(this.k.b.length()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            int min = Math.min(Math.max(0, i6), length);
            i7 = Math.min(Math.max(0, i7), length);
            i6 = min;
            i8 = -1;
        }
        return new hqk(c2, i6, i7, i8, this.k.e);
    }

    public final CharSequence i(int i) {
        if (!this.v) {
            return l(this.A.o(i));
        }
        hqd g2 = g();
        if (g2.a()) {
            return "";
        }
        int i2 = g2.a;
        int i3 = this.m;
        int i4 = i2 - i3;
        int i5 = g2.b - i3;
        boolean z = i4 < 0 || i5 > this.k.a();
        if (y(i, z)) {
            m();
            o(hqe.RELOAD);
            int i6 = g2.a;
            int i7 = this.m;
            i4 = i6 - i7;
            i5 = g2.b - i7;
        } else if (z) {
            CharSequence l = l(this.A.o(1));
            int a2 = this.k.a();
            if (i5 < 0) {
                u(0, 0, this.A.p(-i5, 1));
                u(0, 0, l);
                this.m = g2.a;
            } else if (i4 > a2) {
                this.k.d(this.A.q(i4 - a2, 1));
                this.k.d(l);
            } else {
                this.k.f(Math.max(i4, 0), Math.min(i5, a2), l);
            }
            if (i4 < 0) {
                this.m = g2.a;
                i4 = 0;
            }
            i5 = i4 + l.length();
            o(hqe.RELOAD);
        }
        return this.k.c(i4, i5, i);
    }

    public final CharSequence j(int i, int i2, int i3) {
        if (i == 0) {
            return "";
        }
        if (!this.v) {
            return l(this.A.p(i, i2));
        }
        hqd g2 = g();
        int i4 = 0;
        r2 = false;
        boolean z = false;
        int max = Math.max(g2.b, 0);
        int i5 = max - this.m;
        int i6 = i5 + i;
        boolean z2 = (i6 > this.k.a() && !this.n) || i5 < 0;
        if (y(i2, z2)) {
            z(Math.max(i3, this.i), Math.max(i, this.i));
            o(hqe.RELOAD);
            i5 = max - this.m;
            i6 = i5 + i;
        } else if (z2) {
            int i7 = g2.a - this.m;
            int a2 = this.k.a();
            if (i7 > a2) {
                this.k.d(this.A.q(i7 - a2, 1));
                i7 = this.k.a();
                a2 = i7;
            }
            if (i5 > a2 && i7 >= 0) {
                this.k.f(i7, a2, this.A.o(1));
                a2 = this.k.a();
            }
            if (i6 > a2) {
                int max2 = Math.max(i5, 0);
                int max3 = Math.max(i, this.i);
                CharSequence p = this.A.p(max3, 1);
                if (p != null && p.length() < max3) {
                    z = true;
                }
                this.n = z;
                this.k.f(max2, a2, p);
                i4 = max2;
            } else if (i5 < 0) {
                this.k.f(0, 0, this.A.p(-i5, 1));
                this.m = max;
            } else {
                i4 = i5;
            }
            i6 = i4 + i;
            o(hqe.RELOAD);
            i5 = i4;
        }
        return this.k.c(i5, i6, i2);
    }

    public final CharSequence k(int i, int i2, int i3) {
        if (i == 0) {
            return "";
        }
        if (!this.v) {
            return l(this.A.q(i, i2));
        }
        hqd g2 = g();
        int i4 = g2.a;
        if (i4 <= 0) {
            return "";
        }
        int i5 = i4 - this.m;
        int min = i5 - Math.min(i4, i);
        boolean z = min < 0 || i5 > this.k.a();
        if (y(i2, z)) {
            z(Math.max(i, this.i), Math.max(i3, this.i));
            o(hqe.RELOAD);
            i5 = i4 - this.m;
            min = i5 - Math.min(i4, i);
        } else if (z) {
            int i6 = g2.b - this.m;
            if (i6 < 0) {
                this.k.f(0, 0, this.A.p(-i6, 1));
                int i7 = g2.b;
                this.m = i7;
                i5 = i4 - i7;
                i6 = 0;
            }
            if (i5 < 0) {
                this.k.f(0, i6, this.A.o(1));
                i5 = 0;
            }
            int a2 = this.k.a();
            if (i5 - (i4 > i ? i : i4) < 0) {
                CharSequence q = this.A.q(Math.max(i, this.i), 1);
                this.k.f(0, i5, q);
                this.m = Math.max(i4 - (q != null ? q.length() : 0), 0);
            } else if (a2 < i5) {
                this.k.d(this.A.q(i5 - a2, 1));
            }
            i5 = i4 - this.m;
            min = Math.max(i5 - i, 0);
            o(hqe.RELOAD);
        }
        return this.k.c(min, i5, i2);
    }

    public final void m() {
        int i = this.i;
        z(i, i);
    }

    public final void n(hqk hqkVar, boolean z) {
        if (hqkVar == null) {
            hqkVar = hqk.a;
        }
        hqa hqaVar = this.k;
        CharSequence charSequence = hqkVar.b;
        boolean z2 = hqkVar.f;
        hqaVar.b.clear();
        try {
            hqaVar.b.append(charSequence);
            hqaVar.f = true;
        } catch (RuntimeException unused) {
            hqaVar.b.append((CharSequence) charSequence.toString());
            hqaVar.f = false;
        }
        hqaVar.e = z2;
        hqaVar.e();
        if (z && hqkVar != null) {
            hqc hqcVar = !this.o.isEmpty() ? (hqc) this.o.getLast() : null;
            if (!this.z || hqcVar == null || hqcVar.b == hqe.OTHER) {
                int i = this.r;
                int i2 = hqkVar.e;
                int i3 = i2 >= 0 ? i2 + hqkVar.c : i;
                int i4 = (hqkVar.d - hqkVar.c) + i3;
                if (i != i3 || this.s != i4) {
                    int i5 = i != i3 ? 1 : 0;
                    if (this.s != i4) {
                        i5 |= 2;
                    }
                    String format = String.format(Locale.US, "fixLyingSelectionRangeFromSurroundingText(): [%d, %d](%s) -> [%d, %d]", Integer.valueOf(this.r), Integer.valueOf(this.s), g(), Integer.valueOf(i3), Integer.valueOf(i4));
                    this.r = i3;
                    this.s = i4;
                    this.t = i4 - i3;
                    if (this.z && hqcVar != null && hqcVar.b == hqe.OTHER) {
                        this.o.poll();
                        w(hqcVar.b, this.s, this.t, this.p, this.q);
                    }
                    this.l.e(hqh.e, Integer.valueOf(i5));
                    ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/inputcontext/InputContextChangeTracker", "fixLyingSelectionRangeFromSurroundingText", 1495, "InputContextChangeTracker.java")).G("%s(%s)", format, g());
                }
            }
        }
        this.m = Math.max(0, e() - hqkVar.c);
    }

    public final void o(hqe hqeVar) {
        if (this.u > 0) {
            return;
        }
        hqd g2 = g();
        hqd f2 = f();
        boolean z = !f2.a();
        hqb hqbVar = this.j;
        CharSequence b2 = this.k.b();
        int i = g2.a;
        int i2 = this.m;
        hqbVar.a(hqeVar, b2, i - i2, g2.b - i2, z ? f2.a - i2 : -1, z ? f2.b - i2 : -1, i2);
        if (hqeVar != hqe.OTHER && hqeVar != hqe.RELOAD) {
            return;
        }
        this.l.e(hqh.d, Integer.valueOf(hqeVar.g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1.b <= (r4 + r10.k.a())) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(defpackage.hqe r11, boolean r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        /*
            r10 = this;
            r0 = r10
            r2 = r11
            hqe r1 = defpackage.hqe.IGNORE
            if (r2 != r1) goto L7
            return
        L7:
            hqe r1 = defpackage.hqe.OTHER
            if (r2 == r1) goto L20
            hqd r1 = r10.g()
            int r3 = r1.a
            int r4 = r0.m
            if (r3 < r4) goto L20
            int r1 = r1.b
            hqa r3 = r0.k
            int r3 = r3.a()
            int r4 = r4 + r3
            if (r1 <= r4) goto L33
        L20:
            r10.v()
            boolean r1 = r0.v
            if (r1 == 0) goto L33
            r10.m()
            hqe r1 = defpackage.hqe.OTHER
            if (r2 == r1) goto L30
            hqe r1 = defpackage.hqe.RELOAD
        L30:
            r10.o(r1)
        L33:
            hqf r1 = r0.B
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqg.p(hqe, boolean, int, int, int, int, int, int):void");
    }

    public final void q(CharSequence charSequence, int i) {
        int max;
        hqd g2 = g();
        hqd f2 = f();
        if (true == g2.a()) {
            g2 = f2;
        }
        if (i > 0) {
            max = g2.a + charSequence.length();
        } else {
            max = Math.max(g2.a, 0);
        }
        w(hqe.IME, max, 0, 0, 0);
        if (this.v) {
            u(g2.a, g2.b, charSequence);
            o(hqe.IME);
        }
    }

    public final void r(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        hqd g2 = g();
        hqd f2 = f();
        int i3 = g2.a;
        int i4 = g2.b;
        if (!f2.a()) {
            int i5 = f2.a;
            if (i5 < i3) {
                i3 = i5;
            }
            int i6 = f2.b;
            if (i6 > i4) {
                i4 = i6;
            }
        }
        int min = Math.min(i, i3);
        w(hqe.IME, g2.b - min, d(), a(), b());
        if (!this.v) {
            return;
        }
        u(i4, i2 + i4, "");
        u(i3 - min, i3, "");
        o(hqe.IME);
    }

    public final void s(CharSequence charSequence, int i) {
        int i2;
        hqd g2 = g();
        hqd f2 = f();
        if (true != f2.a()) {
            g2 = f2;
        }
        if (i > 0) {
            i2 = ((g2.a + charSequence.length()) + i) - 1;
        } else {
            i2 = g2.a + i;
        }
        int i3 = i2;
        w(hqe.IME, i3, 0, charSequence.length(), i3 - g2.a);
        if (this.v) {
            u(g2.a, g2.b, charSequence);
            o(hqe.IME);
        }
    }

    public final void t(int i, int i2) {
        hqd g2 = g();
        int a2 = a();
        w(hqe.IME, i2, i2 - i, a2, a2 > 0 ? b() + (i - g2.a) : 0);
        if (this.v) {
            if (g2.a == i && g2.b == i2) {
                return;
            }
            o(hqe.IME);
        }
    }

    public final void u(int i, int i2, CharSequence charSequence) {
        hqa hqaVar = this.k;
        int i3 = this.m;
        hqaVar.h(i - i3, i2 - i3, charSequence);
    }

    public final void v() {
        this.w = null;
    }

    public final void w(hqe hqeVar, int i, int i2, int i3, int i4) {
        hqc hqcVar;
        if (this.u > 0 && (hqcVar = (hqc) this.o.pollLast()) != null) {
            hqcVar.a();
        }
        LinkedList linkedList = this.o;
        hqc hqcVar2 = (hqc) hqc.a.a();
        if (hqcVar2 == null) {
            hqcVar2 = new hqc();
        }
        hqcVar2.b = hqeVar;
        hqcVar2.c = i;
        hqcVar2.d = i2;
        hqcVar2.e = i3;
        hqcVar2.f = i4;
        linkedList.offer(hqcVar2);
    }

    public final boolean x(hqk hqkVar, int i) {
        return hqkVar == null || (hqkVar.b.length() - c()) + this.m < i;
    }

    public final boolean y(int i, boolean z) {
        if (i != 0) {
            return !this.k.f || z;
        }
        return false;
    }
}
