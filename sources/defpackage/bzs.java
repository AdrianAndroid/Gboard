package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bzs  reason: default package */
/* loaded from: classes.dex */
public final class bzs extends Enum implements ido {
    public static final bzs a;
    public static final bzs b;
    public static final bzs c;
    public static final bzs d;
    public static final bzs e;
    public static final bzs f;
    public static final bzs g;
    public static final bzs h;
    public static final bzs i;
    public static final bzs j;
    public static final bzs k;
    public static final bzs l;
    public static final bzs m;
    public static final bzs n;
    public static final bzs o;
    public static final bzs p;
    public static final bzs q;
    public static final bzs r;
    public static final bzs s;
    public static final bzs t;
    public static final bzs u;
    private static final /* synthetic */ bzs[] v;
    private final String w;

    static {
        bzs bzsVar = new bzs();
        a = bzsVar;
        bzs bzsVar2 = new bzs("FOREGROUND_DOWNLOAD", 1);
        b = bzsVar2;
        bzs bzsVar3 = new bzs("SUPERPACKS_SUPERPACK_CANCELLED", 2);
        c = bzsVar3;
        bzs bzsVar4 = new bzs("SUPERPACKS_SCHEDULING_FAILURE", 3);
        d = bzsVar4;
        bzs bzsVar5 = new bzs("SUPERPACKS_STATE_PERSISTENCE_FAILURE", 4);
        e = bzsVar5;
        bzs bzsVar6 = new bzs("SUPERPACKS_ASSET_LISTING_FAILURE", 5);
        f = bzsVar6;
        bzs bzsVar7 = new bzs("SUPERPACKS_DOWNLOAD_SCHEDULED", 6);
        g = bzsVar7;
        bzs bzsVar8 = new bzs("SUPERPACKS_DOWNLOAD_CANCELLED", 7);
        h = bzsVar8;
        bzs bzsVar9 = new bzs("SUPERPACKS_DOWNLOAD_STARTED", 8);
        i = bzsVar9;
        bzs bzsVar10 = new bzs("SUPERPACKS_DOWNLOAD_PAUSED", 9);
        j = bzsVar10;
        bzs bzsVar11 = new bzs("SUPERPACKS_DOWNLOAD_RESUMED", 10);
        k = bzsVar11;
        bzs bzsVar12 = new bzs("SUPERPACKS_DOWNLOAD_COMPLETED", 11);
        l = bzsVar12;
        bzs bzsVar13 = new bzs("SUPERPACKS_DOWNLOAD_FAILED", 12);
        m = bzsVar13;
        bzs bzsVar14 = new bzs("SUPERPACKS_VALIDATION_FAILURE", 13);
        n = bzsVar14;
        bzs bzsVar15 = new bzs("SUPERPACKS_UNPACKING_FAILURE", 14);
        o = bzsVar15;
        bzs bzsVar16 = new bzs("SUPERPACKS_PACK_USED", 15);
        p = bzsVar16;
        bzs bzsVar17 = new bzs("SUPERPACKS_PACK_DELETED", 16);
        q = bzsVar17;
        bzs bzsVar18 = new bzs("SUPERPACKS_MANIFEST_PARSING_FAILURE", 17);
        r = bzsVar18;
        bzs bzsVar19 = new bzs("SUPERPACKS_DOWNLOAD_SCHEDULING_FAILURE", 18);
        s = bzsVar19;
        bzs bzsVar20 = new bzs("SUPERPACKS_SUPERPACK_RELEASED", 19);
        t = bzsVar20;
        bzs bzsVar21 = new bzs("SUPERPACKS_SUPERPACK_RELEASE_FAILURE", 20);
        u = bzsVar21;
        v = new bzs[]{bzsVar, bzsVar2, bzsVar3, bzsVar4, bzsVar5, bzsVar6, bzsVar7, bzsVar8, bzsVar9, bzsVar10, bzsVar11, bzsVar12, bzsVar13, bzsVar14, bzsVar15, bzsVar16, bzsVar17, bzsVar18, bzsVar19, bzsVar20, bzsVar21};
    }

    private bzs(String str, int i2) {
        this.w = "";
    }

    public static bzs[] values() {
        return (bzs[]) v.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.w;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    private bzs() {
        this.w = "SuperpacksManager.usingDownloadFetcher";
    }
}
