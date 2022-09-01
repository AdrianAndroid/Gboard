package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: jfa  reason: default package */
/* loaded from: classes.dex */
public final class jfa extends Enum implements ido {
    public static final jfa a;
    private static final /* synthetic */ jfa[] b;

    static {
        jfa jfaVar = new jfa();
        a = jfaVar;
        b = new jfa[]{jfaVar};
    }

    private jfa() {
    }

    public static jfa[] values() {
        return (jfa[]) b.clone();
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
