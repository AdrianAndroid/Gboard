package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ide  reason: default package */
/* loaded from: classes.dex */
public final class ide extends Enum implements idq {
    public static final ide a;
    public static final ide b;
    public static final ide c;
    private static final /* synthetic */ ide[] d;
    private final idq e;

    static {
        ide ideVar = new ide();
        a = ideVar;
        ide ideVar2 = new ide("INPUT_VIEW_SESSION", 1, ideVar);
        b = ideVar2;
        ide ideVar3 = new ide("IME_SESSION", 2, ideVar2);
        c = ideVar3;
        d = new ide[]{ideVar, ideVar2, ideVar3};
    }

    private ide() {
        this.e = null;
    }

    public static ide[] values() {
        return (ide[]) d.clone();
    }

    @Override // defpackage.idq
    public final idq a() {
        return this.e;
    }

    @Override // defpackage.idq
    public final /* synthetic */ void b() {
    }

    private ide(String str, int i, idq idqVar) {
        if (idqVar != null) {
            this.e = idqVar;
            return;
        }
        throw new IllegalArgumentException("Parent session type is null in constructor, please check if it has circular dependency issue.");
    }
}
