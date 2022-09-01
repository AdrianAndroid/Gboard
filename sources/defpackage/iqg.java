package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: iqg  reason: default package */
/* loaded from: classes.dex */
public abstract class iqg implements AutoCloseable {
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager");
    private final lfb c;
    private final boolean d;
    private final iqj e;
    private final int g;
    public final AtomicReference a = new AtomicReference(null);
    private final hhk f = new ffp(this, 7);

    public iqg(lfb lfbVar, iqj iqjVar, int i) {
        this.c = lfbVar;
        this.e = iqjVar;
        this.g = i;
        this.d = !lfbVar.e();
    }

    private final iqf a(String str) {
        List k = this.e.c.k(str);
        if (k.isEmpty()) {
            int i = this.g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                return iqf.a;
            }
            if (i2 == 2) {
                return iqf.b;
            }
            throw new IllegalStateException("The flag is not allowed to be empty");
        }
        if (k.size() == 1) {
            String str2 = (String) lre.ad(k);
            if (f(str2)) {
                return iqf.a;
            }
            if (e(str2)) {
                return iqf.b;
            }
        }
        lmx g = lmz.g();
        lmx g2 = lmz.g();
        Iterator it = k.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                String str3 = (String) it.next();
                if (!f(str3) && !e(str3)) {
                    if (str3.charAt(0) == '-') {
                        str3 = str3.substring(1);
                    } else {
                        z = true;
                    }
                    try {
                        (true != z ? g2 : g).d(b(str3));
                    } catch (Exception e) {
                        ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 265, "FlagRestrictionManager.java")).w("failed to parse %s", str3);
                    }
                }
            } else {
                return new iqf(false, false, g.g(), g2.g());
            }
        }
    }

    private static boolean e(String str) {
        return str.length() == 1 && str.charAt(0) == '-';
    }

    private static boolean f(String str) {
        return str.length() == 1 && str.charAt(0) == '*';
    }

    public abstract Object b(String str);

    public abstract boolean c(Object obj);

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.d && this.c.e()) {
            ((hhl) this.c.a()).g(this.f);
        }
    }

    public abstract boolean d(Object obj, lmz lmzVar);

    public final void h(String str) {
        if (!this.d) {
            throw new IllegalStateException("Cannot set flag values manually when observing experiment flags");
        }
        this.a.set(a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (this.d) {
            throw new IllegalStateException("Cannot observe flag changes in manual mode");
        }
        if (!this.c.e()) {
            return;
        }
        ((hhl) this.c.a()).e(this.f);
    }

    public final boolean j(Object obj) {
        String str;
        if (c(obj)) {
            iqf iqfVar = (iqf) this.a.get();
            if (iqfVar == null) {
                if (this.c.e()) {
                    str = (String) ((hhl) this.c.a()).c();
                } else {
                    ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "getRawFlag", 221, "FlagRestrictionManager.java")).t("Not initialized with #setFlag(). Defaulting to empty.");
                    str = "";
                }
                iqfVar = a(str);
                this.a.set(iqfVar);
            }
            if (iqfVar.c) {
                return true;
            }
            if (iqfVar.d || d(obj, iqfVar.f)) {
                return false;
            }
            if (d(obj, iqfVar.e)) {
                return true;
            }
            if (!iqfVar.f.isEmpty()) {
                return iqfVar.e.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean k(Iterable iterable) {
        return lre.ah(iterable, new ein(this, 20));
    }
}
