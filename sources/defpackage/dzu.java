package defpackage;

/* compiled from: PG */
/* renamed from: dzu  reason: default package */
/* loaded from: classes.dex */
public abstract class dzu implements ijg {
    public static void d(dat datVar) {
        mhd h = h();
        h.a = 1;
        h.d(datVar);
        i(h.c());
    }

    public static void e(dat datVar) {
        mhd h = h();
        h.a = 3;
        h.d(datVar);
        i(h.c());
    }

    public static void f() {
        mhd h = h();
        h.a = 4;
        i(h.c());
    }

    public static void g() {
        mhd h = h();
        h.a = 2;
        i(h.c());
    }

    static mhd h() {
        mhd mhdVar = new mhd(null, null);
        mhdVar.d(dat.a);
        return mhdVar;
    }

    private static void i(dzu dzuVar) {
        ijl.b().g(dzuVar);
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    public abstract dat b();

    public abstract int c();
}
