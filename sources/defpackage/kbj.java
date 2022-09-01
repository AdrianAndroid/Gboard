package defpackage;

/* compiled from: PG */
/* renamed from: kbj  reason: default package */
/* loaded from: classes.dex */
public final class kbj {
    public static final kbj b;
    public static volatile kbj d;
    public final kbk e;
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/Primes");
    public static volatile boolean c = true;

    static {
        kbj kbjVar = new kbj(new kbi());
        b = kbjVar;
        d = kbjVar;
    }

    public kbj(kbk kbkVar) {
        this.e = kbkVar;
    }

    public static synchronized void a(opu opuVar) {
        synchronized (kbj.class) {
            if (d == b) {
                if (!kki.l()) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/libraries/performance/primes/Primes", "initialize", 116, "Primes.java")).t("Primes.initialize() should only be called from the main thread.");
                }
                d = (kbj) opuVar.a;
            }
        }
    }
}
