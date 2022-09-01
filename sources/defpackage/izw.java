package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: izw  reason: default package */
/* loaded from: classes.dex */
public final class izw extends Enum implements ido {
    public static final izw a;
    private static final /* synthetic */ izw[] b;
    private final String c = "UFC.NumUnsatisfiedLink";

    static {
        izw izwVar = new izw();
        a = izwVar;
        b = new izw[]{izwVar};
    }

    private izw() {
    }

    public static izw[] values() {
        return (izw[]) b.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
