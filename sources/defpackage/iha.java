package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: iha  reason: default package */
/* loaded from: classes.dex */
public final class iha extends Enum implements ido {
    public static final iha a;
    private static final /* synthetic */ iha[] b;
    private final String c = "Input.action";

    static {
        iha ihaVar = new iha();
        a = ihaVar;
        b = new iha[]{ihaVar};
    }

    private iha() {
    }

    public static iha[] values() {
        return (iha[]) b.clone();
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
