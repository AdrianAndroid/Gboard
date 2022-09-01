package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: cjk  reason: default package */
/* loaded from: classes.dex */
public final class cjk extends Enum implements ids {
    public static final cjk a;
    public static final cjk b;
    public static final cjk c;
    private static final /* synthetic */ cjk[] d;
    private final int e = 50;

    static {
        cjk cjkVar = new cjk();
        a = cjkVar;
        cjk cjkVar2 = new cjk("BITMOJI_CACHE_BATCH_UPDATE", 1);
        b = cjkVar2;
        cjk cjkVar3 = new cjk("BITMOJI_CACHE_SINGLE_UPDATE", 2);
        c = cjkVar3;
        d = new cjk[]{cjkVar, cjkVar2, cjkVar3};
    }

    private cjk(String str, int i) {
    }

    public static cjk[] values() {
        return (cjk[]) d.clone();
    }

    @Override // defpackage.idt
    public final int a() {
        return this.e;
    }

    @Override // defpackage.idt
    public final /* synthetic */ String b() {
        return "";
    }

    private cjk() {
    }
}
