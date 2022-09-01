package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bsa  reason: default package */
/* loaded from: classes.dex */
public final class bsa extends Enum implements ido {
    public static final bsa a;
    private static final /* synthetic */ bsa[] b;

    static {
        bsa bsaVar = new bsa();
        a = bsaVar;
        b = new bsa[]{bsaVar};
    }

    private bsa() {
    }

    public static bsa[] values() {
        return (bsa[]) b.clone();
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
