package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: gvd  reason: default package */
/* loaded from: classes.dex */
public final class gvd extends Enum implements ido {
    public static final gvd a;
    public static final gvd b;
    public static final gvd c;
    public static final gvd d;
    public static final gvd e;
    public static final gvd f;
    public static final gvd g;
    public static final gvd h;
    public static final gvd i;
    public static final gvd j;
    private static final /* synthetic */ gvd[] k;
    private final String l;

    static {
        gvd gvdVar = new gvd("BACKUP_EVENT", 0);
        a = gvdVar;
        gvd gvdVar2 = new gvd("BACKUP_RESTORE_ERROR", 1);
        b = gvdVar2;
        gvd gvdVar3 = new gvd("RESTORE_TIMES", 2);
        c = gvdVar3;
        gvd gvdVar4 = new gvd("RESTORE_RETRY_POSTPONED_HOURS", 3);
        d = gvdVar4;
        gvd gvdVar5 = new gvd();
        e = gvdVar5;
        gvd gvdVar6 = new gvd("BACKUP_FILES_SIZE", 5);
        f = gvdVar6;
        gvd gvdVar7 = new gvd("BACKUP_FILES_COMPRESSION_RATIO_PERCENT", 6);
        g = gvdVar7;
        gvd gvdVar8 = new gvd("BACKUP_RESTORE_INTERVAL", 7);
        h = gvdVar8;
        gvd gvdVar9 = new gvd("CLIENT_SIDE_ENCRYPTION", 8);
        i = gvdVar9;
        gvd gvdVar10 = new gvd("DEVICE_TO_DEVICE_TRANSFER", 9);
        j = gvdVar10;
        k = new gvd[]{gvdVar, gvdVar2, gvdVar3, gvdVar4, gvdVar5, gvdVar6, gvdVar7, gvdVar8, gvdVar9, gvdVar10};
    }

    private gvd(String str, int i2) {
        this.l = "";
    }

    public static gvd[] values() {
        return (gvd[]) k.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.l;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    private gvd() {
        this.l = "BackupAgent.backupFilesReady";
    }
}
