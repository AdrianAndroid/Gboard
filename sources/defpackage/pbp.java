package defpackage;

/* compiled from: PG */
/* renamed from: pbp  reason: default package */
/* loaded from: classes2.dex */
public final class pbp {
    public static volatile pao h;
    static volatile pan a = new pbn();
    public static volatile pap e = new pbo();
    static volatile pao j = new pbm(7);
    public static volatile pap f = new pbo();
    public static volatile pao k = new pbm(8);
    public static volatile pap g = new pbo();
    public static volatile pao i = new pbm(9);
    static volatile pao l = new pbm(10);
    static volatile pao o = new pbm(11);
    static volatile pao m = new pbm(1);
    static volatile pao p = new pbm(0);
    public static volatile pao n = new pbm(2);
    static volatile pao q = new pbm(3);
    public static volatile pao b = new pbm(4);
    public static volatile pao c = new pbm(5);
    static volatile pao d = new pbm(6);

    public static Throwable a(Throwable th) {
        if (m != null) {
            pbq.a.b();
        }
        return th;
    }

    public static void b(Throwable th) {
        if (a != null) {
            try {
                pbq.a.c();
                return;
            } catch (Throwable th2) {
                System.err.println("The onError handler threw an Exception. It shouldn't. => ".concat(String.valueOf(th2.getMessage())));
                th2.printStackTrace();
                c(th2);
            }
        }
        c(th);
    }

    static void c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
