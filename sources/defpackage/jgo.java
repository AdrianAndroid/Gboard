package defpackage;

/* compiled from: PG */
/* renamed from: jgo  reason: default package */
/* loaded from: classes.dex */
public abstract class jgo {
    private static final ThreadLocal a = new jgl();

    public static jgo c() {
        return (jgo) a.get();
    }

    public abstract void a(jgm jgmVar);

    public abstract void b(jgm jgmVar);
}
