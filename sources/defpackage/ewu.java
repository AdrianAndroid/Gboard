package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ewu  reason: default package */
/* loaded from: classes.dex */
public final class ewu extends Enum implements ido {
    public static final ewu a;
    private static final /* synthetic */ ewu[] b;
    private final String c = "Federation.Speech.Status";

    static {
        ewu ewuVar = new ewu();
        a = ewuVar;
        b = new ewu[]{ewuVar};
    }

    private ewu() {
    }

    public static ewu[] values() {
        return (ewu[]) b.clone();
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
