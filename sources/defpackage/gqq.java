package defpackage;

/* compiled from: PG */
/* renamed from: gqq  reason: default package */
/* loaded from: classes.dex */
public class gqq implements ijg {
    public final int a;
    public final gqh b;
    public final boolean c;

    private gqq(int i, gqh gqhVar, boolean z) {
        this.a = i;
        this.b = gqhVar;
        this.c = z;
    }

    public static void b(int i, gqh gqhVar) {
        c(i, gqhVar, false);
    }

    public static void c(int i, gqh gqhVar, boolean z) {
        ijl.b().g(new gqq(i, gqhVar, z));
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }
}
