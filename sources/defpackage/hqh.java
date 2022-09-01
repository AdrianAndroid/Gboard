package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: hqh  reason: default package */
/* loaded from: classes.dex */
public final class hqh extends Enum implements ido {
    public static final hqh a;
    public static final hqh b;
    public static final hqh c;
    public static final hqh d;
    public static final hqh e;
    private static final /* synthetic */ hqh[] f;
    private final String g;

    static {
        hqh hqhVar = new hqh("IC_USE_INITIAL_SURROUNDING_TEXT", 0, "IC.InitialSurroundingText");
        a = hqhVar;
        hqh hqhVar2 = new hqh();
        b = hqhVar2;
        hqh hqhVar3 = new hqh("IC_GET_CURSOR_CAPS_MODE_FROM_CACHE", 2, "IC.CapsModeFromCache");
        c = hqhVar3;
        hqh hqhVar4 = new hqh("CONTEXT_CHANGED", 3, "IC.ContextChanged");
        d = hqhVar4;
        hqh hqhVar5 = new hqh("FIX_LYING_SELECTION_RANGE", 4, "IC.FixSelection");
        e = hqhVar5;
        f = new hqh[]{hqhVar, hqhVar2, hqhVar3, hqhVar4, hqhVar5};
    }

    private hqh() {
        this.g = "";
    }

    public static hqh[] values() {
        return (hqh[]) f.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.g;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    private hqh(String str, int i, String str2) {
        this.g = str2;
    }
}
