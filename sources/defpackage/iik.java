package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: iik  reason: default package */
/* loaded from: classes.dex */
public final class iik extends Enum implements ido {
    public static final iik a;
    public static final iik b;
    public static final iik c;
    public static final iik d;
    public static final iik e;
    private static final /* synthetic */ iik[] f;
    private final String g;

    static {
        iik iikVar = new iik("SEARCH_NETWORK_USAGE_UPSTREAM", 0);
        a = iikVar;
        iik iikVar2 = new iik("SEARCH_NETWORK_USAGE_DOWNSTREAM", 1);
        b = iikVar2;
        iik iikVar3 = new iik("HTTP_REQUEST_FINISHED", 2);
        c = iikVar3;
        iik iikVar4 = new iik("GRPC_REQUEST_FINISHED", 3);
        d = iikVar4;
        iik iikVar5 = new iik();
        e = iikVar5;
        f = new iik[]{iikVar, iikVar2, iikVar3, iikVar4, iikVar5};
    }

    private iik(String str, int i) {
        this.g = "";
    }

    public static iik[] values() {
        return (iik[]) f.clone();
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

    private iik() {
        this.g = "Network.Cronet.EngineInit";
    }
}
