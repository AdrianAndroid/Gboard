package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ikp  reason: default package */
/* loaded from: classes.dex */
public final class ikp extends Enum implements ido {
    public static final ikp a;
    public static final ikp b;
    private static final /* synthetic */ ikp[] c;
    private final String d;

    static {
        ikp ikpVar = new ikp(null);
        a = ikpVar;
        ikp ikpVar2 = new ikp();
        b = ikpVar2;
        c = new ikp[]{ikpVar, ikpVar2};
    }

    private ikp() {
        this.d = "";
    }

    public static ikp[] values() {
        return (ikp[]) c.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    private ikp(byte[] bArr) {
        this.d = "PersonalDictionary.Open";
    }
}
