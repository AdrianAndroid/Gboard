package defpackage;

/* compiled from: PG */
/* renamed from: gve  reason: default package */
/* loaded from: classes.dex */
public enum gve implements ids {
    KEY_VALUE_BACKUP_DURATION("BackupAgent.backup.keyValue-time"),
    KEY_VALUE_RESTORE_DURATION("BackupAgent.restore.keyValue-time");
    
    private final String d;

    gve(String str) {
        this.d = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }
}
