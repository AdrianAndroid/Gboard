package defpackage;

/* compiled from: PG */
@Deprecated
/* renamed from: bnh  reason: default package */
/* loaded from: classes.dex */
public final class bnh {
    private static final boolean a = bng.a.a();

    static {
        bng.a.b();
    }

    @Deprecated
    public static void a() {
        if (!a) {
            return;
        }
        throw new bni();
    }

    @Deprecated
    public static void b(Throwable th) {
        if (!a) {
            return;
        }
        throw new bni(th);
    }
}
