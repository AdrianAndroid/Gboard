package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ixv  reason: default package */
/* loaded from: classes.dex */
public final class ixv extends Enum implements ido {
    public static final ixv a;
    private static final /* synthetic */ ixv[] b;
    private final String c = "TPT.Kill.Type";

    static {
        ixv ixvVar = new ixv();
        a = ixvVar;
        b = new ixv[]{ixvVar};
    }

    private ixv() {
    }

    public static ixv[] values() {
        return (ixv[]) b.clone();
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
