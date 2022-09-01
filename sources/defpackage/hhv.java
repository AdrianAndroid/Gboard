package defpackage;

/* compiled from: PG */
/* renamed from: hhv  reason: default package */
/* loaded from: classes.dex */
public enum hhv implements ido {
    CONCURRENT_MODIFICATION_EXCEPTION_WHEN_NOTIFY_OBSERVERS,
    FETCH_FLAGS("Experiment.FetchFlags"),
    RECEIVE_FLAG_UPDATE_BROADCAST,
    CLEAN_UP_BACKED_FLAG("Experiment.CleanUpFlags"),
    SKIP_FETCH_FLAGS("Experiment.SkipFetchFlags"),
    LOAD_FROM_DISK_COUNT("Experiment.FlagCountLoadFromDisk"),
    READ_TIMESTAMP_ERROR("ExperimentV4.ErrorReadLong"),
    UPDATE_EXP_CONFIG("ExperimentV4.UpdateConfig");
    
    private final String j;

    hhv() {
        this.j = "";
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.j;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }

    hhv(String str) {
        this.j = str;
    }
}
