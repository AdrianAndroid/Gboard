package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dmb  reason: default package */
/* loaded from: classes.dex */
public final class dmb extends Enum implements ido {
    public static final dmb a;
    private static final /* synthetic */ dmb[] b;

    static {
        dmb dmbVar = new dmb();
        a = dmbVar;
        b = new dmb[]{dmbVar};
    }

    private dmb() {
    }

    public static dmb[] values() {
        return (dmb[]) b.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
