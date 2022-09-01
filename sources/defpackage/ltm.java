package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: ltm  reason: default package */
/* loaded from: classes.dex */
public abstract class ltm implements ltv, lum {
    private static final String a = new String();
    public final long b;
    private final Level d;
    public ltl c = null;
    private ltp e = null;
    private lvo f = null;
    private Object[] g = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public ltm(Level level) {
        long b = lvl.b();
        lxj.b(level, "level");
        this.d = level;
        this.b = b;
    }

    private final void ab(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof lth) {
                objArr[i] = ((lth) obj).a();
            }
        }
        if (str != a) {
            this.f = new lvo(a(), str);
        }
        lwt k = lvl.k();
        if (!k.a()) {
            lwt lwtVar = (lwt) m().d(ltk.f);
            if (lwtVar != null && !lwtVar.a()) {
                k = k.a() ? lwtVar : new lwt(new lwr(k.c, lwtVar.c));
            }
            r(ltk.f, k);
        }
        ltb c = c();
        try {
            lxh lxhVar = (lxh) lxh.a.get();
            int i2 = lxhVar.b + 1;
            lxhVar.b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            if (i2 <= 100) {
                c.a.b(this);
            } else {
                ltb.f("unbounded recursion in log statement", this);
            }
            if (lxhVar == null) {
                return;
            }
            lxhVar.close();
        } catch (RuntimeException e) {
            try {
                c.a.e(e, this);
            } catch (luo e2) {
                throw e2;
            } catch (RuntimeException e3) {
                ltb.f(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean ac() {
        if (this.e == null) {
            this.e = lvl.g().a(ltm.class, 1);
        }
        ltp ltpVar = this.e;
        if (ltpVar != ltp.a) {
            ltl ltlVar = this.c;
            if (ltlVar != null && ltlVar.b > 0) {
                lxj.b(ltpVar, "logSiteKey");
                int i = ltlVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (ltk.d.equals(ltlVar.c(i2))) {
                        Object e = ltlVar.e(i2);
                        if (!(e instanceof ltw)) {
                            ltpVar = new ltz(ltpVar, e);
                        } else {
                            ltpVar = ((ltw) e).b();
                        }
                    }
                }
            }
        } else {
            ltpVar = null;
        }
        return b(ltpVar);
    }

    @Override // defpackage.ltv
    public final void A(String str, int i, boolean z) {
        if (ac()) {
            ab(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ltv
    public final void B(String str, long j, long j2) {
        if (ac()) {
            ab(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // defpackage.ltv
    public final void C(String str, long j, Object obj) {
        if (ac()) {
            ab(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.ltv
    public final void D(String str, Object obj, float f) {
        if (ac()) {
            ab(str, obj, Float.valueOf(f));
        }
    }

    @Override // defpackage.ltv
    public final void E(String str, Object obj, int i) {
        if (ac()) {
            ab(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ltv
    public final void F(String str, Object obj, long j) {
        if (ac()) {
            ab(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.ltv
    public final void G(String str, Object obj, Object obj2) {
        if (ac()) {
            ab(str, obj, obj2);
        }
    }

    @Override // defpackage.ltv
    public final void H(String str, Object obj, boolean z) {
        if (ac()) {
            ab(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ltv
    public final void I(String str, boolean z, boolean z2) {
        if (ac()) {
            ab(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.ltv
    public final void J(String str, Object obj, Object obj2, Object obj3) {
        if (ac()) {
            ab(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.ltv
    public final void K(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.ltv
    public final void L(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.ltv
    public final void M(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.ltv
    public final void N(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.ltv
    public final void O(String str, Object[] objArr) {
        if (ac()) {
            ab(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.ltv
    public final boolean P() {
        return Q() || c().g(this.d);
    }

    @Override // defpackage.lum
    public final boolean Q() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(ltk.e));
    }

    @Override // defpackage.lum
    public final Object[] R() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.ltv
    public final void S(float f, int i) {
        if (ac()) {
            ab("The calculated scale %s is still too big for the view-width %s", Float.valueOf(f), Integer.valueOf(i));
        }
    }

    @Override // defpackage.ltv
    public final void T(float f, Object obj) {
        if (ac()) {
            ab("animateTo: to: %s, duration: %s", Float.valueOf(f), obj);
        }
    }

    @Override // defpackage.ltv
    public final void U(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (ac()) {
            ab("Ctor: nativeAudioInput = %d chunkSizeMs=%d source=%d sampleRate=%d channels=%d bytesPerSample=%d dspCaptureSession=%d isLoopbackSession=%b allowNonBlockingApiUse=%b", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // defpackage.ltv
    public final void V(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (ac()) {
            ab("realScreenHeight: %d screenHeightInInches: %f\nkeyboardHolderHeight: %d navigationHeight: %d\ngetKeyboardBodyViewHolderPaddingBottom(): %d getKeyboardBottomGapFromScreen(): %d\nkeyboardBottomGap: %d bodyViewHolderBottomPadding: %d\ndecorViewStableInsetBottom: %d updated: %b", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // defpackage.ltv
    public final void W(int i, long j) {
        if (ac()) {
            ab("%d files were deleted to commit the reservation, total size: %d bytes", Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.ltv
    public final void X(long j, int i) {
        if (ac()) {
            ab("Sharing notice not show, [max display: %d, actual display: %d].", Long.valueOf(j), Integer.valueOf(i));
        }
    }

    @Override // defpackage.ltv
    public final void Y(long j, boolean z) {
        if (ac()) {
            ab("Acquire InputContextLock takes %d ms, mainThreadForSure=%s.", Long.valueOf(j), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ltv
    public final void Z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (ac()) {
            ab("Download stopped: %s, %s%s%s%s%s%s, size: %s", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    protected abstract lxc a();

    @Override // defpackage.ltv
    public final void aa(boolean z, Object obj) {
        if (ac()) {
            ab("getSlices() : ForceUpdates = %b : LanguageTags = %s", Boolean.valueOf(z), obj);
        }
    }

    protected boolean b(ltq ltqVar) {
        throw null;
    }

    protected abstract ltb c();

    protected abstract ltv d();

    @Override // defpackage.lum
    public final long e() {
        return this.b;
    }

    @Override // defpackage.lum
    public final ltp f() {
        ltp ltpVar = this.e;
        if (ltpVar != null) {
            return ltpVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.ltv
    public final ltv g(int i, TimeUnit timeUnit) {
        if (Q()) {
            return d();
        }
        r(ltk.c, ltt.a(i, timeUnit));
        return d();
    }

    @Override // defpackage.ltv
    public final ltv h(lty ltyVar, Object obj) {
        lxj.b(ltyVar, "metadata key");
        if (obj != null) {
            r(ltyVar, obj);
        }
        return d();
    }

    @Override // defpackage.ltv
    public final ltv i(Throwable th) {
        return h(ltk.a, th);
    }

    @Override // defpackage.ltv
    public final ltv j(ltp ltpVar) {
        if (this.e == null) {
            this.e = ltpVar;
        }
        return d();
    }

    @Override // defpackage.ltv
    public final ltv k(String str, String str2, int i, String str3) {
        return j(ltp.e(str, str2, i, str3));
    }

    @Override // defpackage.ltv
    public final ltv l(lub lubVar) {
        lxj.b(lubVar, "stack size");
        if (lubVar != lub.NONE) {
            r(ltk.g, lubVar);
        }
        return d();
    }

    @Override // defpackage.lum
    public final lur m() {
        ltl ltlVar = this.c;
        return ltlVar != null ? ltlVar : luq.a;
    }

    @Override // defpackage.lum
    public final lvo n() {
        return this.f;
    }

    @Override // defpackage.lum
    public final Object o() {
        if (this.f != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        return this.g[0];
    }

    @Override // defpackage.lum
    public final String p() {
        return c().a.d();
    }

    @Override // defpackage.lum
    public final Level q() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(lty ltyVar, Object obj) {
        int a2;
        if (this.c == null) {
            this.c = new ltl();
        }
        ltl ltlVar = this.c;
        if (ltyVar.b || (a2 = ltlVar.a(ltyVar)) == -1) {
            int i = ltlVar.b + 1;
            Object[] objArr = ltlVar.a;
            int length = objArr.length;
            if (i + i > length) {
                ltlVar.a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = ltlVar.a;
            int i2 = ltlVar.b;
            lxj.b(ltyVar, "metadata key");
            objArr2[i2 + i2] = ltyVar;
            Object[] objArr3 = ltlVar.a;
            int i3 = ltlVar.b;
            lxj.b(obj, "metadata value");
            objArr3[i3 + i3 + 1] = obj;
            ltlVar.b++;
            return;
        }
        Object[] objArr4 = ltlVar.a;
        lxj.b(obj, "metadata value");
        objArr4[a2 + a2 + 1] = obj;
    }

    @Override // defpackage.ltv
    public final void s() {
        if (ac()) {
            ab(a, "");
        }
    }

    @Override // defpackage.ltv
    public final void t(String str) {
        if (ac()) {
            ab(a, str);
        }
    }

    @Override // defpackage.ltv
    public final void u(String str, int i) {
        if (ac()) {
            ab(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ltv
    public final void v(String str, long j) {
        if (ac()) {
            ab(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.ltv
    public final void w(String str, Object obj) {
        if (ac()) {
            ab(str, obj);
        }
    }

    @Override // defpackage.ltv
    public final void x(String str, float f, float f2) {
        if (ac()) {
            ab(str, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    @Override // defpackage.ltv
    public final void y(String str, int i, int i2) {
        if (ac()) {
            ab(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.ltv
    public final void z(String str, int i, Object obj) {
        if (ac()) {
            ab(str, Integer.valueOf(i), obj);
        }
    }
}
