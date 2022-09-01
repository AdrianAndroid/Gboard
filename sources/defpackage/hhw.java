package defpackage;

/* compiled from: PG */
/* renamed from: hhw  reason: default package */
/* loaded from: classes.dex */
public enum hhw implements ids {
    NOTIFY_FLAGS_CHANGED("Flag.BatchNotify.Time"),
    NOTIFY_ONE_FLAG_CHANGED("Flag.Notify.Time"),
    CLEAR_FLAG_VALUE_FROM_DATA_STORE("Flag.ClearPDS.Time"),
    CLEAR_FLAG_VALUE_FROM_SHARED_PREFERENCES("Flag.ClearSP.Time"),
    LOAD_FLAG_VALUE_FROM_DATA_STORE("Flag.LoadFromPDS.Time"),
    LOAD_FLAG_VALUE_FROM_SHARED_PREFERENCES("Flag.LoadFromSP.Time"),
    PERSIST_FLAGS_TO_DATA_STORE("Flag.BatchSaveToPDS.Time"),
    PERSIST_FLAGS_TO_SHARED_PREFERENCES("Flag.BatchSaveToSP.Time"),
    PERSIST_ONE_FLAG_TO_DATA_STORE("Flag.SaveToPDS.Time"),
    PERSIST_ONE_FLAG_TO_SHARED_PREFERENCES("Flag.SaveToSP.Time"),
    PHENOTYPE_FETCH_AND_UPDATE("ExperimentV3.PhenotypeFetchUpdate-time"),
    PHENOTYPE_HANDLE_CONFIGURATION_UPDATE("ExperimentV3.PhenotypeHandleConfigUpdate-time");
    
    private final String n;

    hhw(String str) {
        this.n = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.n;
    }
}
