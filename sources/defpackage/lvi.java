package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: lvi  reason: default package */
/* loaded from: classes.dex */
public abstract class lvi {
    private static final lvi a = new lvc();

    public abstract int a();

    public abstract Object b(lty ltyVar);

    public abstract Set c();

    public abstract void d(luy luyVar, Object obj);

    public static lvi g(lur lurVar, lur lurVar2) {
        int b = lurVar2.b();
        return b == 0 ? a : b <= 28 ? new lvg(lurVar, lurVar2) : new lvh(lurVar, lurVar2);
    }
}
