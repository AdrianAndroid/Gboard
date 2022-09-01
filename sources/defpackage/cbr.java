package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cbr  reason: default package */
/* loaded from: classes.dex */
public final class cbr implements Runnable {
    private final msf b;
    private final mrw c;
    private final msh d;
    private final boolean e;
    private final ifn f;
    private final long g;
    private final long h;
    private final /* synthetic */ int k;
    private final Object l;
    private boolean j = false;
    private boolean i = false;
    public boolean a = false;

    public cbr(cbp cbpVar, mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar, int i) {
        this.k = i;
        this.l = cbpVar;
        this.c = mrwVar;
        this.b = msfVar;
        this.d = mshVar;
        this.e = z;
        this.g = j;
        this.h = j2;
        this.f = ifnVar;
    }

    public cbr(cbs cbsVar, mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar, int i) {
        this.k = i;
        this.l = cbsVar;
        this.c = mrwVar;
        this.b = msfVar;
        this.d = mshVar;
        this.e = z;
        this.g = j;
        this.h = j2;
        this.f = ifnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.k != 0 ? !this.i : !this.i;
    }

    public final void a() {
        int i = this.k;
        this.j = true;
        if (i != 0) {
            run();
        } else {
            run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.k == 0) {
            boolean L = ((cbs) this.l).L(this.c, this.b, this.d, this.e, this.g, this.h, this.f);
            if (L && this.b == msf.OPERATION_DECODE_GESTURE_END) {
                ((cbs) this.l).u(false);
            }
            if (L && this.b == msf.OPERATION_FETCH_SUGGESTIONS) {
                ((cbs) this.l).v(false);
            }
            this.a = L;
            this.i = true;
            if (this.j) {
                return;
            }
            if (this.b == msf.OPERATION_DECODE_GESTURE_END) {
                cbs cbsVar = (cbs) this.l;
                if (!cbsVar.e) {
                    return;
                }
                cbsVar.a.hO().e(cap.WAIT_FOR_DECODE_GESTURE, true, Boolean.valueOf(L));
                cbsVar.e = false;
            } else if (this.b != msf.OPERATION_FETCH_SUGGESTIONS) {
            } else {
                cbs cbsVar2 = (cbs) this.l;
                if (!cbsVar2.f) {
                    return;
                }
                cbsVar2.a.hO().e(cap.WAIT_FOR_FETCH_SUGGESTIONS, true, Boolean.valueOf(L));
                cbsVar2.f = false;
            }
        } else if (this.i) {
            ((ltd) ((ltd) cbp.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV3$ApplyDiffRunnable", "run", 764, "InputContextProxyV3.java")).t("ApplyDiffRunnable has already run");
        } else {
            this.a = ((cbp) this.l).L(this.c, this.b, this.d, this.e, this.g, this.h, this.f);
            this.i = true;
            if (this.j) {
                return;
            }
            if (this.b == msf.OPERATION_DECODE_GESTURE_END) {
                Object obj = this.l;
                boolean z = this.a;
                cbp cbpVar = (cbp) obj;
                if (!cbpVar.f) {
                    return;
                }
                cbpVar.b.hO().e(cap.WAIT_FOR_DECODE_GESTURE, true, Boolean.valueOf(z));
                cbpVar.f = false;
            } else if (this.b != msf.OPERATION_FETCH_SUGGESTIONS) {
            } else {
                Object obj2 = this.l;
                boolean z2 = this.a;
                cbp cbpVar2 = (cbp) obj2;
                if (!cbpVar2.g) {
                    return;
                }
                cbpVar2.b.hO().e(cap.WAIT_FOR_FETCH_SUGGESTIONS, true, Boolean.valueOf(z2));
                cbpVar2.g = false;
            }
        }
    }
}
