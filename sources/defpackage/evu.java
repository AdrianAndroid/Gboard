package defpackage;

/* compiled from: PG */
/* renamed from: evu  reason: default package */
/* loaded from: classes.dex */
public enum evu implements ido {
    POLICY_CONFIG_VERSION("Ekho.PolicyConfigVersion"),
    TOTAL_SIZE_KB("Ekho.TotalSizeKb"),
    CLEANUP_CYCLE_LENGTH("Ekho.Cleanup.CycleLength"),
    CLEANUP_NUM_EVENTS_CACHED("Ekho.Cleanup.NumEventsCached"),
    CLEANUP_NUM_EVENTS_DELETED("Ekho.Cleanup.NumEventsDeleted"),
    CLEANUP_NUM_BYTES_CACHED("Ekho.Cleanup.NumBytesCached"),
    CLEANUP_NUM_BYTES_DELETED("Ekho.Cleanup.NumBytesDeleted"),
    CLEANUP_START("Ekho.Cleanup.Start"),
    CLEANUP_DONE("Ekho.Cleanup.Done"),
    CLEAR_START("Ekho.Clear.Start"),
    CLEAR_DONE("Ekho.Clear.Done"),
    RECORD_STATS_START("Ekho.RecordStats.Start"),
    RECORD_STATS_DONE("Ekho.RecordStats.Done");
    
    private final String o;

    evu(String str) {
        this.o = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.o;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
